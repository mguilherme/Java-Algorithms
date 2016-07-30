import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Miguel Guilherme
 */
public class Calculator {

    public static int add(String numbers) throws Exception {
        if (numbers.isEmpty()) return 0;

        List<String> numbersList = splitNumbers(numbers);
        checkNegatives(numbersList);

        return numbersList.stream()
                .mapToInt(Integer::parseInt)
                .filter(n -> n <= 1000)
                .sum();
    }

    /**
     * Split numbers from a given expression
     *
     * @param expression the expression
     * @return an array of strings
     */
    private static List<String> splitNumbers(String expression) {
        String delimiter = ",|\n"; // Default delimiter
        if (expression.startsWith("//")) {
            String[] numbersExpression = expression.split("\n");
            delimiter = numbersExpression[0].substring(numbersExpression[0].lastIndexOf("/") + 1);
            expression = numbersExpression[1];
        }

        List<String> list = Arrays.asList(expression.split(delimiter));

        return list.stream()
                .filter(((Predicate<String>) String::isEmpty).negate())
                .collect(Collectors.toList());
    }

    /**
     * Check if there's negative numbers, throw an Exception if true
     *
     * @param numbers numbers to check if contains negatives
     * @throws Exception
     */
    private static void checkNegatives(List<String> numbers) throws Exception {
        List<Integer> negativeNumbers = numbers.stream()
                .mapToInt(Integer::parseInt)
                .filter(n -> n < 0)
                .boxed()
                .collect(Collectors.toList());

        if (!negativeNumbers.isEmpty()) throw new Exception("negatives not allowed: " + negativeNumbers);
    }

}
