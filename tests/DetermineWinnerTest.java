import com.company.*;
import org.junit.Assert;
import org.junit.Test;


public class DetermineWinnerTest {
    @Test
    public void firstSample(){
        Card blackCard = new Card(Rank.TWO, Suit.HEARTS);
        Card blackCard2 = new Card(Rank.THREE, Suit.SPADES);
        Card blackCard3 = new Card(Rank.FIVE, Suit.SPADES);
        Card blackCard4 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard5 = new Card(Rank.KING, Suit.DIAMONDS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        Card whiteCard = new Card(Rank.TWO, Suit.CLUBS);
        Card whiteCard2 = new Card(Rank.THREE, Suit.HEARTS);
        Card whiteCard3 = new Card(Rank.FOUR, Suit.SPADES);
        Card whiteCard4 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card whiteCard5 = new Card(Rank.ACE, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});
    }

    @Test
    public void determineWinnerWhenBothPlayersHaveStraightFlushShouldReturnTie(){
        Card whiteCard = new Card(Rank.SEVEN, Suit.HEARTS);
        Card whiteCard2 = new Card(Rank.EIGHT, Suit.HEARTS);
        Card whiteCard3 = new Card(Rank.NINE, Suit.HEARTS);
        Card whiteCard4 = new Card(Rank.TEN, Suit.HEARTS);
        Card whiteCard5 = new Card(Rank.JACK, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});

        Card blackCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card blackCard2 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card blackCard3 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard4 = new Card(Rank.TEN, Suit.CLUBS);
        Card blackCard5 = new Card(Rank.JACK, Suit.CLUBS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});


        DetermineWinner determineWinner = new DetermineWinner(white, black);
        Assert.assertEquals("Tie.", determineWinner.determineWinnerWhenBothPlayersHaveStraightFlush());

    }

    @Test
    public void determineWinnerWhenBothPlayersHaveStraightFlushShouldReturnWhiteWin(){
        Card whiteCard = new Card(Rank.EIGHT, Suit.HEARTS);
        Card whiteCard2 = new Card(Rank.NINE, Suit.HEARTS);
        Card whiteCard3 = new Card(Rank.TEN, Suit.HEARTS);
        Card whiteCard4 = new Card(Rank.JACK, Suit.HEARTS);
        Card whiteCard5 = new Card(Rank.QUEEN, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});

        Card blackCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card blackCard2 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card blackCard3 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard4 = new Card(Rank.TEN, Suit.CLUBS);
        Card blackCard5 = new Card(Rank.JACK, Suit.CLUBS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        DetermineWinner determineWinner = new DetermineWinner(white, black);
        Assert.assertEquals("White wins. - with straight flush, the highest card being: QUEEN", determineWinner.determineWinnerWhenBothPlayersHaveStraightFlush());
    }

    @Test
    public void determineWinnerWhenBothPlayersHaveAFourKindShouldReturnTie(){
        Card whiteCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card whiteCard2 = new Card(Rank.SEVEN, Suit.SPADES);
        Card whiteCard3 = new Card(Rank.NINE, Suit.CLUBS);
        Card whiteCard4 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card whiteCard5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});

        Card blackCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card blackCard2 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard3 = new Card(Rank.SEVEN, Suit.SPADES);
        Card blackCard4 = new Card(Rank.SEVEN, Suit.HEARTS);
        Card blackCard5 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        DetermineWinner determineWinner = new DetermineWinner(white, black);
        Assert.assertEquals("Tie.", determineWinner.determineWinnerWhenBothPlayersHaveAFourKind());
    }

    @Test
    public void determineWinnerWhenBothPlayersHaveAFourKindShouldReturnBlackWin(){
        Card whiteCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card whiteCard2 = new Card(Rank.SEVEN, Suit.SPADES);
        Card whiteCard3 = new Card(Rank.NINE, Suit.CLUBS);
        Card whiteCard4 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card whiteCard5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});

        Card blackCard = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard2 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard3 = new Card(Rank.NINE, Suit.SPADES);
        Card blackCard4 = new Card(Rank.SEVEN, Suit.HEARTS);
        Card blackCard5 = new Card(Rank.NINE, Suit.DIAMONDS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        DetermineWinner determineWinner = new DetermineWinner(white, black);
        Assert.assertEquals("Black wins. - with four of a kind, the rank of four kind is: NINE with remaining card SEVEN", determineWinner.determineWinnerWhenBothPlayersHaveAFourKind());
    }

    @Test
    public void determineWinnerWhenBothPlayersHaveFullHouseShouldReturnTie(){
        Card whiteCard = new Card(Rank.SEVEN, Suit.CLUBS);
        Card whiteCard2 = new Card(Rank.FIVE, Suit.HEARTS);
        Card whiteCard3 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card whiteCard4 = new Card(Rank.FIVE, Suit.CLUBS);
        Card whiteCard5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player white = new Player(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});

        Card blackCard = new Card(Rank.SEVEN, Suit.SPADES);
        Card blackCard2 = new Card(Rank.FIVE, Suit.CLUBS);
        Card blackCard3 = new Card(Rank.SEVEN, Suit.SPADES);
        Card blackCard4 = new Card(Rank.FIVE, Suit.HEARTS);
        Card blackCard5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player black = new Player(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        DetermineWinner determineWinner = new DetermineWinner(white, black);
        Assert.assertEquals("Tie.", determineWinner.determineWinnerWhenBothPlayersHaveFullHouse());
    }

}