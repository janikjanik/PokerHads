import com.company.Card;
import com.company.FiveCards;
import com.company.Rank;
import com.company.Suit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class DetermineWinnerTest {
    @Test
    public void firstSample(){
        Card blackCard = new Card(Rank.TWO, Suit.HEARTS);
        Card blackCard2 = new Card(Rank.THREE, Suit.SPADES);
        Card blackCard3 = new Card(Rank.FIVE, Suit.SPADES);
        Card blackCard4 = new Card(Rank.NINE, Suit.CLUBS);
        Card blackCard5 = new Card(Rank.KING, Suit.DIAMONDS);
        FiveCards black = new FiveCards(new Card[]{blackCard,blackCard2,blackCard3,blackCard4,blackCard5});

        Card whiteCard = new Card(Rank.TWO, Suit.CLUBS);
        Card whiteCard2 = new Card(Rank.THREE, Suit.HEARTS);
        Card whiteCard3 = new Card(Rank.FOUR, Suit.SPADES);
        Card whiteCard4 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card whiteCard5 = new Card(Rank.ACE, Suit.HEARTS);
        FiveCards white = new FiveCards(new Card[]{whiteCard,whiteCard2,whiteCard3,whiteCard4,whiteCard5});
    }
}