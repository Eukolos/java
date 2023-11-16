package com.eukolos.solid.dependency_inversion.bad.spec;

import com.eukolos.solid.dependency_inversion.bad.src.WeatherTracker;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testReturnsCurrentWeather() {
        WeatherTracker tracker = new WeatherTracker();
        tracker.setCurrentConditions("rainy");

        assertEquals("rainy", tracker.getCurrentConditions());
    }

    @Test
    public void testAlertsPhoneUsersWhenRaining() {
        WeatherTracker tracker = new WeatherTracker();
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }

    @Test
    public void testAlertsViaEmailWhenSunny() {
        WeatherTracker tracker = new WeatherTracker();
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}