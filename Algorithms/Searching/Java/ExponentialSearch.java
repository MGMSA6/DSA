package Algorithms.Searching.Java;

import java.util.Arrays;

// Time Complexity : O(Log n)
// Auxiliary Space : O(1)
public class ExponentialSearch {

    static int arr[] = {2, 3, 5, 7, 9, 10};
    static int target = 7;
    static int len = arr.length - 1;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println("Element " + target + " found at position " + (search() + 1));

    }


    public static int search() {

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;

        while (i < len && arr[i] <= target) {
            i = i * 2;
        }

        return BinarySearch.iterativeSearch(arr, (i / 2), Math.min(i, len), target);

    }
}
