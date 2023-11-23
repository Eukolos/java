package com.eukolos.effectivejava.chapter5.item29;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StackTechOneTest {
    @Test
    public void testStackOperations() {
        StackTechOne<String> stack = new StackTechOne<>();
        assertTrue(stack.isEmpty());

        stack.push("Test");
        assertFalse(stack.isEmpty());

        String poppedElement = stack.pop();
        assertEquals("Test", poppedElement);
        assertTrue(stack.isEmpty());
    }
}
