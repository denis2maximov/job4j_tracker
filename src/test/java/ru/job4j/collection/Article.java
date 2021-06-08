package ru.job4j.collection;

import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> h = new HashSet<>();
        HashSet<String> x = new HashSet<>();
        for (String string : origin.split("\\s|,|!|\\.")) {
            h.add(string);
        }
        for (String string :line.split("\\s|,|!|\\.")) {
            x.add(string);
            System.out.println((string));
        }
        return h.containsAll(x);
    }
 }
