package ru.job4j.collection;
import java.util.*;
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        List<String> outOne = new ArrayList<String>();
        List<String> outTwo = new ArrayList<String>();
        int rsl = 0;
        if (o1.length() < o2.length()) {
            return -1;
        }
        for (String string : o1.split("/")) {
            outOne.add(string);
        }
  /*      for (String string : o2.split("/")) {
            outTwo.add(string);
        }
        System.out.println(outTwo);
         rsl = outOne.get(1).compareTo(outTwo.get(1));
        if (rsl == 0) {
            return o1.compareTo(o2);
        } */
        for (String string : o2.split("/")) {
            // outTwo.add(string);

            System.out.println(string);
            rsl = outOne.get(1).compareTo(string);
            if (rsl == 0) {
                return o1.compareTo(o2);
            }
       }
        return rsl;
    }
}
