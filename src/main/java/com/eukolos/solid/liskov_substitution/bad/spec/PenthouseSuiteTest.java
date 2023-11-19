package com.eukolos.solid.liskov_substitution.bad.spec;

import com.eukolos.solid.liskov_substitution.bad.src.PenthouseSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PenthouseSuiteTest {
    @Test
    public void testInitializedWithFourBedrooms() {
        PenthouseSuite penthouse = new PenthouseSuite();
        assertEquals(4, penthouse.numberOfBedrooms);
    }

    @Test
    public void testSetsSquareFootage() {
        PenthouseSuite penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        assertEquals(1500, penthouse.squareFootage);
    }
}