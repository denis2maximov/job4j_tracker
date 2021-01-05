package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracker tracker = (Tracker) o;
        return ids == tracker.ids && size == tracker.size && Arrays.equals(items, tracker.items);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ids, size);
        result = 31 * result + Arrays.hashCode(items);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int x = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (Objects.equals(item.getName(), key)) {
             rsl[x++] = items[index];
              rsl = Arrays.copyOf(items, rsl.length);
            }
        }
        return rsl;
    }
}



