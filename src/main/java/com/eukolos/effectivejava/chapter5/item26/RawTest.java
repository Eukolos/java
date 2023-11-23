package com.eukolos.effectivejava.chapter5.item26;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RawTest {
    @Test
    public void testUnsafeAdd() {
        List<String> strings = new ArrayList<>();
        Raw.unsafeAdd(strings, Integer.valueOf(42));
        assertEquals(1, strings.size());
        assertThrows(ClassCastException.class, () -> {
            String s = strings.get(0);
        });
    }

    @Test
    public void testUnsafeAddWithBoolean() {
        List<String> strings = new ArrayList<>();
        Raw.unsafeAdd(strings,Boolean.TRUE);
        assertEquals(1, strings.size());
        assertThrows(ClassCastException.class, () -> {
            String s = strings.get(0);
        });
    }
}
