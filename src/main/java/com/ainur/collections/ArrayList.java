package com.ainur.collections;

public class ArrayList<T> implements List<T> {
    private final int initSize = 16;
    private Object[] array;
    private int pointer = 0;

    public ArrayList(int sizeOfHashMap) {
        array  = new Object[sizeOfHashMap];
    }

    void ArrayList() {
        array  = new Object[initSize];
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < pointer; i++) {
            if(array[i].equals(t))
                return true;
        }
        return false;
    }

    @Override
    public void add(T t) {
        if(pointer == array.length - 1) {
            resize(array.length*3/2 + 1);
        }

        array[pointer++] = t;
    }

    @Override
    public void remove(T t) {
        int x = -1;
        for (int i = 0; i < pointer; i++) {
            if(array[i].equals(t)) {
                x = i;
                break;
            }
        }

        if(x >= 0) {
            for (int i = x; i < pointer; i++) {
                array[i] = array[i + 1];
            }
            array[pointer] = null;
            pointer--;
        }

    }

    private void resize(int length) {
        Object[] newArray = new Object[length];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
