package com.guilherme.miguel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Miguel Guilherme
 */
public class ArmstrongTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void checkArmstrongFalse() throws Exception {
        assertThat(Armstrong.isArmstrong(100), is(equalTo(false)));
    }

    @Test
    public void checkArmstrongFirst() throws Exception {
        assertThat(Armstrong.isArmstrong(153), is(equalTo(true)));
    }

    @Test
    public void checkArmstrongSecond() throws Exception {
        assertThat(Armstrong.isArmstrong(371), is(equalTo(true)));
    }

    @Test
    public void checkArmstrongThird() throws Exception {
        assertThat(Armstrong.isArmstrong(9474), is(equalTo(true)));
    }

    @Test
    public void checkArmstrongFourth() throws Exception {
        assertThat(Armstrong.isArmstrong(54748), is(equalTo(true)));
    }
}
