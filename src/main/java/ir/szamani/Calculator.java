package ir.szamani;

import java.util.Random;

public class Calculator {
    public int sum(int a, int b) {
        subtract(a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        int c = 23;
        int d;
        Random random = new Random();
        d = c * random.nextInt();
        subtract(c, d);
        return a * b;
    }
}
