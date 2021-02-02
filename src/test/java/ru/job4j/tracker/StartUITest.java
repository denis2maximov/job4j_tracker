package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;

 public class StartUITest {
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"8", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                                + "=== Exit Program ====%n"
                )
        ));
    }


    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
                        + "=== Exit Program ====" + System.lineSeparator()

        ));
    }

    @Test
    public void whenFindAll() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
               "0. Create" + System.lineSeparator() +
                        "1. Find all item" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. Create" + System.lineSeparator() +
                "1. Find all item" + System.lineSeparator() +
                  "2. Exit" + System.lineSeparator() +
                          "===  Find all item ====" + System.lineSeparator() +
                "Item{id=1, name='Item name'}" + System.lineSeparator() +
                "Menu." + System.lineSeparator() +
                "0. Create" + System.lineSeparator() +
                 "1. Find all item" + System.lineSeparator() +
                 "2. Exit" + System.lineSeparator() +
                        "=== Exit Program ====" + System.lineSeparator()

        ));
    }

    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "Item name",  "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "===  Find item by Name ====" + System.lineSeparator() +
                        "Item{id=1, name='Item name'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Name" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Exit Program ====" + System.lineSeparator()

        ));
    }
    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1", "1",  "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByIdAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Create a new Item ====" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "===  Find item by Id ====" + System.lineSeparator() +
                        "Item{id=1, name='Item name'}" + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Create" + System.lineSeparator() +
                        "1. Find item by Id" + System.lineSeparator() +
                        "2. Exit" + System.lineSeparator() +
                        "=== Exit Program ====" + System.lineSeparator()

        ));
    }
}

