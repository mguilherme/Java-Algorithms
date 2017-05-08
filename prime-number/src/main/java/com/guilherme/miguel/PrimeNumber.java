package com.guilherme.miguel;

import java.util.stream.IntStream;

/**
 * @author Miguel Guilherme
 */
public class PrimeNumber {

    public static boolean isPrime(int number) {
        return number >= 2 && IntStream.rangeClosed(2, number / 2)
                .noneMatch(i -> number % i == 0);
    }

    public static boolean isPrimeImperative(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
