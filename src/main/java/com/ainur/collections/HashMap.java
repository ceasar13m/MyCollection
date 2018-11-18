package com.ainur.collections;

public class HashMap<K, V> implements Map<K, V> {


    static class Entry<K, V> implements Map.Entry<K, V>{
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    final int sizeOfHashMap = 16;
    private Entry[] hashTable = new Entry[sizeOfHashMap];
    int size = 0;

    private int getHashCode(K key) {
        int h;
        return ((h = key.hashCode()) ^ h >>> 16) % sizeOfHashMap;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(K key) {
        int hashCode = getHashCode(key);
        Entry entry = hashTable[hashCode];
        while(true) {
            if(entry.key.equals(key)) {
                return true;
            }
            else if (entry.next == null) {
                return false;
            }
            else {
                entry = entry.next;
            }
        }
    }

    @Override
    public boolean containsValue(V value) {
        for (int i = 0; i < hashTable.length; i++) {
            Entry entry = hashTable[i];
            while(true) {
                if(entry == null) {
                    break;
                }
                else  if(entry.value.equals(value)) {
                    return true;
                }
                else if(entry.next == null) {
                    break;
                }
                else {
                    entry = entry.next;
                }
            }
        }
        return false;
    }

    @Override
    public V get(K key) {
        int hashCode = getHashCode(key);
        Entry entry = hashTable[hashCode];
        while(true) {
            if(entry.key.equals(key)) {
                return (V) entry.value;
            }
            else if (entry.next == null) {
                return null;
            }
            else {
                entry = entry.next;
            }
        }
    }

    @Override
    public V put(K key, V value) {
        Entry entry = new Entry(key, value);
        int hashCode = getHashCode(key);

        if(hashTable[hashCode] == null) {
            hashTable[hashCode] = entry;
            size++;
            return (V) entry.value;
        }
        else {
            Entry pointer = hashTable[hashCode];
            while(true) {
                if(pointer.key.equals(key)) {
                    pointer.value = value;
                    pointer.key = key;
                    return (V) entry.value;
                }
                else if(pointer.next == null) {
                    pointer.next = entry;
                    size++;
                    return (V) value;
                }
                else {
                    pointer = pointer.next;
                }
            }
        }
    }

    @Override
    public V remove(K key) {
        int hashCode = getHashCode(key);
        Entry pointer = hashTable[hashCode];
        Entry prePointer = hashTable[hashCode];
        while(true) {
            if(pointer.key.equals(key)) {
                prePointer.next = pointer.next;
                size--;
                return (V) pointer.value;
            }
            else if(pointer.next == null) {
                return null;
            }
            else {
                prePointer = pointer;
                pointer = pointer.next;
            }
        }
    }
}
