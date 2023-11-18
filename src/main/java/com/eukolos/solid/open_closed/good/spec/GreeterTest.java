package com.eukolos.solid.open_closed.good.spec;

import com.eukolos.solid.open_closed.good.src.Greeter;
import com.eukolos.solid.open_closed.good.src.Personality;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MockPersonality implements Personality {
    public String greet() {
        return "foo";
    }
}

public class GreeterTest {
    @Test
    public void testGreetsSomeone() {
        MockPersonality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);

        assertEquals("foo", greeter.greet());
    }
}
