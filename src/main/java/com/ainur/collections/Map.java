package com.ainur.collections;

public interface Map<K,V> {
    int size();
    boolean isEmpty();
    boolean containsKey(K key);
    boolean containsValue(V value);
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    interface Entry<K, V>{}
}
