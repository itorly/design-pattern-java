package com.dp.structural.decorator;

public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    /**
     * Add cost for milk
     */
    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    /**
     * Add milk to the description
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
