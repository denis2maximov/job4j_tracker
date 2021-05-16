package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Integer.parseInt;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] out = left.split(". ");
        String[] out1 = right.split(". ");
        int[] number = new int[out.length];
        int[] number1 = new int[out1.length];
        number[0] = Integer.parseInt(out[0]);
        number1[0] = Integer.parseInt(out1[0]);
        return number[0] - number1[0];
    }
}