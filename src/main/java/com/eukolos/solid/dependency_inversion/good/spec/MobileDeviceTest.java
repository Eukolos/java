package com.eukolos.solid.dependency_inversion.good.spec;

import com.eukolos.solid.dependency_inversion.good.src.MobileDevice;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MobileDeviceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenRainy() {
        MobileDevice iPhone = new MobileDevice();
        System.setOut(new PrintStream(outContent));
        iPhone.alertWeatherConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }
}