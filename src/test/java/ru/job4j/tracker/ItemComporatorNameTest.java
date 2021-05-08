package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
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
        System.out.println("До сортировки items " + items);
        System.out.println("До сортировки sortItem " + sortItems);
        //sortItems.addAll(items);
        //sortItems.sort(maxName);
        items.sort(maxName);
        System.out.println("После сортировеи items " + items);
        //assertThat(items, is(sortItems));
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
        System.out.println("До сортировки items " + items);
        System.out.println("До сортировки sortItem " + sortItems);
        //sortItems.addAll(items);
        //sortItems.sort(minName);
        items.sort(minName.reversed());
        System.out.println("После сортировеи items " + items);
        //assertThat(items, is(sortItems));
        assertEquals(items, sortItems);
    }

    @Test
    public void whenComparatorMaxSort() {
        List<Item> items = Arrays.asList(
        new Item("test1"),
        new Item("test2"),
        new Item("test4"),
        new Item("test3"));
        Comparator<Item> compName = new ItemComporatorName();
        System.out.println("До сортировки " + items);
        items.sort(compName);
        boolean sorted = true;
        for (int i = 1; i < items.size(); i++) {
           // System.out.println(items.get(i).getName());
            if (items.get(i-1).getName().compareTo(items.get(i).getName()) > 0) {
                sorted = false;
            }
        }
        System.out.println("После сортировеи " + items);
        assertTrue(sorted);
       //assertFalse(sorted);
    }

    @Test
    public void whenComparatorMinSort() {
        List<Item> items = Arrays.asList(
        new Item("test1"),
        new Item("test2"),
        new Item("test4"),
        new Item("test3"));
        Comparator<Item> compName = new ItemComporatorName();
        System.out.println("До сортировки " + items);
        items.sort(compName.reversed());
        boolean sorted = true;
        for (int i = 1; i < items.size(); i++) {
           // System.out.println(items.get(i).getName());
            if (items.get(i-1).getName().compareTo(items.get(i).getName()) < 0) {
                sorted = false;
            }
        }
        System.out.println("После сортировеи " + items);
        assertTrue(sorted);
       //assertFalse(sorted);
    }
}