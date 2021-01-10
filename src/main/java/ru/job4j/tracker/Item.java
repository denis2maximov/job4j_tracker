package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Objects;


public class Item {
    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/* public class Item {
    private int id;
    private String name;
    private LocalDateTime create = LocalDateTime.now();

    public Item(){
    }

    public Item(int idIn) {
        this.id =  idIn;
    }

    public Item(int idIn, String nameIn){
        this.name = nameIn;
        this.id = idIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  LocalDateTime getCreate(){
        return create;
    }
}
/* class StartUI {
    public static void main(String[] args) {
        Item time = new Item();
        LocalDateTime rsl = time.getCreate();
        System.out.println(rsl);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = rsl.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
       Tracker tracker = new Tracker(Item);
       tracker = tracker.add(Item, "ggg");
        tracker = tracker.findAll();

        System.out.println(Arrays.toString(tracker.findAll(Item)));
    }
} */