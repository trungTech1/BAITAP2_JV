package Array;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
      byte arr [][] = getByArrUser();
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for(int i =0 ; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++ ){
                if(max < arr[i][j]){
                    max = arr [i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println(String.format("So lon nhat trong mang la %d va o vi tri dong %d cot %d",max,maxRow+1,maxCol+1));

    }
    static byte[][] getByArrUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so cot cua mang");
        int col = scanner.nextInt();
        System.out.println("Hay nhap so dong cua mang");
        int row = scanner.nextInt();
        byte[][] newArr = new byte[row][col];
        System.out.println("Hay nhap cac phan tu cua mang");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newArr[i][j] = scanner.nextByte();
            }
        }
        return newArr;
    }
}
