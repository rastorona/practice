package com.company;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter kol-vo n:");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        System.out.println("Enter element mass:");
        String[] arrItems = scanner.nextLine().split(" ");
        System.out.println("Press Enter");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        ArrayList vvv = Normal.func1(arr);
        scanner.close();
        for (Object i:vvv){
            System.out.println(i);
        }
    }
}

