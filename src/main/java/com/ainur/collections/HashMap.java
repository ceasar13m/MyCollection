package com.ainur.collections;

public class HashMap<K, V> implements Map<K, V> {

    private class Entry{
        final K key;
        final V value;
        Entry next;

        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    final int sizeOfHashMap = 16;
    private HashMap.Entry[] hashTable = new HashMap.Entry[sizeOfHashMap];

    private int getHashCode(K key) {
        int h;
        return key == null ? 0 : (h = key.hashCode()) ^ h >>> 16;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        Entry entry = new Entry(key, value);
        int hashCode = getHashCode(key);

        if(hashTable[hashCode] == null) {
            hashTable[hashCode] = entry;
            return (V) hashTable[hashCode].value;
        }
        else {
            entry.next = hashTable[hashCode].next;
            hashTable[hashCode].next = entry;
        }
    }

    @Override
    public V remove(K key) {
        int hashCode = getHashCode(key);
        Entry entry = hashTable[hashCode];
        Entry temp  = null;
        while (entry != null){
            if(entry.key.equals(key)) {
                if(temp == null) {
                    V value = entry.value;
                    hashTable[hashCode] = hashTable[hashCode].next;
                    return value;
                }
                temp.next = entry.next;
                entry.next = null;
                return entry.value;
            } else {
                temp = entry;
                entry = entry.next;
            }
        }

        return null;
    }
}
