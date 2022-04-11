package Algorithms.Sorting.Java;

// Time complexity is O(n^2)
// Space complexity is O(1)

import java.util.Arrays;

public class SelectionSort {

    static int arr[] = {5, 4, 3, 2, 1};


    public static void main(String[] args) {

        System.out.println("Before sorting");

        System.out.println(Arrays.toString(arr));

        System.out.println("After sorting");

        System.out.println(Arrays.toString(sort(arr)));

    }

    /**
     * @param arr
     */
    public static int[] sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }

        return arr;
    }
}
