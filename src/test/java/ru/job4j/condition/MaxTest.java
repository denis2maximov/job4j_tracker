package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(65, 21);
        assertThat(result, is(65));
    }

    @Test
    public void when1Equally2Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void when1Equally2Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when1Equally2Then66() {
        int result = Max.max(1, 2, 3, 66);
        assertThat(result, is(66));
    }
}