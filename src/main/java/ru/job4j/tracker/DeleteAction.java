package ru.job4j.tracker;

public class DeleteAction implements UserAction{
    @Override
    public String name() {
        return "===  Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter Id of the application to delete : ");
        if (tracker.delete( id )) {
            System.out.println("This Item has been deleted");
        } else {
            System.out.println("Attention! The removal is not done!");
        }
        return true;
    }
}
