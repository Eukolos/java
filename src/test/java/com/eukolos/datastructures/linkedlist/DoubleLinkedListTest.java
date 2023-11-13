package com.eukolos.datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {

    @Test
    public void testAdd() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testAddFirst() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.addFirst(0);

        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    public void testAddLast() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.addLast(2);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void testReplace() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.replace(1, 5);

        assertEquals(1, list.get(0));
        assertEquals(5, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testRemove() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove();

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void testRemoveFirst() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeFirst();

        assertEquals(2, list.get(0));
        assertEquals(3, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void testRemoveLast() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeLast();

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }
}