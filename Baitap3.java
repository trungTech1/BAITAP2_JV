package Array;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        //b1: nhap vao 2 mang ar1 va arr2
        int[] arr1= getArrUser();
        int[] arr2= getArrUser();
        //b2 tinh do dai arr3;
        int lengthArr3 = arr1.length + arr2.length;
        //b3  khai bao currentIndex va arr3
        int current = 0;
        int[] arr3 = new int[lengthArr3];
        int currentIndex = 0;

        // Step 4: coppy phan tu o arr1 sang arr3
        for (int i = 0; i < arr1.length; i++) {
            arr3[currentIndex++] = arr1[i];
        }

        // Step 5: coppy phan tu o arr2 sang arr3
        for (int i = 0; i < arr2.length; i++) {
            arr3[currentIndex++] = arr2[i];
        }

        // Step 6: In ra mang arr3
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
    static int[] getArrUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
