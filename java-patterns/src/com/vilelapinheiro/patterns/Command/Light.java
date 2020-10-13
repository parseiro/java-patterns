package com.vilelapinheiro.patterns.Command;

public class Light {

    private boolean isOn = false;
    private String nome;

    public boolean isOn() {
        return isOn;
    }

    public Light(String bedroom) {
        this.nome = bedroom;
    }

    public void toggle() {
        if (this.isOn) {
            off();

        } else {
            on();

        }
    }

    public void on() {
        System.out.println("Light " + this.nome + " switched on");
        this.isOn = true;
    }

    public void off() {
        System.out.println("Light " + this.nome + " switched off");
        this.isOn = false;
    }
}
