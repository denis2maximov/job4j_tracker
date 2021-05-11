package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < Math.min(right.length(), left.length()); i++) {
            char charX = right.charAt(i);
            char charY = left.charAt(i);
            if (charX != charY) {
                rsl = Character.compare(charX, charY);
                break;
            }
        }
        return rsl == 0 ? Integer.compare(right.length(), left.length()) : rsl;
    }
}
