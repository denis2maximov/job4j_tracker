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
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(50, "Surname5"),
                new Student(60, "Surname6"),
                new Student(80, "Surname8"),
                new Student(60, "Surname8")
        );
        ListOfStudents sc = new ListOfStudents();
        Map<String, Student> rsl = sc.collect(students);
        Map<String, Student> expected = new HashMap<String, Student>();
        expected.put("Surname2", new Student(20, "Surname2"));
        expected.put("Surname3",new Student(30, "Surname3"));
        expected.put("Surname5",new Student(50, "Surname5"));
        expected.put("Surname6",new Student(60, "Surname6"));
        expected.put("Surname8",new Student(80, "Surname8"));
        assertThat(rsl, is(expected));
    }
}