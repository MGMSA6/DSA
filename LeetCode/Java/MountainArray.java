package LeetCode.Java;

public class MountainArray {

    static int[] arr = {3, 4, 5, 1};

    public static void main(String[] args) {

        System.out.println(findPeek1(arr));

    }

    /**
     * @param arr
     * @return
     */
    static int findPeek(int[] arr) {

        int i = 0;
        int j = i + 1;

        while (j < arr.length && arr[i] < arr[j]) {
            i++;
            j++;
        }
        if (i == 0) {
            return j;
        } else {
            return i;
        }
    }

    /**
     * @param arr
     * @return
     */
    static int findPeek1(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start != end) {

            int mid = start + (end - start) / 2;

            // Descending order
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {

                // Ascending order
                start = mid + 1;
            }
        }
        return start;
    }
}
