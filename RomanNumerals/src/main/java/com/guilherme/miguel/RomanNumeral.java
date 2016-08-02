package com.guilherme.miguel;

import java.util.TreeMap;

/**
 * @author Miguel Guilherme
 */
public class RomanNumeral {

    private final static TreeMap<Integer, String> converter = new TreeMap<>();

    static {
        converter.put(1, "I");
        converter.put(4, "IV");
        converter.put(5, "V");
        converter.put(9, "IX");
        converter.put(10, "X");
        converter.put(40, "XL");
        converter.put(50, "L");
        converter.put(90, "XC");
        converter.put(100, "C");
        converter.put(400, "CD");
        converter.put(500, "D");
        converter.put(900, "CM");
        converter.put(1000, "M");
    }

    /**
     * Convert to Roman from a given number
     *
     * @param number the number to convert
     * @return Number converted to Roman
     */
    public static String convert(int number) {
        if (number == 0) return "";

        int l = converter.floorKey(number);
        if (number == l) {
            return converter.get(number);
        }
        return converter.get(l) + convert(number - l);
    }

}
