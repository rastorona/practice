package com.company;

public class Paste implements Command {
    //Constructor
    Paste(String buffer,int K,String Changeble){
        this.K=K;
        this.Changeble=Changeble;
        this.buffer=buffer;
    }
    //Variables
    private int K;
    private String Changeble,buffer;
    //Functions
    @Override
    public String run(){
        Changeble=Changeble.substring(0,K-1)+buffer+Changeble.substring(K-1);
        return Changeble;
    }
    @Override
    public void SetS(String Changeble){
        this.Changeble=Changeble;
    }
    public void Setbuffer(String buffer){
        this.buffer=buffer;
    }
}
