package com.guilherme.miguel;

import org.junit.Test;

import static com.guilherme.miguel.PrimeNumber.isPrimeFunctional;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class PrimeNumberFunctionalTest {

    @Test
    public void checkZeroIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(0)).isFalse();
    }

    @Test
    public void checkOneIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(1)).isFalse();
    }

    @Test
    public void checkTwoIsPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(2)).isTrue();
    }

    @Test
    public void checkThreeIsPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(3)).isTrue();
    }

    @Test
    public void checkFourIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(4)).isFalse();
    }

    @Test
    public void checkFiveIsPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(5)).isTrue();
    }

    @Test
    public void checkSixIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(6)).isFalse();
    }

    @Test
    public void checkSevenIsPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(7)).isTrue();
    }

    @Test
    public void checkEightIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(8)).isFalse();
    }

    @Test
    public void checkNineIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(9)).isFalse();
    }

    @Test
    public void checkTenIsNotPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(10)).isFalse();
    }

    @Test
    public void checkElevenIsPrimeTest() throws Exception {
        assertThat(isPrimeFunctional(11)).isTrue();
    }

}