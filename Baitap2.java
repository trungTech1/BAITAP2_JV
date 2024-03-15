package Array;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = getArrUser();
        System.out.println("Mang ban dau: " + convertArr(arr));

        System.out.print("Nhap gia tri can chen: ");
        int value = scanner.nextInt();
        System.out.print("Nhap vi tri can chen: ");
        int position = scanner.nextInt();

        if (position < 0 || position > arr.length) {
            System.out.println("Vi tri chen khong hop le.");
        } else {
            arr = insertElement(arr, value, position);
            System.out.println("Mang sau khi chen: " + convertArr(arr));
        }
    }

    static String convertArr(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int item : arr) {
            result.append(item).append(", ");
        }
        return result.toString();
    }

    static int[] getArrUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc cua mang: ");
        int size = scanner.nextInt();
        int[] userArr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Vui long nhap phan tu thu " + (i + 1) + ": ");
            userArr[i] = scanner.nextInt();
        }
        return userArr;
    }

    static int[] insertElement(int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
}
