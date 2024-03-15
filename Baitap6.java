package Array;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[][] arr = getArrUser();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(String.format("%d ",arr[i][j]));
            }
            System.out.println();
        }
        int col;
        while (true){
            System.out.println("Vui long nhap cot can tinh tong");
            col = scanner.nextInt();
            int sum = 0;
            if(col < 0 || col > arr[0].length){
                System.out.println("So cot khong hop le");
            }else {
                for (int i=0; i< arr.length; i++){
                    sum += arr[i][col];
                }
                System.out.println("Tong cua cot " + col + " la: " + sum);
                break;
            }

        }

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