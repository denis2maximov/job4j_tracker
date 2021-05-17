package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public final class Tracker {
    private static Tracker instance = null;
    private final List<Item> items = new ArrayList<Item>();
    private int ids = 1;

    public Tracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
          return  List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
            for (Item item1 : items) {
            if (item1.getName().equals(key)) {
            rsl.add(item1);
              }
           }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.set(index, item);
            item.setId(id);
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}




