package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
      int count = 0;
      int out;
      if (count < 1 && o1.compareTo(o2) == 0) {
             count++;
             return o2.compareTo(o1);

 } else {
          return o1.compareTo(o2);
                }
   }
}
