package ru.job4j.collection;

import java.util.HashMap;

public class FreezeStr {
    public static boolean eq(String left, String right) {
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 1;
        if (left.length() != right.length()) {
            return false;
        }
        for (Character c : left.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, count);
            } else {
                map.put(c, count + count);
            }
        }
        for (Character c : right.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
