package com.ainur.collections;

public interface List<T> {
    int size();
    boolean isEmpty();
    boolean contains(T t);
    void add(T t);
    void remove(T t);
}
