package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ItemComporatorNameTest {

    @Test
    public void whenComparatorMaxName() {
       List <Item> items = new ArrayList<Item>();
       List <Item> sortItems= new ArrayList<Item>();
        Item item = new Item("test1");
        Item item3 = new Item("test2");
        Item item2 = new Item("test3");
        Item item1 = new Item("test4");
        Item iteml1 = new Item("test1");
        Item iteml2 = new Item("test2");
        Item iteml3 = new Item("test3");
        Item iteml4 = new Item("test4");
        sortItems.add(iteml1);
        sortItems.add(iteml2);
        sortItems.add(iteml3);
        sortItems.add(iteml4);
        items.add(item);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Comparator<Item> maxName = new ItemComporatorName();
         items.sort(maxName);
        assertEquals(items, sortItems);
    }

    @Test
    public void whenComparatorMinName() {
        List <Item> items = new ArrayList<Item>();
        List <Item> sortItems= new ArrayList<Item>();
        Item item = new Item("test1");
        Item item3 = new Item("test2");
        Item item2 = new Item("test3");
        Item item1 = new Item("test4");
        Item iteml1 = new Item("test1");
        Item iteml2 = new Item("test2");
        Item iteml3 = new Item("test3");
        Item iteml4 = new Item("test4");
        sortItems.add(iteml4);
        sortItems.add(iteml3);
        sortItems.add(iteml2);
        sortItems.add(iteml1);
        items.add(item);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Comparator<Item> minName = new ItemComporatorName();
        items.sort(minName.reversed());
        assertEquals(items, sortItems);
    }

    @Test
    public void whenComparableMaxName() {
        List <Item> items = Arrays.asList (
                new Item("test4"),
                new Item("test1"),
                new Item("test2"),
                new Item("test3")
                );

        List <Item> sortItems = Arrays.asList(
        new Item("test1"),
         new Item("test2"),
        new Item("test3"),
        new Item("test4")
        );
        Collections.sort(items);
        Collections.sort(sortItems);
        assertEquals(items, sortItems);
    }


}