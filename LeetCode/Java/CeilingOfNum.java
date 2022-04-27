package LeetCode.Java;

import java.util.Arrays;

public class CeilingOfNum {

    static int[] arr = {2, 3, 4, 2900, 30000};
    static int target = 10;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println("Ceiling of " + target + " is " + arr[findCeiling()]);

    }

    static int findCeiling() {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
