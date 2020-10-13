package com.vilelapinheiro.patterns.Observer;

import java.util.Observable;

public class TwitterStream extends Observable {
    public void someoneTweeted() {
        setChanged();
        notifyObservers();
    }
}
