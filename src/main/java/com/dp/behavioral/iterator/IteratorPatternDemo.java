package com.dp.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        // Create a list of items
        List<String> items = Arrays.asList("Item1", "Item2", "Item3", "Item4");

        // Create a ConcreteAggregate
        Aggregate<String> aggregate = new ConcreteAggregate<>(items);

        // Create an iterator
        Iterator<String> iterator = aggregate.createIterator();

        // Traverse the collection using the iterator
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
