package com.guilherme.miguel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.runners.Parameterized.Parameter;
import static org.junit.runners.Parameterized.Parameters;

/**
 * @author Miguel Guilherme
 */
@RunWith(value = Parameterized.class)
public class RomanNumeralsTest {

    @Parameter(value = 0)
    public int numeral;

    @Parameter(value = 1)
    public String roman;

    @Parameters(name = "{0} Should return {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, ""},
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {6, "VI"},
                {7, "VII"},
                {8, "VIII"},
                {9, "IX"},
                {10, "X"},
                {11, "XI"},
                {12, "XII"},
                {14, "XIV"},
                {15, "XV"},
                {16, "XVI"},
                {19, "XIX"},
                {20, "XX"},
                {21, "XXI"},
                {24, "XXIV"},
                {25, "XXV"},
                {40, "XL"},
                {44, "XLIV"},
                {45, "XLV"},
                {50, "L"},
                {60, "LX"},
                {65, "LXV"},
                {70, "LXX"},
                {80, "LXXX"},
                {90, "XC"},
                {100, "C"},
                {200, "CC"},
                {300, "CCC"},
                {400, "CD"},
                {500, "D"},
                {600, "DC"},
                {700, "DCC"},
                {800, "DCCC"},
                {900, "CM"},
                {1000, "M"},
                {2000, "MM"},
                {3000, "MMM"}

        });
    }

    @Test
    public void NumeralToRomanTest() {
        assertThat(RomanNumeral.convert(numeral), is(equalTo(roman)));
    }

}
