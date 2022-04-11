package Algorithms.Sorting.Java;

import java.util.Arrays;

// Time complexity is O(n^2)
// Space complexity is O(1)

public class InsertionSort {

    static int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));


        sort(arr);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));

    }

    /**
     *
     * @param arr
     */
    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = temp;
        }
    }
}
