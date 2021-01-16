package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void numberOfPassengers(int x) {
        System.out.println("The bus carries " + x + " passengers");
    }

    @Override
    public void move() {
        System.out.println("The bus goes on highways");
    }

    @Override
    public void drive() {
        String nulled = "to null";
        System.out.println(nulled);
    }

    @Override
    public void passengers(int x) {
       int passengers = x;
        System.out.println("the method accepts the number of passengers equal to " + passengers
                + " , but does not return a value");
    }

    @Override
    public int fill(int fuel) {
        int fuelCount = fuel * 50;
        System.out.println("the method takes " + fuel + " and returns the value " + fuelCount);
        return fuelCount;
    }
}
//