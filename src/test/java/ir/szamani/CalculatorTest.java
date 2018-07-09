package ir.szamani;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int[] values = createCalculatorTest(0);
        Assert.assertEquals(values[2], calculator.sum(values[0], values[1]));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int[] values = createCalculatorTest(1);
        Assert.assertEquals(values[2], calculator.subtract(values[0], values[1]));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int[] values = createCalculatorTest(2);
        Assert.assertEquals(values[2], calculator.multiply(values[0], values[1]));
    }

    private int[] createCalculatorTest(int op) {
        int a = 3;
        int b = 2;
        int res;
        switch (op) {
            case 0:
                res = 5;
                break;
            case 1:
                res = 1;
                break;
            case 2:
                res = 6;
                break;
            default:
                res = 11;
        }
        return new int[]{a, b, res};
    }
}
