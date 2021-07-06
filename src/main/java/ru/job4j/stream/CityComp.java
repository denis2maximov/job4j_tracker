package ru.job4j.stream;

import java.util.Comparator;

class CityComp implements Comparator<Profile> {
    @Override
    public int compare(Profile o1, Profile o2) {
        return o1.getAddress().getCity().compareTo(o2.getAddress().getCity());
    }
}

