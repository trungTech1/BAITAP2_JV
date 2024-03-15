package Array;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        //b1:cho nguoi dung nhap vao mang 2 chieu
        //b2: khoi tao mang
        //b3: gan min = arr [0][0]
        //b4: duyet qua tung phan tu cua mang va so sanh min
        //b5: in ra min va vi tri trong mangg
        byte[][] arr = getArrUser();
        int min = arr[0][0];
        for (byte[] row:arr) {
            for (byte item :row) {
                if (min > item) {
                    min = item;
                }
            }
        }
        System.out.println(String.format("Phan tu nho nhat trong mang la %d",min));
    }
    static byte[][] getArrUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so dong");
        int row = scanner.nextInt();
        System.out.println("Vui long nhap so cot");
        int col = scanner.nextInt();
        byte[][] newArr = new byte[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Vui long nhap phan tu cua mang");
                newArr[i][j] = scanner.nextByte();
            }
        }
        return newArr;
    }
}
