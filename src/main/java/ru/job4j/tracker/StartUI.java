package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
    Tracker take = new Tracker();
    Item kata = new Item();
    take.add(kata);
    kata.setName("there is no replacement");
    System.out.println(kata);

    Item lol = new Item();
  //  take.add(lol);
  //  lol.setName("replacement made");
  lol.setName("replacement made");
  //  System.out.println(lol);
    int id = kata.getId();
    take.replace(id, kata);
    System.out.println(take.findById(id).getName());
        take.replace(id, lol);
        System.out.println(take.findById(id).getName());
              }
}
