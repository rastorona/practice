package com.company;

public class Paste {
    public String run(String buffer,int K,String Changeble){
        Changeble=Changeble.substring(0,K-1)+buffer+Changeble.substring(K-1);
        return Changeble;
    }
}
