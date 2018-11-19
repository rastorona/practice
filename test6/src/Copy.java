package com.company;

public class Copy implements Command {
    //Constructor
    Copy(int K,int J,String Changeble){
        this.K=K;
        this.Changeble=Changeble;
        this.J=J;
    }
    //Variables
    private int K,J;
    private String Changeble;
    //Functions
    @Override
    public String run()
    {

        String buffer=Changeble.substring(K-1,J);
        return buffer;

    }
    @Override
    public void SetS(String Changeble){
        this.Changeble=Changeble;
    }
}
