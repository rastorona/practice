package com.company;

public class Delete implements Command {
    //Constructor
    Delete(int pos,int pos1,String Changeble){
        this.pos=pos;
        this.Changeble=Changeble;
        this.pos1=pos1;
    }
    //Variables
    private int pos,pos1;
    private String Changeble;
    //Functions
    @Override
    public String run(){
        Changeble=Changeble.substring(0,pos-1)+Changeble.substring(pos1);
        return Changeble;
    }
    @Override
    public void SetS(String Changeble){
        this.Changeble=Changeble;
    }
}
