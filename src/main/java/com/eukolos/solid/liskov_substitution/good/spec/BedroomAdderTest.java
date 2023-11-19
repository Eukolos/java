package com.eukolos.solid.liskov_substitution.good.spec;

import com.eukolos.solid.liskov_substitution.good.src.BedroomAdder;
import com.eukolos.solid.liskov_substitution.good.src.PenthouseSuite;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BedroomAdderTest {
    @Test
    public void testAddsBedroomToPenthouse() {
        PenthouseSuite penthouse = new PenthouseSuite();
        BedroomAdder adder = new BedroomAdder();
        adder.addBedroom(penthouse);

        assertEquals(5, penthouse.numberOfBedrooms);
    }
}