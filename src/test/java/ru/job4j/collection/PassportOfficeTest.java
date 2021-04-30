package ru.job4j.collection;

import org.junit.Test;

import java.util.Set;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

  // Проверяем метод add, добавляем одного гражданина, проверяем что он добавился
    @Test
    public void add() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    // проверяем метод add, добавляем двух граждан с одинаковым паспортом, получаем
    // отказ в добавлении второго
    @Test
    public void add2NoEquals() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(new Citizen("2f44a", "Petr")), is(false));
    }

    // проверяем работу метода get, добавляем гражданина, получаем его же по паспорту через get
    @Test
    public void WhenGetPassport() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get("2f44a"), is(citizen));
    }

    // проверяем работу метода get, пытаемся получить гражданина по несуществующему паспорту.
    // Приходит null
    @Test
    public void WhenNotGetPassport() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get("2f44a1"), is(nullValue()));
    }

    // проверяем работу add , добавляем двух граждан с одинаковым паспортом, получаем
    //  отказ в добавлении второго
    @Test
    public void WhenNoDuplicateAdded() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean rsl = office.add(citizen2);
        assertFalse(rsl);
    }
}
