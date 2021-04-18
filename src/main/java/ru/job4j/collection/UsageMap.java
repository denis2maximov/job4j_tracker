package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("denis2maksimov@gmail.com", "Denis Maximov");
        map.put("denis2maksimov@mail.com", "Denis Petrov");
        for (String out : map.keySet()  ) {
        String value = map.get(out);
            System.out.println(out + " = " + value);
        }
        }
    }

