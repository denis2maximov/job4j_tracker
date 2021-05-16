package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return  "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("===  Delete item ====");
        int id = input.askInt("Enter Id of the application to delete : ");
        if (tracker.delete(id)) {
            out.println("This Item has been deleted");
        } else {
            out.println("Attention! The removal is not done!");
        }
        return true;
    }
}
