package com.dp.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context c = new Context();
        IStrategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("-----------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
