package com.vilelapinheiro.patterns.Observer;

public class PhoneClient extends Observer {

    public PhoneClient(Subject sujeito) {
        this.subject = sujeito;
        sujeito.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from phone");
    }

/*    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Fui notificado de que " + this.name + " twitou alguma coisa.");
    }*/

    @Override
    void update() {
        System.out.println("Phone Stream has been notified: " + subject.getState());
    }
}
