package Algorithms.Sorting.Java;

import java.util.Arrays;


// Time complexity is O(n^2)
// Space complexity is O(1)

public class BubbleSort {

    static int[] arr = {5, 4, 3, 2, 1};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sort(arr)));

    }

    /**
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }
}
