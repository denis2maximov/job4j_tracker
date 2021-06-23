package ru.job4j.lambda;

import java.util.Comparator;

public class StrringLambda {
    Comparator<String> cmpText = (left, right) -> left.compareTo(right);
    Comparator<String> cmpDescSize;

    {
        cmpDescSize = (left, right) -> Integer.compare(right.length(), left.length());
    }
}

