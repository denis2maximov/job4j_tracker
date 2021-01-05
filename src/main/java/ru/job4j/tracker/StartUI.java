package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
    Tracker take = new Tracker();
    Item kata = new Item();
        Item kata1 = new Item();
        Item olia = new Item();
         take.add(kata);
    kata.setName("Катя");
        take.add(kata1);
        kata1.setName("Катя");
        take.add(olia);
        olia.setName("Оля");
System.out.println(take.findById(1));
 System.out.println(take.findByName("Оля"));
 System.out.println((take.findByName("Катя")));
      }
}
