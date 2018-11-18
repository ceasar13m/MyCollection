package com.ainur.collections;

public interface Set<T extends Comparable> {
    int size();
    boolean isEmpty();
    boolean contains(T t);
    void add(T t);
    void remove(T t);
    interface Node<T> {}
}
