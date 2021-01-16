package ru.job4j.poly;

public class Airplane implements Vehicle{
    @Override
    public void numberOfPassengers(int x) {
        System.out.println("the plane carries " + x + " aircraft per flight");
    }

    @Override
    public void move() {
        System.out.println("The plane is flying in the sky");
    }
}
//
