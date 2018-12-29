package com.company;

public class Copy implements Command {
    //Constructor

    Copy(int K,int J){
        this.K=K;
        this.J=J;
        buffer=new String();
    }
    //Variables
    private int K,J;
    private Buf buf;
    private String Changeble, buffer;
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
    public void run()
    {
        buf.Set_Buffer(Changeble.substring(K-1,J));
        stack.commands1.push(this);
    }
    @Override
    public void Undo(){
        buf.Set_Buffer(buffer);
    }

}
