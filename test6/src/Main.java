package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Command cm;

    public static void main(String[] args){
        //Creating classes
        Invoker invoker =new Invoker();
        //Creating scanner
        try {
            Scanner scanner = new Scanner(new File("input.txt"));
            Scanner scanner1 = new Scanner(new File("input1.txt"));
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            scanner1.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String S=scanner.nextLine();
            //reading start pos
            System.out.println(S);
            invoker.SetS(S);
            System.out.println();
            //
            while(scanner1.hasNext()) {
                String s = scanner1.nextLine();
                System.out.println();
            try {
                cm = Parser.setfunc(s);
                invoker.StoreCommand(cm);
                System.out.println(s);
                invoker.ShowTheResult();
            } catch (DIM_Exception e){
                System.out.println(e);
            }
            }

	        scanner.close();
            scanner1.close();
        }
        catch (IOException ioex){
            System.out.println("OSHIBKA");
        }
    }

}
