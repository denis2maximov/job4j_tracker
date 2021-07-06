package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixIntegerTest {

    @Test
    public void matrixInt() {
       List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        List<Integer> rsl = new ArrayList<Integer>();
            rsl.add(1);
            rsl.add(2);
            rsl.add(3);
            rsl.add(4);
        MatrixInteger mi = new MatrixInteger();
        assertThat(rsl, is(mi.matrixInt(matrix)));
    }
}