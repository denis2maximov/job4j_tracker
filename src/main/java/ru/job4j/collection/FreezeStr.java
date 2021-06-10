package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {

    @SuppressWarnings("checkstyle:InnerAssignment")
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
                map.put(c, count + 1);
            }
        }
      /*  for (Character c : right.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, count - 1);
            }
            System.out.println(map);
        } */
        for (Character c : right.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else if (map.get(c) == count) {
                map.remove(c);
                } else {
                map.put(c, count - 1);
                if (!(map.size() <= 0)) {
                    return true;
                }
            }
            }
       /* for (Character c : map.keySet()){
                   if (map.get(c) <= 0) {
                return false;
            }
        } */
        return false;
    }
}