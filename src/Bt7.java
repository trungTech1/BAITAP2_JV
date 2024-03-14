
import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhap vao so so nguyen to ban can");
        int required = Integer.parseInt(sc.nextLine());
        int current = 0;
        while(count < required) {
            if (isPrime(current)) {
                count++;
                System.out.println(current);
            };
            current++;
        };
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}