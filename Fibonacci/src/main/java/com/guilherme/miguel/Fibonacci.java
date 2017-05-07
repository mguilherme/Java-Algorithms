package com.guilherme.miguel;

/**
 * @author Miguel Guilherme
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(15));
    }

    /**
     * Calculate Fibonacci number using recursion
     *
     * @param n number to calculate Fibonacci
     * @return Fibonacci number
     */
    public static int fibonacciRecursive(int n) {
        return (n <= 1) ? n : fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * Calculate Fibonacci number using iteration
     *
     * @param n number to calculate Fibonacci
     * @return Fibonacci number
     */
    public static int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            int temp = a;
            a = b;
            b += temp;
        }
        return a;
    }
}
