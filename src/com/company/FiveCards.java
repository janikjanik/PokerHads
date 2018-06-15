package com.company;

import java.util.Arrays;

public class FiveCards {
    private RankOfCard rankOfCard;
    private Card highRank;
    private static Card[] cards = new Card[5];
    public FiveCards(Card[] cards) {
        this.cards = cards;
        Arrays.sort(cards);
        rankOfCard = determineRankOfCard();
    }


    public RankOfCard determineRankOfCard(){
        if(determineIfItIsStraightFlush()) {
            return RankOfCard.STRAIGHT_FLUSH;
        }
        if(determineIfItIsFourOfAKind()) {
            return RankOfCard.FOUR_OF_A_KIND;
        }
        if(determineIfItIsFullHouse()) {
            return RankOfCard.FULL_HOUSE;
        }
        if(determineIfItIsFlush()) {
            return RankOfCard.FLUSH;
        }
        if(determineIfItIsStraight()) {
            return RankOfCard.STRAIGHT;
        }
        if(determineIfItIsThreeOfAKind()) {
            return RankOfCard.THREE_OF_A_KIND;
        }
        if(determineIfItIsTwoPair()) {
            return RankOfCard.TWO_PAIRS;
        }
        if(determineIfItIsAPair()) {
            return RankOfCard.PAIR;
        }
        return RankOfCard.HIGH_CARD;
    }

    public boolean determineIfItIsAPair() {
        return cards[0].getRank() == cards[1].getRank() || cards[1].getRank() == cards[2].getRank() ||
                cards[2].getRank() == cards[3].getRank() || cards[3].getRank() == cards[4].getRank();
    }

    public boolean determineIfItIsTwoPair() {
        return ((cards[0].getRank() == cards[1].getRank() && cards[2].getRank() == cards[3].getRank()) ||
                (cards[0].getRank() == cards[1].getRank() && cards[3].getRank() == cards[4].getRank()) ||
                (cards[1].getRank() == cards[2].getRank() && cards[3].getRank() == cards[4].getRank()));
    }

    public boolean determineIfItIsThreeOfAKind() {
        return cards[0].getRank() == cards[2].getRank() || cards[1].getRank() == cards[3].getRank() || cards[2].getRank() == cards[4].getRank();
    }

    public boolean determineIfItIsStraight() {
        return cards[0].getRank().compareTo(cards[4].getRank()) == -4;
    }


    public boolean determineIfItIsFlush() {
        for (int i = 0; i < 4; i++) {
            if(cards[i].getSuit() != cards[i+1].getSuit()){
                return false;
            }
        }
        return true;
    }

    public boolean determineIfItIsFullHouse() {
        return cards[0].getRank() == cards[1].getRank() && cards[2].getRank() == cards[4].getRank() ||
                cards[0].getRank() == cards[2].getRank() && cards[3].getRank() == cards[4].getRank();
    }

    public boolean determineIfItIsFourOfAKind() {
        return cards[0].getRank() == cards[3].getRank() || cards[1].getRank() == cards[4].getRank();
    }

    public boolean determineIfItIsStraightFlush(){
        return determineIfItIsFlush() && determineIfItIsStraight();
    }

    
    @Override
    public String toString() {
        String retString = "";
        for (Card card: cards){
            retString+=card.toString() + "\n";
        }
        return retString;
    }
}
