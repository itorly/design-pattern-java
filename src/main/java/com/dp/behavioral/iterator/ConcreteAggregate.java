package com.dp.behavioral.iterator;

import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> items;

    public ConcreteAggregate(List<T> items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}
