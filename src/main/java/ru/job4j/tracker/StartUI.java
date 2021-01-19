package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(), new FindAllAction(),
                new ReplaceAction(), new DeleteAction(), new FindByIdAction(),
                 new FindByNameAction(), new ExitAction()

        };
        new StartUI().init(input, tracker, actions);
    }
}


  /*  public static void createItem(Input input, Tracker tracker) {
        String name = input.askStr("=== Create a new Item ====" + " \n " + "Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        int id = input.askInt("===  Edit item ====" + " \n " + "Enter Id of the application to change : ");
        String name = input.askStr("Enter the name of the application for which we are changing : ");
        Item item = new Item(name);
        if (tracker.replace( id, item )) {
            System.out.println("Replacement made!");
        } else {
            System.out.println("Something went wrong.. No replacement has been made!");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        int id = input.askInt("===  Delete item ====" + " \n " + "Enter Id of the application to delete : ");
        if (tracker.delete( id )) {
            System.out.println("This Item has been deleted");
        } else {
            System.out.println("Attention! The removal is not done!");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        int id = input.askInt("===  Find item by Id ====" + " \n " + "Enter the id to search for Item : ");
        Item item = tracker.findById(id);
        if (item == null) {
            System.out.println("The Item with this id was not found");
        } else {
            System.out.println(item);
        }
    }

    public static void findItemByName(Input input, Tracker tracker) {
        String name=  input.askStr("===  Find item by Name ====" + " \n " + "Enter the Name to search for Item : ");
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

    public void init(Input input, Tracker tracker, UserAction[] actions) {
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
                 StartUI.deleteItem(input, tracker);
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
} */