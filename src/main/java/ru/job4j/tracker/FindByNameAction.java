package ru.job4j.tracker;

public class FindByNameAction implements  UserAction{
    @Override
    public String name() {
        return "===  Find item by Name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name=  input.askStr("Enter the Name to search for Item : ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("The Item with this name was not found");
        }
    return true;}
    }

