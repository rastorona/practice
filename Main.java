package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    private static Solution solution = new Solution();


    public static void main(String[] args)throws IOException {
        Scanner scanner = new Scanner(new File("input.txt")) ;
        Scanner scanner1 = new Scanner(new File("input1.txt"));
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s1=scanner.nextLine();
        solution.setS(s1);
        System.out.println(s1);
        System.out.println();
        while(scanner1.hasNext()) {
            String s = scanner1.nextLine();
            System.out.println();
            solution.setfunc(s);
            System.out.println(s);
            System.out.println(solution.getS());
        }
	    scanner.close();
        scanner1.close();
    }

}
