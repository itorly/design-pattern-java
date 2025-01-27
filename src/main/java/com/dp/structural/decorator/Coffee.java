package com.dp.structural.decorator;

public class Coffee implements Beverage {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}
