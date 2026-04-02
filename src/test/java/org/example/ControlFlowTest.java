package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ControlFlowTest {

    //Return INVALID
    @Test
    public void CFtest1() {
        assertEquals("INVALID", ARSystem.evaluate(-1, 15.0, 2));
    }

    //Return GREAT
    @Test
    public void CFtest2() {
        assertEquals("GREAT", ARSystem.evaluate(60, 15.0, 0));
    }

    //Return GOOD
    @Test
    public void CFtest3() {
        assertEquals("GOOD", ARSystem.evaluate(60, 25.0, 2));
    }

    //Return FAIL
    @Test
    public void CFtest4() {
        assertEquals("FAIL", ARSystem.evaluate(20, 15.0, 2));
    }
}