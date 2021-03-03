package com.vilelapinheiro.cursoDaOracle;

public enum Condition {
    HOT("Warming HOT!"),
    WARM("Just right"),
    COLD("Warning COLD!");

    private String caution;

    Condition(String caution) {
        this.caution = caution;
    }


    public String getCaution() {
        return this.caution;
    }
}
