package com.company;

public interface  Command {

    void run();
    void Set(Buf buf);
    void Set_Stack(Stack stack);
    void Undo();

}
