import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so bat ky");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0 ){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Chỉ chia hết cho 3");
        } else if (number % 3 != 0 && number % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        }else {
            System.out.println("Không chia hết cho 3 , cũng không chia hết cho 5");
        }
    }
}
