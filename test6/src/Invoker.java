package com.company;

import java.util.ArrayList;


public class Invoker {
    public void SetS(String S21){
        this.S=S21;
    }
    private String buffer;
    private String S;
    private ArrayList<Command> commands = new ArrayList<>();
    private int current=-1;
    private int maxcurrent=-1;
    //
    public void  StoreCommand(Command command){
        commands.add(command);
        current+=1;
        maxcurrent=current;
    }
    public void Undo(){
        if(current>0){
            current-=1;
        }
    }
    public void Redo(){
        if  (current<maxcurrent)
            current+=1;

    }
    public String ShowTheResult(){
        String Changeble=S;
        for (int i=0;i<=current;i++){
            (commands.get(i)).SetS(Changeble);
            if (commands.get(i) instanceof Copy){
                buffer = commands.get(i).run();
            }
            else {
                if (commands.get(i) instanceof Paste){
                    ((Paste) commands.get(i)).Setbuffer(buffer);
                    Changeble=commands.get(i).run();
                }
                else {
                    Changeble = commands.get(i).run();
                }
            }
        }
        return Changeble;
    }

}
