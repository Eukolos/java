package com.eukolos.solid.open_closed.good.spec;

import com.eukolos.solid.open_closed.good.src.FormalPersonality;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        FormalPersonality fp = new FormalPersonality();
        assertEquals("Good evening, sir.", fp.greet());
    }
}
