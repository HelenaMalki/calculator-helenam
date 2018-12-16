package calculator;

/**
 * Class that implements all operations from CalculatorBasicOperationsInterface
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {
    /**
     * {@inheritDoc}
     */
    public double addition(double a, double b) {
        return a + b;
    }
    /**
     * {@inheritDoc}
     */
    public double subtraction(double a, double b) {
        return a - b;
    }
    /**
     * {@inheritDoc}
     */
    public double division(double a, double b) {
        return a / b;
    }
    /**
     * {@inheritDoc}
     */
    public double multiply(double a, double b) {
        return a * b;
    }
}
