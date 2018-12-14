package com.company;

public class Insert {
    public String run(String s21,int K,String Changeble){
            Changeble = Changeble.substring(0,K-1) + s21 + Changeble.substring(K-1);
            return Changeble;
    }
}

