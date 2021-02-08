package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public final class Tracker {
    private static Tracker instance = null;
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private Tracker() {
         }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

  public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
  }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int x = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (Objects.equals(item.getName(), key)) {
             rsl[x++] = items[index];
            }
        }
       return Arrays.copyOf(rsl, x);
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
             if (rsl) {
                     items[index] = item;
                    item.setId(id);
                }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
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
            System.arraycopy(items, index + 1, items, index, (size - index));
            items[size - 1] = null;
            size--;
        }
        return rsl;
    }
}




