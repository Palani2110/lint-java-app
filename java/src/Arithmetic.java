import java.util.logging.Logger;

public final class Arithmetic {

    private static final Logger logger = Logger.getLogger(Arithmetic.class.getName());

    private Arithmetic() {
        // Private constructor to prevent instantiation
    }

    /**
     * Adds two numbers and returns the result.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public static int addNumbers(final int a, final int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another and returns the result
     *
     * @param a The first number.
     * @param b The second number.
     * @return The result of subtracting the second number from the first.
     */
    public static int subtractNumbers(final int a, final int b) {
        return a - b;
    }

    /**
     * Computes the result of adding and subtracting numbers and returns the results as an array.
     *
     * @param a The first number.
     * @param b The second number.
     * @return An array containing the result of adding and subtracting the two numbers.
     */
    public static int[] compute(final int a, final int b) {
        int[] results = new int[2];
        results[0] = addNumbers(a, b);
        results[1] = subtractNumbers(a, b);
        return results;
    }

    /**
     * Computes the result of adding and subtracting numbers and prints the results.
     *
     * @param args The command-line arguments (not used)
     */
    public static void main(final String[] args) {
        final int result1 = addNumbers(5, 3);
        final int result2 = subtractNumbers(10, 4);
        logger.info(String.format("Result of adding: %d", result1));
        logger.info(String.format("Result of subtracting: %d", result2));
    }
}
