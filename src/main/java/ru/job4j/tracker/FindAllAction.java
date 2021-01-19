package ru.job4j.tracker;

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
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
          //  System.out.println(items[i]);
            out.println(items[i]);
        }
        return true;
    }
}
