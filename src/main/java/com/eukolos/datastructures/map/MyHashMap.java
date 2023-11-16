package com.eukolos.datastructures.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Objects.hash;

public class MyHashMap<K, V> {
    private final static int DEFAULT_CAPACITY = 16;

    private Entry<K, V>[] table = new Entry[DEFAULT_CAPACITY];

    private static class Entry<K, V> {
        private final K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (!(obj instanceof Entry)) {
                return false;
            }

            Entry<K, V> other = (Entry<K, V>) obj;
            return this.key.equals(other.key);
        }

        @Override
        public int hashCode() {
            return key.hashCode();
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
    public void put(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = hash(key);
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> entry = new Entry<>(key, value);

        if (table[index] == null) {
            table[index] = entry;
        } else {
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = entry;
        }
    }
    public String get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = hash(key);
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value.toString();
            }
            entry = entry.next;
        }
        return null;
    }

    public void remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = hash(key);
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> entry = table[index];

        if (entry.key.equals(key)) {
            table[index] = entry.next;
        } else {
            Entry<K, V> previous = entry;
            while (entry != null) {
                if (entry.key.equals(key)) {
                    previous.next = entry.next;
                    return;
                }
                previous = entry;
                entry = entry.next;
            }
        }
    }

    public boolean containsKey(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int hash = hash(key);
        int index = hash % DEFAULT_CAPACITY;

        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }

    public boolean containsValue(V value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        for (Entry<K, V> entry : table) {
            while (entry != null) {
                if (entry.value.equals(value)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    public int size() {
        int size = 0;
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                size++;
                entry = entry.next;
            }
        }
        return size;
    }



    // its only for testing
    public List<Entry<K, V>> getAll() {
        List<Entry<K, V>> entries = new ArrayList<>();
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                entries.add(entry);
                entry = entry.next;
            }
        }
        return entries;
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(1, 2);
        map.put(2, 3);
        System.out.println(map.get(1));

        System.out.println(map.getAll());
    }
}
