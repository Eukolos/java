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
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        System.out.println(map.getAll());
    }
}
