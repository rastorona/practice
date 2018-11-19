package com.company;

public class Insert implements Command{
    //Constructor
    Insert(String s21,int K,String Changeble){
        this.K=K;
        this.Changeble=Changeble;
        this.s21=s21;
    }
    //Variables
    private int K;
    private String Changeble,s21;
    //Functions
    @Override
    public String run(){
            Changeble = Changeble.substring(0,K-1) + s21 + Changeble.substring(K-1);
            return Changeble;
    }
    @Override
    public void SetS(String Changeble){
        this.Changeble=Changeble;
    }
}

