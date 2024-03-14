import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.println("Nhập độ dài các cạnh của tam giác:");
            System.out.print("Cạnh thứ nhất: ");
            side1 = scanner.nextDouble();
            System.out.print("Cạnh thứ hai: ");
            side2 = scanner.nextDouble();
            System.out.print("Cạnh thứ ba: ");
            side3 = scanner.nextDouble();

            if (isValidTriangle(side1, side2, side3)) {
                double perimeter = side1 + side2 + side3;
                double s = perimeter / 2;
                double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

                System.out.println("Tam giác có chu vi là: " + perimeter);
                System.out.println("Tam giác có diện tích là: " + area);
                break;
            } else {
                System.out.println("Ba cạnh không tạo thành một tam giác. Vui lòng nhập lại.");
            }
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 > 0 && side2 > 0 && side3 > 0 &&
                side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }
}
