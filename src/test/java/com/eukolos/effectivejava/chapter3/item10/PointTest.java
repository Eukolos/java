package com.eukolos.effectivejava.chapter3.item10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testEquals() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        assertTrue(p1.equals(p2));
    }

}