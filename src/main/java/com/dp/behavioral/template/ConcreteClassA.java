package com.dp.behavioral.template;

public class ConcreteClassA extends AbstractClass{
    @Override
    protected void step2() {
        System.out.println("ConcreteClassA: Step 2");
    }

    @Override
    protected void step3() {
        System.out.println("ConcreteClassA: Step 3");
    }

    @Override
    protected boolean executionConditionsForStep2() {
        return false;
    }

}
