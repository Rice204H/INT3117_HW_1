package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoundaryTest {

    //Normal
    @Test public void test01() { assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 5)); }

    //Normal a
    @Test public void test02() { assertEquals("FAIL", ARSystem.evaluate(0, 15.0, 5)); }
    @Test public void test03() { assertEquals("FAIL", ARSystem.evaluate(1, 15.0, 5)); }
    @Test public void test04() { assertEquals("GOOD", ARSystem.evaluate(119, 15.0, 5)); }
    @Test public void test05() { assertEquals("GOOD", ARSystem.evaluate(120, 15.0, 5)); }
    @Test public void test06() { assertEquals("INVALID", ARSystem.evaluate(-1, 15.0, 5)); }
    @Test public void test07() { assertEquals("INVALID", ARSystem.evaluate(121, 15.0, 5)); }

    //Normal b
    @Test public void test08() { assertEquals("GOOD", ARSystem.evaluate(60, 0.1, 5)); }
    @Test public void test09() { assertEquals("GOOD", ARSystem.evaluate(60, 0.0, 5)); }
    @Test public void test10() { assertEquals("FAIL", ARSystem.evaluate(60, 99.9, 5)); }
    @Test public void test11() { assertEquals("FAIL", ARSystem.evaluate(60, 100.0, 5)); }
    @Test public void test12() { assertEquals("INVALID", ARSystem.evaluate(60, -0.1, 5)); }
    @Test public void test13() { assertEquals("INVALID", ARSystem.evaluate(60, 100.1, 5)); }

    //Normal c
    @Test public void test14() { assertEquals("GREAT", ARSystem.evaluate(60, 15.0, 0)); }
    @Test public void test15() { assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 1)); }
    @Test public void test16() { assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 9)); }
    @Test public void test17() { assertEquals("GOOD", ARSystem.evaluate(60, 15.0, 10)); }
    @Test public void test18() { assertEquals("INVALID", ARSystem.evaluate(60, 15.0, -1)); }
    @Test public void test19() { assertEquals("INVALID", ARSystem.evaluate(60, 15.0, 11)); }
}