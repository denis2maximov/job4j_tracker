package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
   static List<Address> collect(List<Profile> profiles) {
       return profiles.stream()
               .map(Profile::getAddress)
               .sorted(Comparator.comparing(s -> s.getCity()))
               .distinct()
               .collect(Collectors.toList());
    }
}
