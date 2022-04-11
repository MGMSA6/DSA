package Algorithms.Searching.Java;

public class JumpSearch {

    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    static int find = 14;

    public static void main(String[] args) {

        int position = search(arr);

        if (position != -1) {
            System.out.println("Element found at position " + (position + 1));
        } else {
            System.out.println("Element not found");
        }

    }

    public static int search(int[] arr) {

        int m = (int) Math.floor(Math.sqrt(arr.length));

        int lastIndex = m;

        while (lastIndex < arr.length && find >= arr[lastIndex]) {
            lastIndex += m;
        }

        for (int i = lastIndex - m; i < arr.length && i < lastIndex; i++) {
            if (arr[i] == find) {
                return i;
            }
        }


        return -1;
    }

}
