package Array;

import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] Arr = {6, 2, 6, 4, 5, 6, 7};
        System.out.println("Hay nhap vao so can dem");
        int number = scanner.nextInt();
        int count = 0;
        for (int item : Arr) {
            if (item == number) {
                count++;
            }
        }
        System.out.println(String.format("So luong xuat hien cua so %d la %d",number,count));
    }
}
