package DataStructures.Arrays;

import java.util.Scanner;

// Java program to implement arrays
public class Arrays {

    static int[] arr;
    static int intArr[];

    public static void main(String[] args) {
        arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;

        for (int i : arr) {
            System.out.println(i);
        }

        int n = 5, pos, x;
        intArr = new int[n + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array elements : ");
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int i : intArr) {
            System.out.println(i);
        }

        // Find an element in an array
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter an element to find in an array : ");
        int position = findElement(intArr, sc1.nextInt());

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + (position + 1));
        }

        // Insert element at end of an array
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter an element to insert in an array : ");
        insert(sc3.nextInt());


        // Delete an element from an array
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter an element to delete in an array : ");
        int result = delete(sc4.nextInt());

        System.out.println("");

        if (result == 1) {
            System.out.println("Array after deletion");
            for (int i = 0; i < intArr.length -1; i++){
                System.out.print(intArr[i] + " ");
            }
        }

        System.out.println("");
        System.out.println(java.util.Arrays.toString(intArr));

    }

    /**
     * @param arr
     * @param num
     * @return index
     */
    public static int findElement(int arr[], int num) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param num
     * @return boolean
     */
    public static void insert(int num) {

        System.out.println("Array before inserting");
        System.out.println(java.util.Arrays.toString(intArr));

        intArr[intArr.length - 1] = num;

        System.out.println("Array after inserting");
        System.out.println(java.util.Arrays.toString(intArr));

    }

    /**
     * @param num
     */
    public static int delete(int num) {

        System.out.println("Array before deletion");
        System.out.println(java.util.Arrays.toString(intArr));

        // Find the element to be deleted from an array
        int pos = findElement(intArr, num);

        if (pos == -1) {
            System.out.println("Element not found");
            return -1;
        }

        int i;
        for (i = pos; i < intArr.length - 1; i++) {
            intArr[i] = intArr[i + 1];
        }

        // inserting last element with zero value
        intArr[intArr.length -1] = 0;

        return 1;
    }



}
