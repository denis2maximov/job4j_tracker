package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {

    public static void main(String[] args) {
    Tracker take = new Tracker();
    Item kata = new Item();
    take.add(kata);
    kata.setName("Катя");
    System.out.println(take.findById(1));
    Item kata1 = new Item();
    take.add(kata1);
    kata1.setName("Катя");
        Item kata3 = new Item();
        take.add(kata3);
        kata3.setName("Катя");
    Item olia = new Item();
    take.add(olia);
    olia.setName("Оля");
   // take.delete(1);
   //     System.out.println(take.findById(1));
 //System.out.println(take.findByName("Оля"));
 //System.out.println((take.findByName("Катя")));
 //System.out.println((take.findAll()));
 //System.out.println((take.replace(1, kata1)));
// System.out.println("deleted the index 1 " + take.delete(1));
        System.out.println(take.findById(4).getName());
   System.out.println(Arrays.toString(take.findByName("Катя")));
        System.out.println(take.findByName("Катя"));

              }
}
