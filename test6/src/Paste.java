package com.company;

public class Paste implements Command {
    //Constructor

    Paste(int K){
        this.K=K;
        Changeble=new String();
        buffer=new String();
    }
    //Variables
    private int K;
    private Buf buf;
    private String Changeble,buffer;
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
        this.buffer=buf.Get_buffer();
    }
    @Override
    public void run(){
        buf.Set_Changeble(Changeble.substring(0,K-1)+buffer+Changeble.substring(K-1));
        stack.commands1.push(this);

    }
    @Override
    public void Undo(){
        buf.Set_Changeble(Changeble.substring(0,K-buffer.length())+Changeble.substring(buffer.length()));
    }


}
