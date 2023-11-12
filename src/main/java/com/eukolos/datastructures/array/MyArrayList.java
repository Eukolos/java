package com.eukolos.datastructures.array;


// generated with TDD pattern
public class MyArrayList {

    private int[] list;
    private int size;

    public MyArrayList() {
        list = new int[10];
        size = 0;
    }
    public MyArrayList(int initialCapacity) {
        list = new int[initialCapacity];
        size = 0;
    }

    public void add(int value) {
        if (size == list.length) {
            int[] newList = new int[list.length * 2];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size] = value;
        size++;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        list[index] = value;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return list[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return list.length;
    }
}
