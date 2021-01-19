package ru.job4j.tracker;

public class FindByNameAction implements  UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find item by Name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("===  Find item by Name ====");
        String name=  input.askStr("Enter the Name to search for Item : ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
               // System.out.println(item[i]);
                out.println(item[i]);
            }
        } else {
            //System.out.println("The Item with this name was not found");
            out.println("The Item with this name was not found");
        }
    return true;}
    }

