package Array;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập kích thước của ma trận vuông
        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        inputMatrix(matrix, scanner);
        System.out.println("Ma trận vừa nhập:");
        printMatrix(matrix);
        // Tính tổng của các số trên đường chéo chính
        int sumMainDiagonal = calculateDiagonalSum(matrix);
        // In ra tổng của các số trên đường chéo chính
        System.out.println("Tổng của các số trên đường chéo chính là: " + sumMainDiagonal);
    }

    // Phương thức nhập giá trị cho ma trận
    static void inputMatrix(int[][] matrix, Scanner scanner) {
        System.out.println("Nhập các giá trị của ma trận vuông:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    //in ma trận
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //tính tổng của các số trên đường chéo chính
    static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
