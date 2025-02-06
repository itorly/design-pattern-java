package com.dp.behavioral.strategy;

public class Context {
    private IStrategy strategy;
    public IStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
