import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Miguel Guilherme
 */
public class Calculator {

    public static int add(String numbers) throws Exception {
        if (numbers.isEmpty()) return 0;

        String[] splittedNumbers = splitNumbers(numbers);

        checkNegatives(splittedNumbers);

        return Stream.of(splittedNumbers)
                .mapToInt(Integer::parseInt)
                .filter(n -> n <= 1000)
                .sum();
    }

    private static String[] splitNumbers(String expression) {
        String delimiter = ",|\n";
        if (expression.startsWith("//")) {
            String[] numbersExpression = expression.split("\n");

            delimiter = numbersExpression[0].substring(numbersExpression[0].lastIndexOf("/") + 1);
            expression = numbersExpression[1];
        }
        return expression.split(delimiter);
    }

    /**
     * Check if there's negative numbers, throw an Exception if true
     *
     * @param numbers numbers to check if contains negatives
     * @throws Exception
     */
    private static void checkNegatives(String[] numbers) throws Exception {
        int[] negatives = Stream.of(numbers)
                .mapToInt(Integer::parseInt)
                .filter(n -> n < 0)
                .toArray();

        if (negatives.length != 0) throw new Exception("negatives not allowed: " + Arrays.toString(negatives));
    }
}
