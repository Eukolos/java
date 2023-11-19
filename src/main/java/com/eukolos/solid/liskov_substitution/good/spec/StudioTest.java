package com.eukolos.solid.liskov_substitution.good.spec;

import com.eukolos.solid.liskov_substitution.good.src.Studio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfRooms);
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        assertEquals(550, studio.squareFootage);
    }
}