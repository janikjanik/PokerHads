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
    public void determineWhenBothPlayersHaveStraightFlushShouldReturnTie(){
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
    public void determineWhenBothPlayersHaveStraightFlushShouldReturnWhiteWin(){
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
    public void determineWhenBothPlayersHaveAFourKindShouldReturnTie(){
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


}