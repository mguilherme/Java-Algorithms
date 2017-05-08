package com.guilherme.miguel;

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
        String value = String.valueOf(number);
        int sum = 0;

        for (int i = 0; i < value.length(); i++) {
            int digit = Character.getNumericValue(value.charAt(i));
            sum += Math.pow(digit, value.length());
        }

        return number == sum;
    }

}
