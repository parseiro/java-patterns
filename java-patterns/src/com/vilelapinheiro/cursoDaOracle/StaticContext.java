package com.vilelapinheiro.cursoDaOracle;

import java.time.Period;

public class StaticContext {
    private static Period defaultExpiryPeriod;


    static {
        defaultExpiryPeriod = Period.ofDays(3);
        System.out.println("Contexto estatico!!!");
    }

    public static void main(String[] args) {
        System.out.println("Main()");
    }
}
