package com.dp.behavioral.strategy;

public class ConcreteStrategyA implements IStrategy {

    @Override
    public void strategyMethod() {
        System.out.println("The strategy method of Specific Strategy A has been accessed.");
    }
}
