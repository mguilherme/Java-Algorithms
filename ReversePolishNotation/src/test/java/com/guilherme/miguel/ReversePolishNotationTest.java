package com.guilherme.miguel;

import org.junit.Test;

import static com.guilherme.miguel.ReversePolishNotation.eval;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class ReversePolishNotationTest {

    @Test
    public void test1() throws Exception {
        assertThat(eval(new String[]{"2", "1", "+", "3", "*"})).isEqualTo(9);
    }

    @Test
    public void test2() throws Exception {
        assertThat(eval(new String[]{"4", "13", "5", "/", "+"})).isEqualTo(6);
    }

}