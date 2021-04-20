package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("denis2maksimov@gmail.com", "Denis Maximov");
        map.put("denis2maksimov@mail.com", "Denis Petrov");
        for (String out : map.keySet()) {
            System.out.println(out + " = " + map.get(out));
        }
        }
    }


