package com.eukolos.datastructures.map;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetTreeSetTest {

    private Set<String> hashSet;
    private Set<String> treeSet;

    @BeforeEach
    public void setUp() {
        // initialize the sets
        hashSet = new HashSet<>();
        treeSet = new TreeSet<>();

        // add some elements to both sets
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("orange");
        hashSet.add("mango");

        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("orange");
        treeSet.add("mango");
    }

    @Test
    public void testOrder() {
        // create iterators for both sets
        var hashIterator = hashSet.iterator();
        var treeIterator = treeSet.iterator();

        // create a string builder to store the elements
        var hashString = new StringBuilder();
        var treeString = new StringBuilder();

        // iterate over the sets and append the elements
        while (hashIterator.hasNext()) {
            hashString.append(hashIterator.next());
        }
        while (treeIterator.hasNext()) {
            treeString.append(treeIterator.next());
        }

        // assert that the hash set is not sorted
        Assert.assertNotEquals("applebananamangoorange", hashString.toString());

        // assert that the tree set is sorted
        Assert.assertEquals("applebananamangoorange", treeString.toString());
    }

    @Test
    public void testNull() {
        // try to add a null element to the hash set
        hashSet.add(null);

        // assert that the hash set contains the null element
        Assert.assertTrue(hashSet.contains(null));

        // try to add a null element to the tree set
        try {
            treeSet.add(null);
            // fail the test if no exception is thrown
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // pass the test if the exception is thrown
        }
    }

    @Test
    public void testPerformance() {
        // create a long variable to store the start time
        long startTime;

        // create a long variable to store the end time
        long endTime;

        // create a long variable to store the duration
        long duration;

        // add 10000 elements to the hash set and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the hash set
        System.out.println("HashSet add: " + duration + " nanoseconds");

        // add 10000 elements to the tree set and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the tree set
        System.out.println("TreeSet add: " + duration + " nanoseconds");

        // remove 10000 elements from the hash set and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the hash set
        System.out.println("HashSet remove: " + duration + " nanoseconds");

        // remove 10000 elements from the tree set and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.remove(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the tree set
        System.out.println("TreeSet remove: " + duration + " nanoseconds");

        // check if the hash set contains 10000 elements and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.contains(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the hash set
        System.out.println("HashSet contains: " + duration + " nanoseconds");

        // check if the tree set contains 10000 elements and measure the time
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.contains(String.valueOf(i));
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;

        // print the duration for the tree set
        System.out.println("TreeSet contains: " + duration + " nanoseconds");
    }


}
