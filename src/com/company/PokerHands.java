package com.company;

public class PokerHands {

    public static void main(String[] args) {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);

        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
    }
}
