package ru.job4j.stream;

import javax.swing.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfStudents {
    public Map<String, Student> collect(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getSurname, student -> student, (s, a) -> s));
        }
    }


