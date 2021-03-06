package com.guilherme.miguel;

/**
 * @author Miguel Guilherme
 */
public class StringReverse {

    /**
     * Reverse a given string
     *
     * @param str string to reverse
     * @return a reversed string
     */
    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    /**
     * Reverse a given string recursively
     *
     * @param str string to reverse
     * @return a reversed string
     */
    public static String reverseRecursively(String str) {
        return (str.length() < 2) ? str : reverseRecursively(str.substring(1)) + str.charAt(0);
    }

}
