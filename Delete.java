package com.company;

public class Delete {
    public String run(int pos,int pos1,String Changeble){
        Changeble=Changeble.substring(0,pos-1)+Changeble.substring(pos1);
        return Changeble;}
}
