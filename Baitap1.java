package Array;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] newArr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("chuong trinh xoa so");
        int number = getInputUser(newArr);
        if (isValid(newArr, number)) {
            newArr = deleteNumber(newArr, number);
            System.out.println("Đã xóa số " + number + " khỏi mảng.");
            System.out.println("Mảng sau khi xóa: " + convertArrayToString(newArr));
        } else {
            System.out.println("Số " + number + " không xuất hiện trong mảng.");
        }
    }
    static boolean isValid(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

    static String convertArrayToString (int[] arr){
        String result = "";
        for(int item : arr){
            result += String.format("%d, ",item);
        }
        return result;
    }
    static int getInputUser (int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println(String.format("Danh sach cac so hien tai la %s",convertArrayToString(arr)));
        while (true){
            System.out.println("Hay nhap vao so can xoa ");
            int number = scanner.nextInt();
            if(isValid(arr,number)){
                return number;
            }
        }
    }
    static int[] deleteNumber(int[] arr, int number) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}

