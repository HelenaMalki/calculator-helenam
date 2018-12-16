package calculator;

import calculator.CalculatorAdvancedOperations;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class CalculatorAdvancedOperationsTest {
    private CalculatorAdvancedOperations advancedOperations;
    private Random random = new Random();

    @Before
    public void setUp() throws Exception {
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
            assertEquals(Math.abs(a), result, 0);
        }
    }

    @Test
    public void cos() {
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
            assertEquals(Math.cos(Math.toRadians(a)), result, 0);
        }
    }

    @Test
    public void sqrt() {
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
            assertEquals(Math.sqrt(a), result, 0);
        }
    }

    @Test
    public void cbrt() {
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
            assertEquals(Math.cbrt(a), result, 0);
        }
    }

    @Test
    public void tan() {
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
            assertEquals(Math.tan(Math.toRadians(a)), result, 0);
        }
    }

    @Test
    public void sin() {
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
            assertEquals(Math.sin(Math.toRadians(a)), result, 0);
        }
    }
}