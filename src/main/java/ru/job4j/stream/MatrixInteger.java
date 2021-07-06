package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixInteger {
          public  List<Integer> matrixInt(List<List<Integer>> list) {
            return list.stream()
                    .flatMap(Collection::stream)
                     .collect(Collectors.toList());
    }
}
