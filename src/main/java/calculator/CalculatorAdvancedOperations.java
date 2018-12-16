package calculator;

/**
 * Class that implements all operations from CalculatorAdvancedOperationsInterface
 */
public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

    /**
     * {@inheritDoc}
     */
    public double abs(double a) {
        return Math.abs(a);
    }
    /**
     * {@inheritDoc}
     */
    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }
    /**
     * {@inheritDoc}
     */
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
    /**
     * {@inheritDoc}
     */
    public double cbrt(double a) {
        return Math.cbrt(a);
    }
    /**
     * {@inheritDoc}
     */
    public double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }
    /**
     * {@inheritDoc}
     */
    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }
}
