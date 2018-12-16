package calculator;

/**
 * Interface for basic calculation operations
 */
public interface CalculatorBasicOperationsInterface {
    /**
     * Returns the addition value of a and b.
     *
     * @param a double, a value
     * @param b double, a value
     * @return double, the addition value of a and b
     */
    double  addition(double a, double b);

    /**
     * Returns the subtraction value of a and b.
     *
     * @param a double, a value
     * @param b double, a value
     * @return double, the subtraction value of a and b
     */
    double  subtraction(double a, double b);

    /**
     * Returns the division value of a and b.
     *
     * @param a double, a value
     * @param b double, a value
     * @return double, the division value of a and b
     */
    double  division(double a, double b);

    /**
     * Returns the multiplication value of a and b.
     *
     * @param a double, a value
     * @param b double, a value
     * @return double, the multiplication value of a and b
     */
    double  multiply(double a, double b);
}
