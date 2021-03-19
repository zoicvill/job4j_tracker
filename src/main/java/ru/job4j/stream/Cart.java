package ru.job4j.stream;

import java.util.stream.Stream;

public class Cart {
    private Suit suit;
    private Value value;

    public Cart(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cart "
                + "suit = " + suit
                + ", value = " + value;
    }

    public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(val -> Stream.of(Suit.values())
                        .map(suit -> new Cart(suit, val)))
                .forEach(System.out::println);
    }
}

