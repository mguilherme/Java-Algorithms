package com.guilherme.miguel;

import org.junit.Test;

import static com.guilherme.miguel.PrimeNumber.isPrime;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class PrimeNumberTest {

    @Test
    public void checkZeroIsNotPrimeTest() throws Exception {
        assertThat(isPrime(0)).isFalse();
    }

    @Test
    public void checkOneIsNotPrimeTest() throws Exception {
        assertThat(isPrime(1)).isFalse();
    }

    @Test
    public void checkTwoIsPrimeTest() throws Exception {
        assertThat(isPrime(2)).isTrue();
    }

    @Test
    public void checkThreeIsPrimeTest() throws Exception {
        assertThat(isPrime(3)).isTrue();
    }

    @Test
    public void checkFourIsNotPrimeTest() throws Exception {
        assertThat(isPrime(4)).isFalse();
    }

    @Test
    public void checkFiveIsPrimeTest() throws Exception {
        assertThat(isPrime(5)).isTrue();
    }

    @Test
    public void checkSixIsNotPrimeTest() throws Exception {
        assertThat(isPrime(6)).isFalse();
    }

    @Test
    public void checkSevenIsPrimeTest() throws Exception {
        assertThat(isPrime(7)).isTrue();
    }

    @Test
    public void checkEightIsNotPrimeTest() throws Exception {
        assertThat(isPrime(8)).isFalse();
    }

    @Test
    public void checkNineIsNotPrimeTest() throws Exception {
        assertThat(isPrime(9)).isFalse();
    }

    @Test
    public void checkTenIsNotPrimeTest() throws Exception {
        assertThat(isPrime(10)).isFalse();
    }

    @Test
    public void checkElevenIsPrimeTest() throws Exception {
        assertThat(isPrime(11)).isTrue();
    }

}