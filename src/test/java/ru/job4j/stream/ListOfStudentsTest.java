package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ListOfStudentsTest {

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student("Surname2", 20),
                new Student("Surname3", 30),
                new Student("Surname5", 50),
                new Student("Surname6", 60),
                new Student("Surname8", 80),
                new Student("Surname8", 60)
        );
        ListOfStudents sc = new ListOfStudents();
        Map<String, Student> rsl = sc.collect(students);
        Map<String, Student> expected = new HashMap<String, Student>();
        expected.put("Surname2", new Student("Surname2", 20));
        expected.put("Surname3", new Student("Surname3", 30));
        expected.put("Surname5", new Student("Surname5", 50));
        expected.put("Surname6", new Student("Surname6", 60));
        expected.put("Surname8", new Student("Surname8", 80));
        System.out.println(expected);
        assertThat(rsl, is(expected));
    }
}