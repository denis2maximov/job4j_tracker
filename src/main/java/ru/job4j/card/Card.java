package ru.job4j.card;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Suit {
    Diamonds, Hearts, Spades, Clubs
}

enum Value {
    V_6, V_7, V_8
}

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public static void main(String[] args) {

        Stream.of(Suit.values())
                .flatMap(x -> Stream.of(Value.values())
                          .map(s -> s + " " +  x))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
