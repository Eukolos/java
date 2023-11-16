package com.eukolos.datastructures.map;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyHashMapTest {
    private MyHashMap<Integer, String> map;

    @BeforeEach
    public void setup() {
        map = new MyHashMap<>();
    }

    @Test
    public void testPutAndGet() {
        map.put(1, "one");
        assertEquals("one", map.get(1));
    }

    @Test
    public void testRemove() {
        map.put(1, "one");
        map.remove(1);
        assertNull(map.get(1));
    }

    @Test
    public void testContainsKey() {
        map.put(1, "one");
        assertTrue(map.containsKey(1));
        assertFalse(map.containsKey(2));
    }

    @Test
    public void testContainsValue() {
        map.put(1, "one");
        assertTrue(map.containsValue("one"));
        assertFalse(map.containsValue("two"));
    }

    @Test
    public void testSize() {
        map.put(1, "one");
        map.put(2, "two");
        assertEquals(2, map.size());
    }
    // failed test
    @Test
    public void uniqueKeys() {
        map.put(1, "one");
        map.put(1, "two");
        assertEquals(1, map.size());
    }
}