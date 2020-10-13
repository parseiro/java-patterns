package com.vilelapinheiro.patterns.Observer;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
