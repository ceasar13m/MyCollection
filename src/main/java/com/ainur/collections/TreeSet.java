package com.ainur.collections;

public class TreeSet<T> implements Set<T>{

    static class Node<T extends Comparable>{
        T t;

        Node left;
        Node right;

        Node(T t) {
            this.t = t;
        }
    }

    Node root;
    int size = 0;

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
        return false;
    }

    @Override
    public void add(T t) {
        Node node = new Node((Comparable) t);
        Node temp = root;
        if (root == null) {
            root = node;
            size++;
        }
        else {
            while (true) {
                if (node.t.equals(temp.t))
                    break;
                else if (node.t.compareTo(temp.t) == 1) {
                    if (temp.right == null) {
                        temp.right = node;
                        size++;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = node;
                        size++;
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
