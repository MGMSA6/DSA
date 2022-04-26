package LeetCode.Java;

// Question
// https://leetcode.com/problems/binary-search/

public class OrderAgnosticBS {

    static int[] arr = {2, 3, 4, 10, 40};
    static int[] arr1 = {50, 40, 30, 20, 10};
    static int target = 20;

    public static void main(String[] args) {

        int pos = orderAgnosticBS(arr1, target);

        if (pos != -1) {
            System.out.println("Element " + target + " found at position: " + (pos + 1));
        } else {
            System.out.println("Element not found");
        }

    }

    static int orderAgnosticBS(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        boolean Asc = arr[left] < arr[right];

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (Asc) {
                if (target < arr[mid]) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
