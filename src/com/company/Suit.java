package com.company;

public enum Suit {
    CLUBS(1), DIAMONDS(1), HEARTS(1), SPADES(1);
    private int value;

    Suit(int value) {
        this.value = value;
    }
}
