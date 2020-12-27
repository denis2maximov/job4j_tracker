package ru.job4j.inheritance;

public class Dentist extends Doctor{
      private int cash = 5;

    public static void main(String[] args) {
        Doctor zub  = new Doctor();
       String tooth =  zub.getSurname();
       int weight = zub.getWeight();
    Dentist cash = new Dentist();
    int dollars = cash.cash;

        System.out.println("the dentist " + tooth + " weighs " + weight + " kilograms and charges " + dollars + " bucks for a tooth.");
    }
}
