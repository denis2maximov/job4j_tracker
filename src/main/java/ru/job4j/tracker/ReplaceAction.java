package ru.job4j.tracker;

public class ReplaceAction implements  UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("===  Edit item ====");
        int id = input.askInt("Enter Id of the application to change: ");
        String name = input.askStr("Enter "
                + "the name of the application for which we are changing : ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Replacement made!");
        } else {
            out.println("Something went wrong.. No replacement has been made!");
        }
        return true;
    }
}
