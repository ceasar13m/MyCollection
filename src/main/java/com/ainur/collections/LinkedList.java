package com.ainur.collections;

public class LinkedList<T> implements List<T> {

    private class Node {
        T value;
        public Node(T value) {
            this.value = value;
        }
        Node next;
        Node pre;
    }

    private Node root;
    private Node temp;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T t) {
        Node node = root;
        while(true) {
            if(node.value.equals(t)) {
                return true;
            }
            if(node.next == null) {
                return false;
            }

            node = node.next;
        }
    }

    @Override
    public void add(T t) {
        Node node = new Node(t);
        while(true) {
            if (root == null) {
                root = node;
                temp = root;
                size++;
                break;
            } else {
                if (temp.next == null) {
                    temp.next = node;
                    node.pre = temp;
                    temp = temp.next;
                    size++;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    @Override
    public void remove(T t) {
        Node node = root;
        while(true) {
            if(node.value.equals(t)) {
                node.pre.next = node.next;
                node.next = null;
                break;
            }
            if(node.next == null) {
                break;
            }

            node = node.next;
        }
    }
}
