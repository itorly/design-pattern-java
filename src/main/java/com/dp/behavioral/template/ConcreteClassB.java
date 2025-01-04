package com.dp.behavioral.template;

public class ConcreteClassB extends AbstractClass{
    @Override
    protected void step2() {
        System.out.println("ConcreteClassB: Step 2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClassB: Step 3");
    }

    @Override
    protected boolean executionConditionsForStep2() {
        return true;
    }
}
