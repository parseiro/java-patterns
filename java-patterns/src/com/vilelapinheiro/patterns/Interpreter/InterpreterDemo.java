package com.vilelapinheiro.patterns.Interpreter;

public class InterpreterDemo {

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lion or (Tiger and Bear)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }

    public static void main(String[] args) {
        //String context = "Lion";
        String context = "Tiger";

        var define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
