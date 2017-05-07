package com.guilherme.miguel;


import org.junit.Test;

import static com.guilherme.miguel.Fibonacci.fibonacciIterative;
import static com.guilherme.miguel.Fibonacci.fibonacciRecursive;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class FibonacciTest {

    public final static String EXPECTED = "0 1 1 2 3 5 8 13 21 34 55 89 144 233 377";

    @Test
    public void testIterative() throws Exception {
        String output = "";
        for (int i = 0; i < 15; i++) {
            output += fibonacciRecursive(i) + " ";
        }
        output = output.trim();

        assertThat(output).isEqualTo(EXPECTED);
    }

    @Test
    public void testRecursive() throws Exception {
        String output = "";
        for (int i = 0; i < 15; i++) {
            output += fibonacciIterative(i) + " ";
        }
        output = output.trim();

        assertThat(output).isEqualTo(EXPECTED);
    }
}
