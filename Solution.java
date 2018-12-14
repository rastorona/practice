package com.company;

public class Solution {
    //Initialization block
    //Initialize of classes
    private static Delete delete = new Delete();
    private static Copy copy = new Copy();
    private static Paste paste = new Paste();
    private static Insert insert  = new Insert();
    //Initialize of Variables
    private String s;
    private String Changeble;
    private String buffer="";
    private String[] commandLines = new String[ 100 ];
    private int max_terminate=-1;
    private int terminate=-1;
    /*/////Void block
    ////////////////
    */
    public void setS(String s) {this.s = s;}
    public String getS() {
        Changeble=s;
        for (int i=0;i<=terminate;i++){
            Changeble=runfunc(commandLines[i]);
        }
        return Changeble;
    }
    public String getStatemenofCommand(){   return commandLines[terminate];    }
    public int getStatemenofTerminate(){return terminate;}
    public void setfunc(String S1){
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

                terminate += 1;
                if (max_terminate <= terminate) {
                    max_terminate = terminate;
                }
                commandLines[terminate] = S1;


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
                terminate += 1;
                if (max_terminate <= terminate) {
                    max_terminate = terminate;
                }
                commandLines[terminate] = S1;

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
                terminate += 1;
                if (max_terminate <= terminate) {
                    max_terminate = terminate;
                }
                commandLines[terminate] = S1;

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
                terminate += 1;
                if (max_terminate <= terminate) {
                    max_terminate = terminate;
                }
                commandLines[terminate] = S1;

            }
        }
        if (S1.equals("redo")) {

                if (max_terminate > terminate) {
                    terminate += 1;
                }
        }
        if (S1.equals("undo")) {

                if (0 < terminate) {
                    terminate -= 1;
                }
        }
    }
    private String runfunc(String S1){
        if (S1.length()>7) {
            if (S1.substring(0, 7).equals("insert ")) {
                int K = 8;
                while (S1.charAt(K) != '"') {
                    K += 1;
                }
                int Z = K + 3;
                Changeble=insert.run(S1.substring(8, K), Integer.parseInt(S1.substring(Z)), Changeble);
            }
            if (S1.substring(0, 7).equals("delete ")) {
                int K = 7;
                while (S1.charAt(K) != ',') {
                    K += 1;
                }
                int Z = K + 3;
                Changeble=delete.run(Integer.parseInt(S1.substring(7, Z - 3)), Integer.parseInt(S1.substring(Z-1)), Changeble);
            }
        }
        if (S1.length()>5) {
            if (S1.substring(0, 5).equals("copy ")) {
                int K = 5;
                while (S1.charAt(K) != ',') {
                    K += 1;
                }
                int Z = K+3;
                buffer=copy.run(Integer.parseInt(S1.substring(5, Z - 3)), Integer.parseInt(S1.substring(Z-1)), Changeble);
            }
            if (S1.substring(0, 6).equals("paste ")) {
                int K = 6;
                while (S1.length() !=K) {
                    K += 1;
                }
                int Z =K-1;
                Changeble=paste.run(buffer, Integer.parseInt(S1.substring(Z)), Changeble);
            }
        }
        return Changeble;
    }
}
