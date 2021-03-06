package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Denis", "SuperStar", "127422", "Murmansk")
        );
        phones.add(
                new Person("Denis", "HromMolibden", "127422", "Voroneg")
        );
        ArrayList<Person> prs = phones.find("422");
        assertThat(prs.get(1).getSurname(), is("HromMolibden"));
    }

    @Test
    public void whenFindByNameNull() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Denis", "SuperStar", "127422", "Murmansk")
        );
        ArrayList<Person> prs = phones.find("Ololoshka");
        assertTrue(prs.isEmpty());
    }

    @Test
    public void whenFindByNameTwo() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
