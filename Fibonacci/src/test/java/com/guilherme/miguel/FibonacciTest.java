package com.guilherme.miguel;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Miguel Guilherme
 */
public class FibonacciTest {

    public final static String EXPECTED = "0 1 1 2 3 5 8 13 21 34 55 89 144 233 377";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testIterative() throws Exception {
        String output = "";
        for (int i = 0; i < 15; i++) {
            output += Fibonacci.fibonacciRecursive(i) + " ";
        }
        output = output.trim();

        assertThat(output, is(equalTo(EXPECTED)));
    }

    @Test
    public void testRecursive() throws Exception {
        String output = "";
        for (int i = 0; i < 15; i++) {
            output += Fibonacci.fibonacciIterative(i) + " ";
        }
        output = output.trim();

        assertThat(output, is(equalTo(EXPECTED)));
    }
}
