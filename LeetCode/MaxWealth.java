package LeetCode;

public class MaxWealth {

    // int arr = [[2,8,7],[7,1,3],[1,9,5]];

    static int[][] arr = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

    public static void main(String[] args) {

        System.out.println(getMaxWealth(arr));

    }

    /**
     * @param accounts
     */
    static int getMaxWealth(int[][] accounts) {

        int maxWealth = 0;

        // person = row
        for (int person = 0; person < accounts.length; person++) {

            int sum = 0;
            // account = col
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
