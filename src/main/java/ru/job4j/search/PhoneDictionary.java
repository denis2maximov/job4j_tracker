package ru.job4j.search;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person rsl : persons) {
         /*  if (rsl.getPhone().contains(key)) {
                result.add(rsl);
            } else if (rsl.getSurname().contains(key)) {
                result.add(rsl);
            } else if (rsl.getAddress().contains(key)) {
                result.add(rsl);
             } else if (rsl.getName().contains(key)) {
                result.add(rsl);
            } else  {
                return rsl.isEmpty();
            } */
           if (rsl.getPhone().contains(key)) {
                result.add(rsl);
            }
            if (rsl.getSurname().contains(key)) {
                result.add(rsl);
            }
            if (rsl.getAddress().contains(key)) {
                result.add(rsl);
            }
            if (rsl.getName().contains(key)) {
                result.add(rsl);
            }
        }
        return result;
    }
}

