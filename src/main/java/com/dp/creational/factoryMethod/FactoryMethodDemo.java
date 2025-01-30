package com.dp.creational.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.useProduct();  // Output: Using ConcreteProductA

        Creator creatorB = new ConcreteCreatorB();
        creatorB.useProduct();  // Output: Using ConcreteProductB
    }
}
