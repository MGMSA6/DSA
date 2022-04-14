package Algorithms.Sorting.Java;

import java.util.Arrays;

public class QuickSort {

    static public int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};


    public static void main(String[] args) {

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));

        sort(0, arr.length - 1);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));

    }

    /**
     * @param low
     * @param high
     */
    public static void sort(int low, int high) {

        if (low < high) {

            // Pivot element position index
            int pi = partition(arr, low, high);

            // Elements before pi
            sort(low, pi - 1);

            // Elements after pi
            sort(pi + 1, high);

        }
    }

    /**
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j < high - 1; j++) {

            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);

    }

    /**
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
