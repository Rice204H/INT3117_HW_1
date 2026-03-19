package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecisionTest {

    @Test
    public void testRule1() {
        assertEquals("INVALID", ARSystem.evaluate(150, 15.0, 2));
    }

    @Test
    public void testRule2() {
        assertEquals("FAIL", ARSystem.evaluate(20, 15.0, 2));
    }

    @Test
    public void testRule3() {
        assertEquals("FAIL", ARSystem.evaluate(60, 25.0, 5));
    }

    @Test
    public void testRule4() {
        assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 5));
    }

    @Test
    public void testRule5() {
        assertEquals("GOOD", ARSystem.evaluate(60, 25.0, 2));
    }

    @Test
    public void testRule6() {
        assertEquals("GREAT", ARSystem.evaluate(60, 15.0, 0));
    }

    @Test
    public void testRule7() {
        assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 2));
    }
}