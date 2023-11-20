package com.eukolos.solid.interface_segregation.good.spec;

import com.eukolos.solid.interface_segregation.good.src.Penguin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {
    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin(5);
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }

    @Test
    public void testItLosesFeathersQuickly() {
        Penguin penguin = new Penguin(5);
        penguin.molt();
        assertEquals(1, penguin.numberOfFeathers);
    }
}
