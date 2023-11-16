package com.eukolos.solid.dependency_inversion.good.spec;

import com.eukolos.solid.dependency_inversion.good.src.EmailClient;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailClientTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testAlertsWhenSunny() {
        EmailClient gmail = new EmailClient();
        System.setOut(new PrintStream(outContent));
        gmail.alertWeatherConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
