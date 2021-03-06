package com.guilherme.miguel;

import org.junit.Test;

import static com.guilherme.miguel.ArmstrongFunctional.isArmstrong;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class ArmstrongFunctionalTest {

    @Test
    public void checkArmstrongFalse() throws Exception {
        assertThat(isArmstrong(100)).isFalse();
    }

    @Test
    public void checkArmstrongFirst() throws Exception {
        assertThat(isArmstrong(153)).isTrue();
    }

    @Test
    public void checkArmstrongSecond() throws Exception {
        assertThat(isArmstrong(371)).isTrue();
    }

    @Test
    public void checkArmstrongThird() throws Exception {
        assertThat(isArmstrong(9474)).isTrue();
    }

    @Test
    public void checkArmstrongFourth() throws Exception {
        assertThat(isArmstrong(54748)).isTrue();
    }

}
