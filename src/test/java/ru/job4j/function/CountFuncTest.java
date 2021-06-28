package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountFuncTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        CountFunc function = null;
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenLinearResults() {
        CountFunc function = null;
        List<Double> result = function.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenIndicativeFunctionThenLinearResults() {
        CountFunc function = null;
        List<Double> result = function.diapason(5, 8, x ->  Math.pow(5, x));
        List<Double> expected = Arrays.asList(3125D, 15625D, 78125D);
        assertThat(result, is(expected));
    }
}