package com.company;

import java.util.ArrayList;

public class PokerHands {

    public static void main(String[] args) {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);

        FiveCard fiveCard = new FiveCard(new Card[]{card,card2,card3,card4,card5});
    }
}
