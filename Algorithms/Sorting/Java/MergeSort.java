package Algorithms.Sorting.Java;

import java.util.Arrays;

public class MergeSort {

    static public int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {

        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting");
        System.out.println(Arrays.toString(arr));

    }

    /**
     * @param arr
     * @param l
     * @param r
     */
    public static void mergeSort(int[] arr, int l, int r) {

        // Base case
        if (l < r) {

            // FInd the mid-point to divide array into 2 halves
            int mid = l + (r - l) / 2;

            // Call mergeSort for 1st half
            mergeSort(arr, l, mid);

            // Call mergeSort for 2nd half
            mergeSort(arr, mid + 1, r);

            // Merge two halves sorted
            merge(arr, l, mid, r);
        }
    }

    /**
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    public static void merge(int[] arr, int l, int mid, int r) {

        // Define 3 variables
        int i = l, k = 0;
        int j = mid + 1;
        int[] arr1 = new int[r - l + 1];

        while (i <= mid && j <= r) {

            if (arr[i] <= arr[j]) {
                arr1[k] = arr[i];
                i++;
            } else {
                arr1[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                arr1[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                arr1[k] = arr[i];
                i++;
                k++;
            }
        }

        // Copying all elements
        for (i = l; i <= r; i++) {
            arr[i] = arr1[i - l];
        }
    }
}
