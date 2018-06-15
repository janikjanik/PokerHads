package com.company;

import java.util.Comparator;

public class Card implements Comparable {
    private final Rank value;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.value = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getValue() {
        return value;
    }


    @Override
    public int compare(Object o, Object t1) {
        Card firstCard = (Card) o;
        Card secondCard = (Card) t1;
        if(firstCard.value.compareTo(secondCard.getValue()) > 0)
            return 1;
        else if(firstCard.value.compareTo(secondCard.getValue()) == 0)
            return 0;
        else
            return -1;
    }

    @Override
    public int compareTo(Object o) {
        Card secondCard = (Card) o;
        if(this.value > value.compareTo(secondCard.getValue()) > 0)
            return 1;
        else if(firstCard.value.compareTo(secondCard.getValue()) == 0)
            return 0;
        else
            return -1;

    }
}

