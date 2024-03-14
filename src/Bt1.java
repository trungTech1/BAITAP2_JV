import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Hay nhap 1 so bat ky tu 0-9");
            number = scanner.nextInt();
            if( number < 0 || number > 9) {
                System.out.println("So khong hop le hay nhap lai");
            }
        }while (number < 0 || number > 9);
        switch (number){
            case 1:
                System.out.println("So Mot");
                break;
            case 2:
                System.out.println("So Hai");
                break;
            case 3:
                System.out.println("So Ba");
                break;
            case 4:
                System.out.println("So Bon");
                break;
            case 5:
                System.out.println("So Nam");
                break;
            case 6:
                System.out.println("So Sau");
                break;
            case 7:
                System.out.println("So Bay");
                break;
            case 8:
                System.out.println("So Tam");
                break;
            case 9:
                System.out.println("So Chin");
                break;
            default:
                System.out.println("Ban da nhap sai vui long nhap lai");
                break;
        }
    }
}
