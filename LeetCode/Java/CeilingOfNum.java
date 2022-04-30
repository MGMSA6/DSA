package LeetCode.Java;

import java.util.Arrays;

// The ceiling of x is the smallest element in array greater than or equal to x

public class CeilingOfNum {

    static int[] arr = {2, 3, 4, 5, 6};
    static int target = 6;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println("Ceiling of " + target + " is at: " + findCeiling() + " position");

    }

    static int findCeiling() {

        if(target > arr.length - 1){
            return -1;
        }

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
