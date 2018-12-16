package calculator;

import calculator.CalculatorBasicOperations;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CalculatorBasicOperationsTest {
    private CalculatorBasicOperations basicOperations;
    private Random random = new Random();

    @Before
    public void setUp() throws Exception {
        basicOperations = new CalculatorBasicOperations();
    }

    private double generatePositiveRandomNumber() {
        return Math.round(random.nextDouble() * 100) / 10.0;
    }

    private double generateNegativeRandomNumber() {
        return -Math.round(random.nextDouble() * 100) / 10.0;
    }

    @Test
    public void addition() {
        for (int i = 0; i < 50; i++) {
            double a = 0;
            double b = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                    b = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                    b = generatePositiveRandomNumber();
                }
            }
            double result = basicOperations.addition(a, b);
            assertEquals(a + b, result, 0);
        }
    }

    @Test
    public void subtraction() {
        for (int i = 0; i < 50; i++) {
            double a = 0;
            double b = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                    b = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                    b = generatePositiveRandomNumber();
                }
            }
            double result = basicOperations.subtraction(a, b);
            assertEquals(a - b, result, 0);
        }
    }

    @Test
    public void division() {
        for (int i = 0; i < 50; i++) {
            double a = 0;
            double b = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                    b = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                    b = generatePositiveRandomNumber();
                }
            }
            double result = basicOperations.division(a, b);
            assertEquals(a / b, result, 0);
        }
    }

    @Test
    public void multiply() {
        for (int i = 0; i < 50; i++) {
            double a = 0;
            double b = 0;
            if (i > 0) {
                if ((i % 2) == 0) {
                    a = generateNegativeRandomNumber();
                    b = generateNegativeRandomNumber();
                } else {
                    a = generatePositiveRandomNumber();
                    b = generatePositiveRandomNumber();
                }
            }
            double result = basicOperations.multiply(a, b);
            assertEquals(a * b, result, 0);
        }
    }
}