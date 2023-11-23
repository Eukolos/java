package com.eukolos.effectivejava.chapter4.item25;

//Static member classes instead of multiple top-level classes (Page 116)

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Utensil {
    public static final String NAME = "pan";
}

class Dessert {
    public static final String NAME = "cake";
}

class UtensilTest {
    @Test
    public void testName() {
        assertEquals("pan", Utensil.NAME);
    }
}

class DessertTest {
    @Test
    public void testName() {
        assertEquals("cake", Dessert.NAME);
    }
}

