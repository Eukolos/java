package com.eukolos.solid.interface_segregation.good.spec;

import com.eukolos.solid.interface_segregation.good.src.Eagle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EagleTest {
    @Test
    public void testItCanFly() {
        Eagle eagle = new Eagle(5);
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItLosesFeathers() {
        Eagle eagle = new Eagle(5);
        eagle.molt();
        assertEquals(4, eagle.numberOfFeathers);
    }
}