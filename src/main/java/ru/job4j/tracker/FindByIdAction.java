package ru.job4j.tracker;

import java.util.List;

public class FindByIdAction implements UserAction{
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("===  Find item by Id ====");
        int id = input.askInt( "Enter the id to search for Item : ");
        Item item = tracker.findById(id);
        if (item == null) {
            out.println("The Item with this id was not found");
        } else {
            out.println(item);
        }
        return true;
    }
}
