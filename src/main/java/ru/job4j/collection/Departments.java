package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<String>();
        List<String> rsl = new ArrayList<String>();
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
        System.out.println(tmp);
           rsl.addAll(tmp);
            return new ArrayList<>(rsl);
        }

    public static void sortAsc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
        orgs.sort(Comparator.naturalOrder());
    }

    public static List<String> sortDesc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
        Comparator<String> comp = new DepDescComp();
      //  values.sort(DepDescComp);
        return values;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("k1/sk2/ssk1", "k2/sk1/ssk2");
        List<String> result = Departments.fillGaps(input);
        List<String> out = sortDesc(result);
     //  sortAsc(result);
       // result.forEach(System.out::println);
        //sortDesc(result);
     out.forEach(System.out::println);

        for (int i = 0; i < result.size(); i++) {
            String one = null;
           // System.out.println(one[i]);
        } {
           // System.out.println(string);
        }

    //    System.out.println(result);
    }


/*
Set<String> tmp = new LinkedHashSet<String>();
        List<String> rsl = new ArrayList<String>();
           for (String out : deps) {
            String start = "";
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
 */
}