package com.dp.creational.factoryMethod;

public abstract class Creator {
    // The factory method
    public abstract Product createProduct();

    public void useProduct() {
        Product product = createProduct();
        product.use();
    }
}
