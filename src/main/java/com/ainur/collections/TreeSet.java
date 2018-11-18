package com.ainur.collections;

import java.util.Comparator;

public class TreeSet<T extends Comparable> implements Set<T>{

    static class Node<T> {
        T t;

        Node left;
        Node right;

        Node(T t) {
            this.t = t;
        }
    }

    Node root;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) {
        return false;
    }

    @Override
    public void add(T t) {
        Node node = new Node(t);
        Node temp = root;
        if (root == null) {
            root = node;
        }
        else {
            while (true) {
                if (node.t.equals(temp.t))
                    break;
                else if (node.t.compareTo()) {
                    if (temp.right == null) {
                        temp.right = node;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
        }
    }

    @Override
    public void remove(T t) {

    }






}
