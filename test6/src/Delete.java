package com.company;

public class Delete implements Command {
    //Constructor
    Delete(int pos,int pos1){
        this.pos=pos;
        this.pos1=pos1;
        Changeble=new String();
    }
    //Variables
    private Buf buf;
    private int pos,pos1;
    private String Changeble;
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
        buf.Set_Changeble(Changeble.substring(0,pos-1)+Changeble.substring(pos1));
        stack.commands1.push(this);

    }
    @Override
    public void Undo(){
        buf.Set_Changeble(Changeble);
    }
}

