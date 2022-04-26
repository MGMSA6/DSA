package LeetCode.Java;

// Question
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {

    static int[] arr = {555, 901, 482, 1771};
    static int count;

    public static void main(String[] args) {

        //System.out.println(findNumbers(arr));

        System.out.println(digit1(1771));

    }

    static int digits(int n) {

        // for negative numbers
        if (n < 0) {
            n = n * -1;
        }

        if (n == 0) {
            return 1;
        }
        int c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

    static int digit1(int num) {

        if (num < 0) {
            num = num * -1;
        }

        return (int) (Math.log10(num)) + 1;
    }

    static boolean even(int num) {
        int n = digit1(num);

        return n % 2 == 0;
    }

    static int findNumbers(int[] arr) {

        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }
}
