package com.company;

public class Buf {
    Buf(){
        Changeble=new String();
        buffer=new String();
    }
    private String Changeble;
    private String buffer;
    public String Get_Changeble(){
        return Changeble;
    }
    public String Get_buffer(){
        return buffer;
    }
    public void Set(String buffe,String Changebl){
        Changeble=Changebl;
        buffer=buffe;
    }
    public void Set_Changeble( String Changebl){
        Changeble=Changebl;
    }
    public void Set_Buffer( String buffe){
        buffer=buffe;
    }


}

