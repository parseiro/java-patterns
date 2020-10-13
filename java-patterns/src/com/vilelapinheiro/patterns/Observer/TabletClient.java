package com.vilelapinheiro.patterns.Observer;

public class TabletClient extends Observer {

    public TabletClient(Subject sujeito) {
        this.subject = sujeito;
        sujeito.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message + " - sent from tablet");
    }

/*    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Fui notificado de que " + this.name + " twitou alguma coisa.");
    }*/

    @Override
    void update() {
        System.out.println("Tablet Stream has been notified: " + subject.getState());
    }
}
