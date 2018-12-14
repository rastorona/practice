package com.company;

public class Redo implements Command {
    //variables
    private Buf Buf;
    private Stack stack;
    //Functions
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
       // stack.commands2.get(stack.commands2.size()-1).Set(Buf);
        if (stack.commands2.empty()) {
            System.out.println("ERROR:MORE REDO THAN ITS POSSIBLE TO DO");
            // halt this process
            Runtime.getRuntime().halt(0);
        }
        stack.commands2.pop().run();


    }
    @Override
    public void Undo(){}

}
