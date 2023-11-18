package com.eukolos.solid.open_closed.good.spec;

import com.eukolos.solid.open_closed.good.src.CasualPersonality;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasualPersonalityTest {
    @Test
    public void testGreetsSomeoneCasually() {
        CasualPersonality cp = new CasualPersonality();
        assertEquals("Sup bro?", cp.greet());
    }
}