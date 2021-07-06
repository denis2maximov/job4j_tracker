package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void whenCollectClassV() {
        List<Profile> profile = List.of(
                new Profile("Oleg", new Address("Saratov", "Lenina", 1, 1)),
                new Profile("Aleg", new Address("Moscow", "Lenina", 101, 1)),
                new Profile("Motia", new Address("Moscow", "Leningradskiy pr.", 24, 17))
        );
        List<Address> rsl = Profiles.collect(profile);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Lenina", 101, 1));
        expected.add(new Address("Moscow", "Leningradskiy pr.", 24, 17));
        expected.add(new Address("Saratov", "Lenina", 1, 1));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassDouble() {
        List<Profile> profile = List.of(
                new Profile("Oleg", new Address("Saratov", "Lenina", 1, 1)),
                new Profile("Aleg", new Address("Moscow", "Lenina", 101, 1)),
                new Profile("Olia", new Address("Moscow", "Lenina", 101, 1))
        );
        List<Address> rsl = Profiles.collect(profile);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moscow", "Lenina", 101, 1));
        expected.add(new Address("Saratov", "Lenina", 1, 1));
        assertThat(rsl, is(expected));
    }
}