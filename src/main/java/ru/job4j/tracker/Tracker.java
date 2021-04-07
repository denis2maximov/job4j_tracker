package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class Tracker {
    private static Tracker instance = null;
    // private final Item[] items = new Item[100];
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Tracker() {
    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    /**
     * на 07 апреля в процессе изготовления задания. просто копия в гитхаб
     */


   /* public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    } */

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /*
            int index = indexOf(id);
        return index != -1 ? items[index] : null;
     */

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }


    public List<Item> findAll() {
        // return Arrays.copyOf(items, size);
        return items;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int x = 0;
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            if (Objects.equals(item.getName(), key)) {
                rsl[x++] = items.get(index);
            }
        }
        return Arrays.copyOf(rsl, x);
    }

    public boolean replace(int id, Item item) {
        int index = items.indexOf(id);
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
            //System.arraycopy(items, index + 1, items, index, (size - index));
            items.remove(index);
            //items.set(size, null);
           // size--;
        }
        return rsl;
    }
}




