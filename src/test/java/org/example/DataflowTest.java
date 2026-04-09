package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataflowTest {
    //TC1: INVALID

    @Test
    public void testEvaluate_Invalid() {
        int a = -1;
        double b = 0.0;
        int c = 0;
        String result = ARSystem.evaluate(a, b, c);
        assertEquals("INVALID", result);
    }

    //TC2: GREAT
    @Test
    public void testEvaluate_Great() {
        int a = 35;
        double b = 10.0;
        int c = 0;
        String result = ARSystem.evaluate(a, b, c);
        assertEquals("GREAT", result);
    }

    //TC3: GOOD
    @Test
    public void testEvaluate_Good() {
        int a = 35;
        double b = 25.0;
        int c = 2;
        String result = ARSystem.evaluate(a, b, c);
        assertEquals("GOOD", result);
    }

    //TC4: FAIL
    @Test
    public void testEvaluate_Fail() {
        int a = 10;
        double b = 50.0;
        int c = 5;
        String result = ARSystem.evaluate(a, b, c);
        assertEquals("FAIL", result);
    }
}