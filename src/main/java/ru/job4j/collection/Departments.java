package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<String>();
        List<String> rsl = new ArrayList<String>();
        String start = "null";
        for (String out : deps) {
            for (String value : out.split("/")) {
             if (tmp.size() < 1 && !start.equals(value)) {
                    tmp.add(value);
                    start = value;
                }
                 if (!start.equals(value)) {
                     tmp.add(value);
                 }
            }
        }

            Iterator<String> i = tmp.iterator();
            String string = null;
            String string2 = null;
            while (i.hasNext()) {
                 rsl.add(start);
                if (tmp.size() > 1) {
                   string = (i.next() + "/" + i.next());
                   rsl.add(string);
                }
                if (tmp.size() > 2) {
                    string2 = (string + "/" + i.next());
                    rsl.add(string2);
                }
            }
            return new ArrayList<>(rsl);
        }

    public static void sortAsc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
        fillGaps(values).sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
       List<String> out =  fillGaps(values);
        Comparator<String> comp = new DepDescComp();
        out.sort(comp);
        out.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("k1/sk2/ssk1", "k1/sk1/ssk2");
       List<String> result = Departments.fillGaps(input);
       sortAsc(result);
        result.forEach(System.out::println);
        sortDesc(result);
        result.forEach(System.out::println);
    }
}