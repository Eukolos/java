package com.eukolos.solid.interface_segregation.bad.spec;

import com.eukolos.solid.interface_segregation.bad.src.Penguin;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenguinTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testItLosesFeathers() {
        Penguin penguin = new Penguin(5);
        penguin.molt();
        assertEquals(4, penguin.numberOfFeathers);
    }

    @Test
    public void testItCantActuallyFly() {
        Penguin penguin = new Penguin(5);
        exception.expect(UnsupportedOperationException.class);
        penguin.fly();
    }

    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin(5);
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }
}