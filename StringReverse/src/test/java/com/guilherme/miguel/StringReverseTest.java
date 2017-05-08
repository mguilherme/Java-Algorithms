package com.guilherme.miguel;

import org.junit.Test;

import static com.guilherme.miguel.StringReverse.reverse;
import static com.guilherme.miguel.StringReverse.reverseRecursively;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Miguel Guilherme
 */
public class StringReverseTest {

    @Test
    public void checkWord1() throws Exception {
        assertThat(reverse("Hello")).isEqualTo("olleH");
    }

    @Test
    public void checkWord2() throws Exception {
        assertThat(reverse("Java")).isEqualTo("avaJ");
    }

    @Test
    public void checkFalseWord1() throws Exception {
        assertThat(reverse("World")).isNotEqualTo("ldrWo");
    }

    @Test
    public void checkWordRecursively1() throws Exception {
        assertThat(reverseRecursively("Hello")).isEqualTo("olleH");
    }

    @Test
    public void checkWordRecursively2() throws Exception {
        assertThat(reverseRecursively("Java")).isEqualTo("avaJ");
    }

    @Test
    public void checkFalseWordRecursively1() throws Exception {
        assertThat(reverseRecursively("World")).isNotEqualTo("ldrWo");
    }

}
