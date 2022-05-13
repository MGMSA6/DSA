package LeetCode.Java;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {

    // Assume Array is infinite , and you can't use array.length
    static int[] arr = {2, 3, 4, 10, 40, 45, 48, 50, 60, 80, 99, 100};
    static int target = 40;

    public static void main(String[] args) {
        System.out.println(search(arr, target));
    }

    /**
     * @param arr
     * @param target
     * @return
     */
    public static int search(int[] arr, int target) {

        // Range of the box
        int start = 0;
        int end = 1;

        while (target > arr[end]) {

            int newStart = end + 1;

            // double the size of range
            // end = end + (size of range * 2)
            end = end + (end - start + 1);

            start = newStart;
        }

        return iterativeSearch(arr, start, end, target);
    }

    /**
     * @param arr
     * @param start
     * @param end
     * @param num
     * @return
     */
    public static int iterativeSearch(int[] arr, int start, int end, int num) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == num) {
                return mid;
            }
            if (arr[mid] > num) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
