package com.guilherme.miguel;


import org.junit.Test;

import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class FibonacciTest {

    public final static String EXPECTED = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377";

    /**
     * Iterative Test
     */
    @Test
    public void testIterative() throws Exception {
        String output = getOutput(Fibonacci::fibonacciIterative);

        assertThat(output).isEqualTo(EXPECTED);
    }

    /**
     * Recursive test
     */
    @Test
    public void testRecursive() throws Exception {
        String output = getOutput(Fibonacci::fibonacciRecursive);

        assertThat(output).isEqualTo(EXPECTED);
    }

    /**
     * Generate a String with numbers from 0 to 14 for a given operation
     *
     * @param operation the operation
     * @return A comma separated String
     */
    private String getOutput(IntUnaryOperator operation) {
        return IntStream.range(0, 15)
                .map(operation)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));
    }

}
