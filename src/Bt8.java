
import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Kiểm tra tính chẵn lẻ của một số.");
            System.out.println("2. Kiểm tra số nguyên tố.");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không.");
            System.out.println("4. Thoát.");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int number = scanner.nextInt();
                    if (number % 2 == 0) {
                        System.out.println(number + " là số chẵn.");
                    } else {
                        System.out.println(number + " là số lẻ.");
                    }
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int num = scanner.nextInt();
                    if (isPrime(num)) {
                        System.out.println(num + " là số nguyên tố.");
                    } else {
                        System.out.println(num + " không là số nguyên tố.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra: ");
                    int num3 = scanner.nextInt();
                    if (num3 % 3 == 0) {
                        System.out.println(num3 + " chia hết cho 3.");
                    } else {
                        System.out.println(num3 + " không chia hết cho 3.");
                    }
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

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
