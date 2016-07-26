package com.guilherme.miguel;

import org.junit.Before;
import org.junit.Test;

import static com.guilherme.miguel.StringReverse.reverse;
import static com.guilherme.miguel.StringReverse.reverseRecursively;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Miguel Guilherme
 */
public class StringReverseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void checkWord1() throws Exception {
        assertThat(reverse("Hello"), is(equalTo("olleH")));
    }

    @Test
    public void checkWord2() throws Exception {
        assertThat(reverse("Java"), is(equalTo("avaJ")));
    }

    @Test
    public void checkFalseWord1() throws Exception {
        assertThat(reverse("World"), is(not("ldrWo")));
    }

    @Test
    public void checkWordRecursively1() throws Exception {
        assertThat(reverseRecursively("Hello"), is(equalTo("olleH")));
    }

    @Test
    public void checkWordRecursively2() throws Exception {
        assertThat(reverseRecursively("Java"), is(equalTo("avaJ")));
    }

    @Test
    public void checkFalseWordRecursively1() throws Exception {
        assertThat(reverseRecursively("World"), is(not("ldrWo")));
    }
}
