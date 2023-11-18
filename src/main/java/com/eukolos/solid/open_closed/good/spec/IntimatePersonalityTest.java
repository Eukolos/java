package com.eukolos.solid.open_closed.good.spec;

import com.eukolos.solid.open_closed.good.src.IntimatePersonality;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hello Darling!", ip.greet());
    }
}