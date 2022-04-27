package LeetCode.Java;

import java.util.Arrays;

public class FloorOfNum {

    static int[] arr = {2, 3, 5, 9, 14, 16, 18};
    static int target = 15;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arr));
        System.out.println("Floor of " + target + " is " + arr[findFloor()]);

    }

    static int findFloor() {
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
        return end;
    }
}
