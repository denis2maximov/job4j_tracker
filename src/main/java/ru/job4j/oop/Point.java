package ru.job4j.oop;


public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
                return (this.x - that.x) + (this.y - that.y);
    }

    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}

