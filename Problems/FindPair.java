package Problems;

/**
 * Given an array A[] of n numbers and another number x,
 * determines whether there exist two elements in A[] whose sum is exactly x.
 */

// Time Complexity of this problem is 0(n^2)

public class FindPair {

    static int[] array = {1, -2, 1, 0, 5};
    static int sum = 1;


    public static void main(String[] args) {

        if (findPair()) {
            System.out.println("Valid pair exists");
        } else {
            System.out.println("No valid pair exists for " + sum);
        }

    }

    /**
     * @return boolean
     */
    public static boolean findPair() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == sum) {
                    return true;
                }
            }
        }

        return false;
    }
}
