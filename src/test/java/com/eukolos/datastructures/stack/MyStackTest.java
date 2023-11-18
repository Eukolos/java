package com.eukolos.datastructures.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void shouldPopWhenStackHasValue() {
        MyStack<Integer> myStack = new MyStack<>(3);
        myStack.push(2);
        myStack.push(4);
        myStack.push(98);

        assertThat(myStack.pop()).isEqualTo(98);
        assertThat(myStack.pop()).isEqualTo(4);
        assertThat(myStack.pop()).isEqualTo(2);
    }

    @Test
    void shouldReturnNullWhenStackIsEmpty() {
        MyStack<Integer> myStack = new MyStack<>(3);

        assertThat(myStack.pop()).isNull();
    }

    @Test
    void shouldFailWhenStackIsFull() {
        MyStack<Integer> myStack = new MyStack<>(3);
        myStack.push(2);
        myStack.push(4);
        myStack.push(98);

        assertThatThrownBy(() -> myStack.push(1))
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("Stack is full");
    }

    @Test
    void shouldPeekWhenStackHasValue() {
        MyStack<Integer> myStack = new MyStack<>(3);
        assertThat(myStack.peek()).isNull();
        myStack.push(2);
        myStack.push(4);
        myStack.push(98);

        assertThat(myStack.peek()).isEqualTo(98);
        assertThat(myStack.peek()).isEqualTo(98);
    }

    @Test
    void shouldWorkWhenUseString() {
        MyStack<String> myStack = new MyStack<>(3);
        myStack.push("emin");
        myStack.push("4");
        myStack.push("98");

        assertThat(myStack.pop()).isEqualTo("98");
        assertThat(myStack.pop()).isEqualTo("4");
        assertThat(myStack.pop()).isEqualTo("emin");
    }

    @Test
    void shouldWorkWhenUseCloneMethod() {
        MyStack<String> myStack = new MyStack<>(3);
        myStack.push("emin");
        myStack.push("4");
        myStack.push("98");

        MyStack<String> clone = myStack.clone();

        assertThat(clone.pop()).isEqualTo("98");
        assertThat(clone.pop()).isEqualTo("4");
        assertThat(clone.pop()).isEqualTo("emin");
    }

}