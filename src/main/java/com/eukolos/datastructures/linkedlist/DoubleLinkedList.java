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

    public void addLast(int value) {
        add(value);
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.setNext(head);
        head.setPrevious(node);
        head = node;
    }

    public void replace(int index, int value) {
        Node node = head;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                node.setValue(value);
                return;
            }
            node = node.getNext();
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        if (head == null) {
            return;
        }
        tail = tail.getPrevious();
        tail.setNext(null);
    }

    public void removeLast() {
        remove();
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.getNext();
        head.setPrevious(null);
    }

    public int get(int index) {
        Node node = head;
        int counter = 0;
        while (node != null) {
            if (counter == index) {
                return node.getValue();
            }
            node = node.getNext();
            counter++;
        }
        throw new IndexOutOfBoundsException();
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
