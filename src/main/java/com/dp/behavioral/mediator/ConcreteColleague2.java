package com.dp.behavioral.mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Colleague2 sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Colleague2 receives: " + message);
    }
}
