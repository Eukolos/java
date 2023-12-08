package com.eukolos.datastructures.linkedlist;

public class DoubleLinkedList {

    private Node head;
    private Node tail;

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        head.setPrevious(node);
        node.setNext(head);
        head = node;
    }

    public void addLast(int value) {
        add(value);
    }

    public void replace(int index, int value) {
        validateIndex(index);
        Node node = getNodeAtIndex(index);
        node.setValue(value);
    }

    public void remove() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        tail = tail.getPrevious();
        if (tail != null) {
            tail.setNext(null);
        }
    }

    public void removeLast() {
        remove();
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        head = head.getNext();
        if (head != null) {
            head.setPrevious(null);
        }
    }

    public int get(int index) {
        validateIndex(index);
        Node node = getNodeAtIndex(index);
        return node.getValue();
    }

    private void validateIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
    }

    private Node getNodeAtIndex(int index) {
        Node node = head;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                return node;
            }
            node = node.getNext();
            counter++;
        }
        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public void reverse() {
        Node temp = null;
        Node current = head;

        // Swap next and previous for all nodes of doubly linked list
        while (current != null) {
            temp = current.getPrevious();
            current.setPrevious(current.getNext());
            current.setNext(temp);
            current = current.getPrevious();
        }

        // Before changing head, check for the cases like empty list and list with only one node
        if (temp != null) {
            head = temp.getPrevious();
        }
    }

    private static class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}