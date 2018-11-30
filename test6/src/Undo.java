package com.company;

public class Undo implements Command{

    //variables
    private Buf Buf;
    private Stack stack;
    //Function
    @Override
    public void Set_Stack(Stack stack){
        this.stack=stack;
    }
    @Override
    public void Set(Buf buf){
        this.Buf=buf;
    }
    @Override
    public void run(){
        if (stack.commands1.empty()) {
            System.out.println("ERROR:MORE UNDO THAN ITS POSSIBLE TO DO");
            // halt this process
            Runtime.getRuntime().halt(0);
        }
        stack.commands1.peek().Undo();
        stack.commands2.push(stack.commands1.pop());
    }
    @Override
    public void Undo(){
    }
}
