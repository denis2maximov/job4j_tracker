package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

 /*   @Test
    public void add() {
    } */
        @Test
        public void whenFindByName() {
            PhoneDictionary phones = new PhoneDictionary();
            phones.add(
                    new Person("Petr", "Arsentev", "534872", "Bryansk")
            );
            phones.add(
                    new Person("Denis", "Mahnov", "125222", "Moscow")
            );
            ArrayList<Person> persons = phones.find("Den");
           assertThat(persons.get(1).getSurname(), is("Mahnov"));
           // assertThat(persons.contains("Petr"), is("Arsentev"));
        }
    }
