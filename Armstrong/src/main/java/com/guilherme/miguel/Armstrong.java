package com.guilherme.miguel;

import java.util.stream.IntStream;

/**
 * @author Miguel Guilherme
 */
public class Armstrong {

    /**
     * Check if a number is Armstrong
     *
     * @param number number to check if Armstrong
     * @return true if Armstrong, false otherwise
     */
    public static boolean isArmstrong(int number) {
        int length = String.valueOf(number).length();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(Integer.toString(number).charAt(i));
            sum += Math.pow(digit, length);
        }

        return number == sum;
    }

}
