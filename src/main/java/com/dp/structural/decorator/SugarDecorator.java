package com.dp.structural.decorator;

public class SugarDecorator extends BeverageDecorator {


    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}
