package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Enter number : ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
             //   System.out.print("Enter name: ");
                String name =  input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                 Item[] items =  tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("===  Edit item ====");
               // System.out.print("Enter Id of the application to change : ");
                int id = input.askInt("Enter Id of the application to change : ");
              //  System.out.print("Enter the name of the application for which we are changing : ");
                String name = input.askStr("Enter the name of the application for which we are changing : ");
                Item item = new Item(name);
                if (tracker.replace( id, item )) {
               // if (tracker.replace(id, newItem)) {
                    // вывод об успешности операции
                    System.out.println("Replacement made!");
                } else {
                    System.out.println("Something went wrong.. No replacement has been made!");
                }
            } else if (select == 3) {
                System.out.println("===  Delete item ====");
             //   System.out.print("Enter Id of the application to delete : ");
                int id = input.askInt("Enter Id of the application to delete : ");
                if (tracker.delete( id )) {
                    System.out.println("This Item has been deleted");
                } else {
                    System.out.println("Attention! The removal is not done!");
                }
            } else if (select == 4) {
                System.out.println("===  Find item by Id ====");
              //  System.out.print("Enter the id to search for Item : ");
                int id = input.askInt("Enter the id to search for Item : ");
                Item item = tracker.findById(id);
                if (item == null) {
                    System.out.println("The Item with this id was not found");
                } else {
                    System.out.println(item);
                }
            } else if (select == 5) {
                System.out.println("===  Find item by Name ====");
           //     System.out.print("Enter the Name to search for Item : ");
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