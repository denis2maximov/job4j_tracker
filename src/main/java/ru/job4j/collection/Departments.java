package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<String>();
           for (String out : deps) {
            String start = "";
            for (String value : out.split("/")) {
                if ("".equals(start)) {
                     start = value;
                } else {
                    start += "/" + value;
                }
                 tmp.add(start);
                 }
            }
             return new ArrayList<>(tmp);
        }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}