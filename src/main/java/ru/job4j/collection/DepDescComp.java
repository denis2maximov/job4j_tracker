package ru.job4j.collection;
import java.util.*;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 12;
         String[] o12 = o1.split("/");
         String[] o21 = o2.split("/");
         if (o12.length > o21.length) {
             rsl = 1;
         } else {
             rsl = -1;
        }
        for (int i = 0; i < o12.length - 1; i++) {
            if (i == 0) {
                rsl =   o12[i].compareTo(o21[i]);
                if (rsl > 0) {
                    return -1;
                }  else  if (rsl < 0) {
                    return 1;
                } else {
                    rsl = o1.compareTo(o2);
                }
            }
        }
        return rsl;
        }
}
