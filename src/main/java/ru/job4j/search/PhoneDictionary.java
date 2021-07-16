package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

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
        var result = new ArrayList<Person>();
    Predicate<Person> name = s -> s.getName().contains(key);
    Predicate<Person> surname = s -> s.getSurname().contains(key);
    Predicate<Person> address = s -> s.getAddress().contains(key);
    Predicate<Person> phone = s -> s.getPhone().contains(key);
    Predicate<Person> combine  = s -> name.or(surname).or(address).or(phone).test(s);

      for (var person : persons) {
        if (combine.test(person)) {
            result.add(person);
        }
    }
        return result;
    }
}