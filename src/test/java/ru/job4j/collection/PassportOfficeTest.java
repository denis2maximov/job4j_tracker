package ru.job4j.collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void add2NoEquals() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen1 = new Citizen("2f44a", "Petr");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen1);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void add2EqualsAndOneNo() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen1 = new Citizen("2f44a22", "Petr");
        Citizen citizen2 = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen1);
        office.add(citizen2);
        assertThat(office.get(citizen2.getPassport()), is(citizen2));
    }
}