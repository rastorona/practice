package com.company;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Invoker {

    private static final Logger LOGGER=Logger.getLogger("");
    private SimpleFormatter formatter = new SimpleFormatter();
    private ConsoleHandler consoleHandler = new ConsoleHandler();


    //Constructor
    Invoker(){
        consoleHandler.setFormatter(formatter);
        LOGGER.addHandler(consoleHandler);
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
        LOGGER.log(Level.SEVERE,Buf.Get_Changeble());
    }
}
