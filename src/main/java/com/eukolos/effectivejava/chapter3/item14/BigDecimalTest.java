package com.eukolos.effectivejava.chapter3.item14;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

public class BigDecimalTest {

    @Test
    public void testEquals() {
        // create a BigDecimal object with value 1.00
        BigDecimal bd1 = new BigDecimal("1.00");

        // create another BigDecimal object with value 1.0
        BigDecimal bd2 = new BigDecimal("1.0");

        // assert that bd1 and bd2 are not equal using equals method
        Assert.assertFalse(bd1.equals(bd2));

        // create a HashSet of BigDecimal objects
        Set<BigDecimal> hashSet = new HashSet<>();

        // add bd1 and bd2 to the hash set
        hashSet.add(bd1);
        hashSet.add(bd2);

        // assert that the hash set contains two elements
        Assert.assertEquals(2, hashSet.size());

        // create a TreeSet of BigDecimal objects
        Set<BigDecimal> treeSet = new TreeSet<>();

        // add bd1 and bd2 to the tree set
        treeSet.add(bd1);
        treeSet.add(bd2);

        // assert that the tree set contains one element
        Assert.assertEquals(1, treeSet.size());
    }

    @Test
    public void testCompare() {
        // create a BigDecimal object with value 1.00
        BigDecimal bd1 = new BigDecimal("1.00");

        // create another BigDecimal object with value 1.0
        BigDecimal bd2 = new BigDecimal("1.0");

        // assert that bd1 and bd2 are equal using compare method
        Assert.assertEquals(0, bd1.compareTo(bd2));

        // create a HashSet of BigDecimal objects
        Set<BigDecimal> hashSet = new HashSet<>();

        // add bd1 and bd2 to the hash set
        hashSet.add(bd1);
        hashSet.add(bd2);

        // assert that the hash set contains two elements
        Assert.assertEquals(2, hashSet.size());

        // create a TreeSet of BigDecimal objects
        Set<BigDecimal> treeSet = new TreeSet<>();

        // add bd1 and bd2 to the tree set
        treeSet.add(bd1);
        treeSet.add(bd2);

        // assert that the tree set contains one element
        Assert.assertEquals(1, treeSet.size());
    }
}