package com.company;
import java.io.*;
public class Solution {
    private String s;
    private int n;
    public void setS(String s) {
        this.s = s;
    }
    public void setN(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    public String getS() {
        return s;
    }
    public int func1() {
        int K = 0;
        int J = 0;
        for (int I = 0; I < s.length(); I++) {
            if (s.charAt(I) == 'U') {
                K += 1;
            } else {
                K -= 1;
            }
            if (K == 0 && s.charAt(I) == 'U') {
                J += 1;
            }
        }
        return J;
    }
    public void print()throws IOException{
        File file = new File("out.txt");
        file.createNewFile();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)); //System.getenv("OUTPUT_PATH")
        bufferedWriter.write(String.valueOf(func1()));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
