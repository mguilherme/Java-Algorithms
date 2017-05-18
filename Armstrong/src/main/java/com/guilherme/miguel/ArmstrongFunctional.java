package com.guilherme.miguel;

/**
 * @author Miguel Guilherme
 */
public class ArmstrongFunctional {

    /**
     * Check if a number is Armstrong
     *
     * @param number number to check if Armstrong
     * @return true if Armstrong, false otherwise
     */
    public static boolean isArmstrong(int number) {
        String value = String.valueOf(number);

        return number == value.chars()
                .map(c -> Character.getNumericValue((char) c))
                .map(digit -> (int) Math.pow(digit, value.length()))
                .sum();
    }

}
