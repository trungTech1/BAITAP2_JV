import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật.");
            System.out.println("2. Tính chu vi và diện tích hình tam giác.");
            System.out.println("3. Tính chu vi và diện tích hình tròn.");
            System.out.println("4. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài hình chữ nhật: ");
                    double lengthRectangle = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng hình chữ nhật: ");
                    double widthRectangle = scanner.nextDouble();
                    double perimeterRectangle = 2 * (lengthRectangle + widthRectangle);
                    double areaRectangle = lengthRectangle * widthRectangle;
                    System.out.println("Chu vi của hình chữ nhật là: " + perimeterRectangle);
                    System.out.println("Diện tích của hình chữ nhật là: " + areaRectangle);
                    break;
                case 2:
                    System.out.print("Nhập cạnh a của tam giác: ");
                    double sideA = scanner.nextDouble();
                    System.out.print("Nhập cạnh b của tam giác: ");
                    double sideB = scanner.nextDouble();
                    System.out.print("Nhập cạnh c của tam giác: ");
                    double sideC = scanner.nextDouble();
                    double perimeterTriangle = sideA + sideB + sideC;
                    double halfPerimeter = perimeterTriangle / 2;
                    double areaTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
                    System.out.println("Chu vi của tam giác là: " + perimeterTriangle);
                    System.out.println("Diện tích của tam giác là: " + areaTriangle);
                    break;
                case 3:
                    final double PI = 3.14;
                    System.out.print("Nhập bán kính của hình tròn: ");
                    double radius = scanner.nextDouble();
                    double perimeterCircle = 2 * PI * radius;
                    double areaCircle = PI * Math.pow(radius, 2);
                    System.out.println("Chu vi của hình tròn là: " + perimeterCircle);
                    System.out.println("Diện tích của hình tròn là: " + areaCircle);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
        System.out.println("Kết thúc chương trình.");
    }
}
