package com.vilelapinheiro.patterns.Command;

//invoker
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
