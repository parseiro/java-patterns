package com.vilelapinheiro.patterns.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new MessageStream();

        PhoneClient phoneClient = new PhoneClient(subject);
        TabletClient tabletClient = new TabletClient(subject);

        phoneClient.addMessage("Here is a new message 1!");
        phoneClient.addMessage("Here is a new message 2!");
    }
}
