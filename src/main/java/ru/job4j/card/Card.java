package ru.job4j.card;

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

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {

        Stream.of(Suit.values())
                .flatMap(x -> Stream.of(Value.values())
                          .map(s -> new Card(x, s)))
                .forEach(System.out::println);

    }
}
