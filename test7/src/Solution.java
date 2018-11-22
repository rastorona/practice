package com.company;

import java.io.*;
import java.util.*;


public class Solution {

    /*
     * Два кота и мышь в разных позициях на линии. Определить какой кот настигнет мыша первым.
     * Мышь не двигается, коты бегают с одной скоростью, старт синхронный. В случае одновременного
     * нападения на мышь, коты вступают в бой, а мышь ретируется во-свояси.
     * Если первый кот чемпион - вывести Cat A, если второй кот - Cat B, если мышь удрала - Mouse C.
     * Дано: n - количество картежей координат зверей.
     *		x y z - координата первого кота, второго и мыша.
     *		1 <= n <= 100
     * 		1 <= x, y, z <= 100
     * Пример:
     * 2
     * 1 2 3
     * 1 3 2
     *
     * Cat B
     * Mouse C
     */

    public static class Tor{
        private static int x, y, z;
        public void Set(int a, int b, int c) {
            x = a;
            y = b;
            z = c;
        }
        public static void Get() {
            func1();
            System.out.println(func1());
        }
        static String func1() {
            x = Math.abs(z - x);
            y = Math.abs(z - y);
            if (x == y)
                return "Mouse C";
            else if (x < y)
                return "Cat A";
            else
                return "Cat B";

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));//System.getenv("OUTPUT_PATH")


        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            com.company.Solution.Tor Dav = new com.company.Solution.Tor();
            Dav.Set(x, y, z);
            Thread myThread= new Thread(()-> Dav.Get());
            myThread.start();


            bufferedWriter.write(com.company.Solution.Tor.func1());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}