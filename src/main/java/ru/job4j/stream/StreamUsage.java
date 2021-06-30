package ru.job4j.stream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> now  = new ArrayList<Integer>();
        for (Integer i = -50; i < 5; i++) {
            now.add(i);
        }
       now.stream().filter(s -> s > 0).collect(Collectors.toList());
    }
}
