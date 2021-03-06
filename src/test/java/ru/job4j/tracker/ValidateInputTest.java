package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalidTrueInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInvalid2Input() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "2", "6"}
        );
        ValidateInput input = new ValidateInput(out, in);
         int selected = input.askInt("Enter menu:");
         int selected1 = input.askInt("Enter menu:");
         int selected2 = input.askInt("Enter menu:");
        assertThat(selected2, is(6));
    }

    @Test
    public void whenNegativeNumberInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-9"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Menu.");
        assertThat(selected, is(-9));
    }

}