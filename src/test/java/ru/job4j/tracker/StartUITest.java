package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {
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
                 "2. Exit" + System.lineSeparator()

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
                        "2. Exit" + System.lineSeparator()

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
                        "2. Exit" + System.lineSeparator()

        ));
    }
}
//
/*
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("Replaced item"));

        String replacedName = "New item name";
        int x = item.getId();
        Input in = new StubInput(
                new String[]{"0", String.valueOf(x), replacedName, "1"});
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();

        Item item = tracker.add(new Item("Deleted item"));

        int x = item.getId();
        Input in = new StubInput(
                new String[]{"0", String.valueOf(x), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
} */
