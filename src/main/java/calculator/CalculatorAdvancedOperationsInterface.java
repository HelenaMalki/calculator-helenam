package calculator;

/**
 * Interface for advanced calculation operations
 */
public interface CalculatorAdvancedOperationsInterface {
    /**
     * Returns the absolute value of a value.
     *
     * @param a double, the argument whose absolute value is to be determined
     * @return double, the absolute value of the argument.
     */
    double abs(double a);

    /**
     * Returns the hyperbolic cosine of a value.
     *
     * @param a double, The number whose hyperbolic cosine is to be returned.
     * @return double, The hyperbolic cosine of a.
     */
    double cos(double a);

    /**
     * Returns the correctly rounded positive square root.
     *
     * @param a double, a value
     * @return double, the positive square root of a.
     */
    double sqrt(double a);

    /**
     * Returns the cube root.
     *
     * @param a double, a value
     * @return double, the cube root of a.
     */
    double cbrt(double a);

    /**
     * Returns the trigonometric tangent of an angle.
     *
     * @param a double, an angle, in radians.
     * @return double, the tangent of the argument.
     */
    double tan(double a);

    /**
     * Returns the trigonometric sine of an angle.
     *
     * @param a double, an angle, in radians.
     * @return double, the sine of the argument.
     */
    double sin(double a);
}
