package com.company;


import java.util.Arrays;

public class FiveCard {
    private RankOfCard rankOfCard;
    private Card highRank;
    private static Card[] cards = new Card[5];
    public FiveCard(Card[] cards) {
        this.cards = cards;
        Arrays.sort(cards);
    }

    public void determineRankOfCard(){

    }

    public void determineIfItIsStraightFlush(){
        for (int i = 0; i < 5; i++) {
        }
    }

    public void sort(){
        for (int i = 0; i < 5; i++) {
            if(cards[i].getValue().getRank() > cards[i + 1].getValue().getRank()){

            }
        }
    }

    @Override
    public String toString() {
        return "FiveCard{" +
                "rankOfCard=" + rankOfCard +
                ", highRank=" + highRank +
                '}';
    }
}
