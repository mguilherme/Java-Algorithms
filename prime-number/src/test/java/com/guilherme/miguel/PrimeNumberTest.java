package com.guilherme.miguel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Miguel Guilherme
 */
public class PrimeNumberTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void checkZeroIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(0), is(false));
    }

    @Test
    public void checkOneIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(1), is(false));
    }

    @Test
    public void checkTwoIsPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(2), is(true));
    }

    @Test
    public void checkThreeIsPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(3), is(true));
    }

    @Test
    public void checkFourIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(4), is(false));
    }

    @Test
    public void checkFiveIsPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(5), is(true));
    }

    @Test
    public void checkSixIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(6), is(false));
    }

    @Test
    public void checkSevenIsPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(7), is(true));
    }

    @Test
    public void checkEightIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(8), is(false));
    }

    @Test
    public void checkNineIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(9), is(false));
    }

    @Test
    public void checkTenIsNotPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(10), is(false));
    }

    @Test
    public void checkElevenIsPrimeTest() throws Exception {
        assertThat(PrimeNumber.isPrime(11), is(true));
    }

}