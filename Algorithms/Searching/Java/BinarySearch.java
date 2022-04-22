package Algorithms.Searching.Java;

import java.util.Arrays;
import java.util.Scanner;

// Time complexity of Binary Search is O(Log n)

public class BinarySearch {

    static int[] arr = {2, 3, 4, 10, 40};
    static int len = arr.length;
    static int num;
    static int position;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to search in array");
        num = sc.nextInt();

        position = iterativeSearch(arr, 0, len - 1, num);

        if (position == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found in array at position " + (position + 1));
        }


    }

    /**
     * Recursive implementation of Binary Search:
     *
     * @param arr
     * @param left
     * @param right
     * @return position
     */
    public static int recursiveSearch(int[] arr, int left, int right, int num) {

        if (left <= right) {

            int mid = left + (right - left) / 2;

            if (num == arr[mid]) {
                position = mid;
                return position;
            }

            if (arr[mid] > num) {
                return recursiveSearch(arr, left, mid - 1, num);
            }

            return recursiveSearch(arr, mid + 1, right, num);

        }
        return -1;
    }

    /**
     * Iterative implementation of Binary Search
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int iterativeSearch(int[] arr, int left, int right, int num) {

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                return mid;
            }

            if (arr[mid] < num) {
                left = left + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
