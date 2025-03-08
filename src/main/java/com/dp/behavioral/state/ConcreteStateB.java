package com.dp.behavioral.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("Handling request in State B");
        // Transition to State A
        context.setState(new ConcreteStateA());
    }
}