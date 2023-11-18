package com.eukolos.datastructures.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

// generated with TDD pattern
public class MyStack<T> implements Cloneable {
    private int maxSize;
    private int top;
    private T arr[];

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.arr = (T[]) new Object[maxSize];
    }

    public void push(T value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        arr[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        return arr[top--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public MyStack<T> clone() {
        try {
            MyStack<T> clone = (MyStack<T>) super.clone();
            clone.arr = arr.clone(); // this saves us from null pointer exception
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    /*
    bad ways to clone
    @Override
    public MyStack<T> clone() {
        try {
            MyStack<T> clone = (MyStack<T>) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    */
}