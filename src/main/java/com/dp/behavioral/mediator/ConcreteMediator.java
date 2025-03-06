package com.dp.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague col : colleagues) {
            // Ensure the message is not sent back to the sender
            if (col != colleague) {
                col.receiveMessage(message);
            }
        }
    }
}
