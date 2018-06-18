package com.company;

/**
 * Created by michal on 6/15/18.
 */
public class DetermineWinner {
    Player white;
    Player black;

    public DetermineWinner(Player white, Player black) {
        this.white = white;
        this.black = black;
    }

//    public String determineWinner() {
//        if (white.determineRankOfCard().compareTo(black.determineRankOfCard()) > 0) {
//            return "winner is white";
//        } else if (white.determineRankOfCard().compareTo(black.determineRankOfCard()) < 0) {
//            return "black is white";
//        } else {
////            return determineWhenTheRankIsEqual(white, black);
//        }
//    }

    public String determineWinnerWhenBothPlayersHaveStraightFlush(){
        if(white.getCards()[4].getRank().compareTo(black.getCards()[4].getRank()) == 0){
            return "Tie.";
        }else if(white.getCards()[4].getRank().compareTo(black.getCards()[4].getRank()) > 0){
            return "White wins. - with straight flush, the highest card being: " +   white.getCards()[4].getRank().name();
        }else{
            return "Black wins. - with straight flush, the highest card being: " +   black.getCards()[4].getRank().name();
        }
    }

    public String determineWinnerWhenBothPlayersHaveAFourKind() {
        Rank rankOfFourWhiteCards;
        Rank rankOfRemainingWhiteCard;
        Rank rankOfFourBlackCards;
        Rank rankOfRemainingBlackCard;
        if(white.getCards()[0].getRank() == white.getCards()[3].getRank()){
            rankOfFourWhiteCards = white.getCards()[0].getRank();
            rankOfRemainingWhiteCard = white.getCards()[4].getRank();
        }
        else {
            rankOfFourWhiteCards = white.getCards()[4].getRank();
            rankOfRemainingWhiteCard = white.getCards()[0].getRank();
        }

        if(black.getCards()[0].getRank() == black.getCards()[3].getRank()){
            rankOfFourBlackCards = black.getCards()[0].getRank();
            rankOfRemainingBlackCard = black.getCards()[4].getRank();
        }
        else {
            rankOfFourBlackCards = black.getCards()[4].getRank();
            rankOfRemainingBlackCard = black.getCards()[0].getRank();
        }


        if(rankOfFourWhiteCards.compareTo(rankOfFourBlackCards) > 0 || (rankOfFourWhiteCards.compareTo(rankOfFourBlackCards) == 0 && rankOfRemainingWhiteCard.compareTo(rankOfRemainingBlackCard) > 0)){
            return "White wins. - with four of a kind, the rank of four kind is: " +   rankOfFourWhiteCards.name() +" with remaining card " + rankOfRemainingWhiteCard.name();
        }else if (rankOfFourWhiteCards.compareTo(rankOfFourBlackCards) < 0 || rankOfFourWhiteCards.compareTo(rankOfFourBlackCards) == 0 && rankOfRemainingWhiteCard.compareTo(rankOfRemainingBlackCard) < 0){
            return "Black wins. - with four of a kind, the rank of four kind is: " +   rankOfFourBlackCards.name() +" with remaining card " + rankOfRemainingBlackCard.name();
        }else{
            return "Tie.";
        }

    }

    public String determineWinnerWhenBothPlayersHaveFullHouse() {
        return "";
    }
}