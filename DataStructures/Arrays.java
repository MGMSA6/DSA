package DataStructures;

import java.util.Scanner;

// Java program to implement arrays
public class Arrays {

    static int[] arr;

    public static void main(String[] args) {
        arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;

        for (int i : arr) {
            System.out.println(i);
        }

        int n = 5, pos, x;
        int intArr[] = new int[n + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        for (int i : intArr) {
            System.out.println(i);
        }

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Change value at 2 position in intArr:");
        int val = sc1.nextInt();

        intArr[1] = val;
        System.out.println("--------------------");
        for (int i : intArr) {
            System.out.println(i);
        }


    }
}
