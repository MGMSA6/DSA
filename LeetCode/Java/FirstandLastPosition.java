package LeetCode.Java;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

public class FirstandLastPosition {

    static int[] arr = {5, 7, 7, 8, 8, 10};
    static int[] arr1 = {50, 40, 30, 20, 10};


    static int len = arr.length;
    static int target = 11;

    public static void main(String[] args) {

        System.out.println(Arrays.toString(searchRange(arr, target)));

    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(target, arr, true);

        if (ans[0] != -1) {
            ans[1] = search(target, arr, false);
        }

        return ans;
    }

    static int search(int target, int[] arr, boolean findFirst) {

        int ans = -1;
        int l = 0;
        int r = len - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target > arr[mid]) {
                l = mid + 1;
            } else if (target < arr[mid]) {
                r = mid - 1;
            } else {
                ans = mid;
                if (findFirst) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return ans;
    }
}
