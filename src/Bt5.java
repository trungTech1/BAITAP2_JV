import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result=0;
        int number1,number2;
        do{
            System.out.println("hay nhap vao so thu nhat");
             number1 = scanner.nextInt();
            System.out.println("hay nhap so thu hai");
             number2 = scanner.nextInt();
            if (number2 <= number1) {
                System.out.println("Số thứ hai phải lớn hơn số thứ nhất. Vui lòng nhập lại.");
            }
        }while (number2 <= number1);
for (int i = number1; i <= number2; i++){
    if(i % 2 == 0){
        result += i;
    }
}
        System.out.println(String.format("Tong cac so chan tu %d den %d la %d",number1,number2,result));
    }
}
