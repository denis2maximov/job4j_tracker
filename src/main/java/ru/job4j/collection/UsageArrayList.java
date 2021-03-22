package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> obs = new ArrayList();
        obs.add("Petr");
        obs.add("Ivan");
        obs.add("Stepan");
        for (String obsPrint : obs) {
            System.out.println(obsPrint);
        }

    }
}
//
