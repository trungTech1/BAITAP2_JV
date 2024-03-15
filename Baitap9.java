package Array;

public class Baitap9 {
    public static void main(String[] args) {
        int[] array = {1, 10, 7, 4, 5};
        System.out.println("So lon thu hai trong mang la : " + findSecondLargest(array));
    }

    public static int findSecondLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }
}