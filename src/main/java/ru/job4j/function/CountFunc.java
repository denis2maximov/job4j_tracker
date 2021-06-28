package ru.job4j.function;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CountFunc {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> doubles = new ArrayList<Double>();
        for (int i = start; i < end; i++) {
            Function<Integer, Double> funcX = x -> (double) x;
            doubles.add(func.apply(funcX.apply(i)));
        }
        return  doubles;
    }
}
