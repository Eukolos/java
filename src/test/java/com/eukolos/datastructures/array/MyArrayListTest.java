package com.eukolos.datastructures.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testAddAndGet() {
        MyArrayList myList = new MyArrayList();
        myList.add(42);
        assertEquals(42, myList.get(0));
    }

    @Test
    public void testSet() {
        MyArrayList myList = new MyArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.set(1, 25);

        assertEquals(25, myList.get(1));
    }

    @Test
    public void testRemove() {
        MyArrayList myList = new MyArrayList();
        myList.add(5);
        myList.add(10);
        myList.add(15);

        myList.remove(1);

        assertEquals(5, myList.get(0));
        assertEquals(15, myList.get(1));
        assertEquals(2, myList.size());
    }

    @Test
    public void testGetOutOfBounds() {
        MyArrayList myList = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.get(0));
    }

    @Test
    public void testSetOutOfBounds() {
        MyArrayList myList = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.set(1, 42));
    }

    @Test
    public void testRemoveOutOfBounds() {
        MyArrayList myList = new MyArrayList();
        assertThrows(IndexOutOfBoundsException.class, () -> myList.remove(0));
    }

    @Test
    public void testIsEmpty() {
        MyArrayList emptyList = new MyArrayList();
        assertTrue(emptyList.isEmpty());

        MyArrayList nonEmptyList = new MyArrayList();
        nonEmptyList.add(100);
        assertFalse(nonEmptyList.isEmpty());
    }

    @Test
    public void testSize() {
        MyArrayList myList = new MyArrayList();
        assertEquals(0, myList.size());

        myList.add(1);
        myList.add(2);
        assertEquals(2, myList.size());
    }

    @Test
    public void testCapacity() {
        MyArrayList myList = new MyArrayList();
        myList.add(3);
        myList.add(4);
        myList.add(5);
        assertEquals(10, myList.capacity());
    }
}
