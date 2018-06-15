package com.company;

public class Card implements Comparable {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }


//    @Override
//    public int compare(Object o, Object t1) {
//        Card firstCard = (Card) o;
//        Card secondCard = (Card) t1;
//        if(firstCard.rank.compareTo(secondCard.getValue()) > 0)
//            return 1;
//        else if(firstCard.rank.compareTo(secondCard.getValue()) == 0)
//            return 0;
//        else
//            return -1;
//    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Card secondCard = (Card) o;
        if(this.rank.compareTo(secondCard.getRank()) > 0)
            return 1;
        else if(this.rank.compareTo(secondCard.getRank()) == 0)
            return 0;
        else
            return -1;

    }
}

