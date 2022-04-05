package Algorithms.Searching.Java;

import java.util.Arrays;
import java.util.Scanner;

// Time complexity of LinearSearch is O(n)

public class LinearSearch {

    static int[] arr = {2, 3, 4, 10, 40};
    static int x;
    static int position = -1;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to search in array");
        x = sc.nextInt();

        // int pos = findElement(x);

        int pos = improvedSearch(x, 0, (arr.length - 1));

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + (pos + 1));
        }
    }

    /**
     * @param num
     * @return
     */
    public static int search(int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    // Improve Linear Search Worst-Case Complexity

    public static int improvedSearch(int num, int left, int right) {

        for (left = 0; left <= right; ) {

            // if search_element is found with left variable
            if (arr[left] == num) {
                position = left;
                return position;
            }

            // if search_element is found with right variable

            if (arr[right] == num) {
                position = right;
                return position;
            }

            left++;
            right--;

        }

        // if element not found
        if (position == -1) {
            System.out.println("Not found in Array with "
                    + left + " Attempt");
        }

        return position;
    }

}
