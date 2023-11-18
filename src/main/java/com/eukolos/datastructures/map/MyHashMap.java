package com.eukolos.datastructures.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHashMap<K, V> {
    private final static int DEFAULT_CAPACITY = 16;

    private List<Entry<K, V>>[] table;
    private Set<K> keys;

    public MyHashMap() {
        table = new ArrayList[DEFAULT_CAPACITY];
        keys = new HashSet<>();
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            table[i] = new ArrayList<>();
        }
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

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

        int index = key.hashCode() % DEFAULT_CAPACITY;
        List<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        keys.add(key);
    }

    public V get(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = key.hashCode() % DEFAULT_CAPACITY;
        List<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }

        int index = key.hashCode() % DEFAULT_CAPACITY;
        List<Entry<K, V>> bucket = table[index];

        bucket.removeIf(entry -> entry.key.equals(key));
        keys.remove(key);
    }

    public boolean containsKey(K key) {
        return keys.contains(key);
    }

    public boolean containsValue(V value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }

        for (List<Entry<K, V>> bucket : table) {
            for (Entry<K, V> entry : bucket) {
                if (entry.value.equals(value)) {
                    return true;
                }
            }
        }

        return false;
    }

    public int size() {
        return keys.size();
    }
}