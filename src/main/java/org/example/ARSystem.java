package org.example;

public class ARSystem {
    public static String evaluate(int a, double b, int c) {

        if (a < 0 || a > 120 || b < 0.0 || b > 100.0 || c < 0 || c > 10) {
            return "INVALID";
        }

        boolean passTc1 = a >= 30;
        boolean passTc2 = b <= 20.0;
        boolean passTc3 = c <= 3;

        if (passTc1 && passTc2 ) {
            return "GREAT";
        }

        if (passTc1 && (passTc2 || passTc3)) {
            return "GOOD";
        }

        // 5. FAIL
        return "FAIL";
    }
}