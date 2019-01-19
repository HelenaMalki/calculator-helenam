package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CalculatorAdvancedOperationsTest {
    private CalculatorAdvancedOperations advancedOperations;
    private Random random = new Random();

    @Before
    public void setUp() {
        advancedOperations = new CalculatorAdvancedOperations();
    }

    private double generatePositiveRandomNumber() {
        return Math.round(random.nextDouble() * 100) / 10.0;
    }

    private double generateNegativeRandomNumber() {
        return -Math.round(random.nextDouble() * 100) / 10.0;
    }

    @Test
    public void abs() {
        System.out.println("=== Test abs ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.abs(a);
            System.out.println("test run: " + i +", abs(" + a + ") = " + result);
            assertEquals(Math.abs(a), result, 0);
        }
    }

    @Test
    public void cos() {
        System.out.println("=== Test cos ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.cos(a);
            System.out.println("test run: " + i + ", cos(" + a + ") = " + result);
            assertEquals(Math.cos(Math.toRadians(a)), result, 0);
        }
    }

    @Test
    public void sqrt() {
        System.out.println("=== Test sqrt ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.sqrt(a);
            System.out.println("test run: " + i + ", sqrt(" + a + ") = " + result);
            assertEquals(Math.sqrt(a), result, 0);
        }
    }

    @Test
    public void cbrt() {
        System.out.println("=== Test cbrt ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.cbrt(a);
            System.out.println("test run: " + i + ", cbrt(" + a + ") = " + result);
            assertEquals(Math.cbrt(a), result, 0);
        }
    }

    @Test
    public void tan() {
        System.out.println("=== Test tan ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.tan(a);
            System.out.println("test run: " + i + ", tan(" + a + ") = " + result);
            a = Math.toRadians(a);
            assertEquals(Math.tan(a), result, 0);
        }
    }

    @Test
    public void sin() {
        System.out.println("=== Test sin ===");
        for (int i = 0; i < 50; i++) {
            double a = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                }
            }
            double result = advancedOperations.sin(a);
            a = Math.toRadians(a);
            System.out.println("test run: " + i + ", sin(" + a + ") = " + result);
            assertEquals(Math.sin(a), result, 0);
        }
    }
}