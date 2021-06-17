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
           rsl.addAll(tmp);
            return new ArrayList<>(rsl);
        }

    public static List<String> sortAsc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
        Collections.sort(values);
        return values;
    }

    public static List<String> sortDesc(List<String> orgs) {
        List<String> values = new ArrayList<>(orgs);
        Comparator<String> comp = new DepDescComp();
        values.sort(comp);
        return values;
    }

  /*  public static void main(String[] args) {
        List<String> input = Arrays.asList("k1/sk1/ssk1", "k2/sk1/ssk1");
       List<String> result = fillGaps((input));
      List<String> out = sortDesc(result);
        out.forEach(System.out :: println);
   //  result.forEach(System.out :: println);
     //   out.forEach(System.out :: println);
    } */
}