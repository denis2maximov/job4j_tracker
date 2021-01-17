package ru.job4j.tracker;


public class StartUI {

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("===  Edit item ====");
        int id = input.askInt("Enter Id of the application to change : ");
        String name = input.askStr("Enter the name of the application for which we are changing : ");
        Item item = new Item(name);
        if (tracker.replace( id, item )) {
            System.out.println("Replacement made!");
        } else {
            System.out.println("Something went wrong.. No replacement has been made!");
        }
    }

    public static void deteleItem(Input input, Tracker tracker) {
        System.out.println("===  Delete item ====");
        int id = input.askInt("Enter Id of the application to delete : ");
        if (tracker.delete( id )) {
            System.out.println("This Item has been deleted");
        } else {
            System.out.println("Attention! The removal is not done!");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("===  Find item by Id ====");
        int id = input.askInt("Enter the id to search for Item : ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("The Item with this id was not found");
        } else {
            System.out.println(item);
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("===  Find item by Name ====");
        String name=  input.askStr("Enter the Name to search for Item : ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("The Item with this name was not found");
        }
    }

    public static void findAllItem(Input input, Tracker tracker) {
        Item[] items =  tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select : ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                 StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                 StartUI.deteleItem(input, tracker);
            } else if (select == 4) {
                  StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                  StartUI.findItemByName(input, tracker);
            }
            else  if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
       // System.out.println("Select:");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}