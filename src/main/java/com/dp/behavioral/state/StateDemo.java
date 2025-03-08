package com.dp.behavioral.state;

public class StateDemo {
    public static void main(String[] args) {
        // Create the context with an initial state
        Context context = new Context(new ConcreteStateA());

        // Make requests to the context
        context.request(); // Output: Handling request in State A
        context.request(); // Output: Handling request in State B
        context.request(); // Output: Handling request in State A
        context.request(); // Output: Handling request in State B
    }
}
