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

    public static void sort(int low, int high) {

        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            sort(low, pi - 1);
            sort(pi + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        // pivot
        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] <= pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
