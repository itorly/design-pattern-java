package com.dp.behavioral.iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
