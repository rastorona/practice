package com.company;

public class Solution {
    //Constructor
    Solution(String S21) {this.S = S21;}
    //Initialization block
    //Initialize of Variables
    private String S;
    private String buffer="";
    //Initialization block
    private Invoker invoker =new Invoker();
    /*/////Void block
    ////////////////
    */

    public void setfunc(String S1){
        invoker.SetS(S);
        if (S1.length()>9) {
            if (S1.substring(0, 7).equals("insert ")) {
                int K = 8;
                boolean Z = true;
                if (S1.charAt(7) != '"') {
                    Z = false;
                }

                while ((S1.charAt(K) != '"') && (Z)) {
                    K += 1;
                }
                K += 3;
                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                while ((K != S1.length()) && (Z)) {
                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }
                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                K = 8;
                while (S1.charAt(K) != '"') {
                    K += 1;
                }
                int Z1 = K + 3;
                invoker.StoreCommand(new Insert(S1.substring(8, K), Integer.parseInt(S1.substring(Z1)), S));

            }
            if (S1.substring(0, 7).equals("delete ")) {
                int K = 8;
                boolean Z = true;
                while ((S1.charAt(K) != ',') && (Z)) {
                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }
                K += 2;
                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                while ((K != S1.length()) && (Z)) {
                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }
                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                K = 7;
                while (S1.charAt(K) != ',') {
                    K += 1;
                }
                int Z1 = K + 3;
                invoker.StoreCommand(new Delete(Integer.parseInt(S1.substring(7, Z1 - 3)), Integer.parseInt(S1.substring(Z1-1)), S));

            }
        }
        if (S1.length()>5) {
            if (S1.substring(0, 4).equals("copy")) {
                int K = 5;
                boolean Z = true;
                while ((S1.charAt(K) != ',') && (Z)) {

                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }
                K+=3;

                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }

                while ((K!= S1.length()) && (Z)) {
                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }

                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                K = 5;
                while (S1.charAt(K) != ',') {
                    K += 1;
                }
                int Z1 = K+3;
                invoker.StoreCommand(new Copy(Integer.parseInt(S1.substring(5, Z1 - 3)), Integer.parseInt(S1.substring(Z1-1)), S));

            }
        }
        if (S1.length()>6) {
            if (S1.substring(0, 6).equals("paste ")) {
                int K = 7;
                boolean Z = true;
                while ((K != S1.length()) && (Z)) {
                    if (Character.getNumericValue(S1.charAt(K)) == -1 || Character.getNumericValue(S1.charAt(K)) == -2) {
                        Z = false;
                    }
                    K += 1;
                }

                if (!Z) {
                    System.out.println("ERROR:INPUT VALUE IS INVALID");
                    // halt this process
                    Runtime.getRuntime().halt(0);
                }
                K = 6;
                while (S1.length() !=K) {
                    K += 1;
                }
                int Z1 =K-1;
                invoker.StoreCommand(new Paste(buffer, Integer.parseInt(S1.substring(Z1)), S));

            }
        }
        if (S1.equals("redo")) {

                invoker.Redo();
        }
        if (S1.equals("undo")) {

                invoker.Undo();
        }
    }
    public void GetRes(){
        System.out.println(invoker.ShowTheResult());
    }
}
