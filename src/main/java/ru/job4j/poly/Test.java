package ru.job4j.poly;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       Vehicle plane = new Airplane();
       Vehicle bus = new Bus();
       Vehicle train = new Train();
       Vehicle[] vehicles = new Vehicle[]{plane, bus, train};
        for (Vehicle a : vehicles) {
            a.move();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество пассажиров");
        int number = Integer.parseInt(input.nextLine());
        plane.numberOfPassengers(number);
        bus.numberOfPassengers(number);
        train.numberOfPassengers(number);


      Transport bus1 = new Bus();
       bus1.drive();
     bus1.passengers(12);
     int x = bus1.fill(35);
     System.out.println(x);
    }
}
