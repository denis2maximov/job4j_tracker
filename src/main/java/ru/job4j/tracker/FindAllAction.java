package ru.job4j.tracker;

import java.util.List;

public class FindAllAction implements  UserAction {
    private final Output out;

    public FindAllAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find all item";
    }

    @Override
    public  boolean execute(Input input, Tracker tracker) {
        out.println("===  Find all item ====");
        // Item[] items = tracker.findAll();
        List<Item> items = tracker.findAll();
        for (int i = 0; i < items.size(); i++) {
            out.println(items.get(i));
        }
        return true;
    }
}
