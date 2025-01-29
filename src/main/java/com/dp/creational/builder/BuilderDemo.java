package com.dp.creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}
