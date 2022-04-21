package Problems.Java;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibo(50));

    }

    static int fibo(int n) {

        // Base condition
        if (n <= 1) {
            return n;
        }

        // This is not tail recursion
        // For tail recursion it should be the last statement to execute
        // here we are calling fun and adding them and returning the result
        return fibo(n - 1) + fibo(n - 2);
    }
}
