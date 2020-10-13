package com.vilelapinheiro.patterns.Command;

//client
public class Task implements Command {
    int number;

    public Task(int i) {
        this.number = i;
    }

    @Override
    public void execute() {
        var estringue =
                new StringBuilder()
                        .append("Estou rodando: ")
                        .append(this.number)
                        .toString();

        System.out.println(estringue);
    }
}
