package com.vilelapinheiro.patterns.Observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject {
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    String getState() {
        return this.messageHistory.getLast();
    }

    @Override
    void setState(String state) {
        this.messageHistory.add(state);
        this.notifyObservers();
    }
}
