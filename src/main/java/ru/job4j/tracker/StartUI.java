package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
    Tracker take = new Tracker();
    Item kata = new Item();
    take.add(kata);
    kata.setName("Katerina");
        System.out.println(kata);

              }
}
