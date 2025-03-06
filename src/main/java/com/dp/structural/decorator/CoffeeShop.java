package com.dp.structural.decorator;

/**
 * Without altering the original class,
 * dynamically extend its functionality.
 */
public class CoffeeShop {

    public static void main(String[] args) {
        // Order a simple coffee
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());

        // Add milk to the coffee
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());

        // Add sugar to the coffee
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());
    }
}
