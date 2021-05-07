package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ItemMinComporatorNameTest {

    @Test
    public void whenComparatorMaxId() {
        List <Item> items = new ArrayList<Item>();
        Item item = new Item("test1");
        Item item3 = new Item("test2");
        Item item2 = new Item("test3");
        Item item1 = new Item("test4");
        items.add(item);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Comparator<Item> maxId = new ItemMinComporatorName();
        System.out.println("До сортировки " + items);
        items.sort(maxId);
        System.out.println("После сортировеи " + items);
    }
}