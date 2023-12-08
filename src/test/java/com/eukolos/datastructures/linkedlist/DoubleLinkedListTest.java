package com.eukolos.datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleLinkedListTest {

    @Test
    public void givenEmptyList_whenAddElements_thenElementsAreAppended() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void givenListWithElements_whenAddFirst_thenElementIsAddedAtBeginning() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.addFirst(0);

        assertEquals(0, list.get(0));
        assertEquals(1, list.get(1));
    }

    @Test
    public void givenListWithElements_whenAddLast_thenElementIsAddedAtEnd() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.addLast(2);

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void givenListWithElements_whenReplace_thenElementIsReplaced() {
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
    public void givenListWithElements_whenRemove_thenLastElementIsRemoved() {
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
    public void givenListWithElements_whenRemoveFirst_thenFirstElementIsRemoved() {
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
    public void givenListWithElements_whenRemoveLast_thenLastElementIsRemoved() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeLast();

        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void givenListWithElements_whenReverse_thenOrderIsReversed() {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.reverse();

        assertEquals(3, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(1, list.get(2));
    }
}
