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

        func1(arr);

        scanner.close();
    }

    public class Solution {
        /*
         * Дано: n - количество чисел в массиве
         *		ar - массив чисел
         * 		0 < n < 100
         *		-100 <= ar[i] <= 100
         * Вычислить нормализованное количество положительных, отрицательных и нулевых элементов
         * Пример:
         *	6
         *	-4 3 -9 0 4 1
         *
         *	Output
         *	0.500000
         *	0.333333
         *	0.166667
         */

    }
        static void func1(int[] arr) {
        float pol=0;
        float nul=0;
        float otr=0;
        for (int i:arr){
            if (i>0)
                pol= pol + 1;
            else if (i == 0)
                nul = nul + 1;
                else if (i<0)
                    otr = otr + 1;
            }
        System.out.println("Output:");
        System.out.printf("%.6f", pol / arr.length);
        System.out.println();
        System.out.printf("%.6f", otr / arr.length);
        System.out.println();
        System.out.printf("%.6f", nul / arr.length);

        }
    }


