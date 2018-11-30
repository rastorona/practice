package com.company;


import java.lang.reflect.Constructor;

import java.util.ArrayList;


public class Invoker {
    //Constructor
    Invoker(){
        commands = new java.util.Stack<>();
        Buf=new Buf();
        Buf.Set_Buffer("");
        Stack=new Stack();
     }
    //Variables block
    private String S;
    private java.util.Stack<Command> commands;
    private Buf Buf;
    private Stack Stack;
    //Void Block
    public void SetS(String S21){
        this.S=S21;
        Buf.Set_Changeble(S);
    }
    public void  StoreCommand(Command command){
        command.Set_Stack(Stack);
        command.Set(Buf);
        command.run();
        commands.push(command);
    }
    public void ShowTheResult(){
        System.out.println(Buf.Get_Changeble());
    }



}
