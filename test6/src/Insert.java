package com.company;

public class Insert implements Command{
    //Constructor

    Insert(String s21,int K){
        this.K=K;

        this.s21=s21;
    }
    //Variables
    private int K;

    private Buf buf;
    private String Changeble,s21;
    private Stack stack;
    //Functions
    @Override
    public void Set_Stack(Stack stack){
        this.stack=stack;
    }
    @Override
    public void Set(Buf buf){
        this.buf=buf;
        this.Changeble=buf.Get_Changeble();
    }
    @Override
    public void run(){
        buf.Set_Changeble(Changeble.substring(0,K-1) + s21 + Changeble.substring(K-1));
        stack.commands1.push(this);
    }
    @Override
    public void Undo(){
        buf.Set_Changeble(Changeble);
    }

}

