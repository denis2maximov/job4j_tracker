package ru.job4j.poly;

public class Train implements Vehicle{
    @Override
    public void numberOfPassengers(int x) {
        System.out.println("The train carries " + x + " passengers");
    }

    @Override
    public void move() {
        System.out.println("The train runs on rails");
    }
}
//