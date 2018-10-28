package com.company;
import java.io.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static Solution solution = new Solution();



    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        solution.setN(n);
        solution.setS(s);
        Runnable potok =()->System.out.println(solution.func1());
        new Thread(potok).start();
        scanner.close();
    }

}