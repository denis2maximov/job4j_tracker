package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static void main(String[] args) {
        ArrayList<Integer> now  = new ArrayList<Integer>();
        for (int i = -50; i < 5; i++) {
            now.add(i);
        }
        List<Integer> listik = now.stream().filter(s -> s > 0).collect(Collectors.toList());
       }
}
