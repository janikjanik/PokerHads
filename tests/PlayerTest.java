import com.company.Card;
import com.company.Player;
import com.company.Rank;
import com.company.Suit;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void determineIfItIsAPairShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsAPair());
    }

    @Test
    public void determineIfItIsAPairShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsAPair());
    }

    @Test
    public void determineIfItIsTwoPairShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsTwoPair());
    }

    @Test
    public void determineIfItIsTwoPairShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.KING, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card3 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsTwoPair());
    }

    @Test
    public void determineIfItISThreeOfAKindShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsTwoPair());
    }

    @Test
    public void determineIfItIsThreeOfAKindShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card3 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsThreeOfAKind());
    }

    @Test
    public void determineIfItIsStraightShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card3 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsStraight());
    }

    @Test
    public void determineIfItIsStraightShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.EIGHT, Suit.DIAMONDS);
        Card card3 = new Card(Rank.NINE, Suit.DIAMONDS);
        Card card4 = new Card(Rank.TEN, Suit.SPADES);
        Card card5 = new Card(Rank.JACK, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsStraight());
    }

    @Test
    public void determineIfItIsFlushShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.DIAMONDS);
        Card card3 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsFlush());
    }

    @Test
    public void determineIfItIsFlushShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.CLUBS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.FOUR, Suit.CLUBS);
        Card card5 = new Card(Rank.KING, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsFlush());
    }

    @Test
    public void determineIfItIsFullHouseShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.CLUBS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.FOUR, Suit.CLUBS);
        Card card5 = new Card(Rank.KING, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsFullHouse());
    }

    @Test
    public void determineIfItIsFullHouseShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.FIVE, Suit.HEARTS);
        Card card3 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card card4 = new Card(Rank.FIVE, Suit.CLUBS);
        Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsFullHouse());
    }

    @Test
    public void determineIfItIsFourOfAKindShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsFourOfAKind());
    }

    @Test
    public void determineIfItIsFourOfAKindShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.SEVEN, Suit.SPADES);
        Card card3 = new Card(Rank.NINE, Suit.CLUBS);
        Card card4 = new Card(Rank.SEVEN, Suit.DIAMONDS);
        Card card5 = new Card(Rank.SEVEN, Suit.HEARTS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsFourOfAKind());
    }

    @Test
    public void determineIfItIsStraightFlushShouldReturnFalse() throws Exception {
        Card card = new Card(Rank.FIVE, Suit.CLUBS);
        Card card2 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card card3 = new Card(Rank.TWO, Suit.CLUBS);
        Card card4 = new Card(Rank.KING, Suit.SPADES);
        Card card5 = new Card(Rank.FOUR, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(false, player.determineIfItIsStraightFlush());
    }

    @Test
    public void determineIfItIsStraightFlushShouldReturnTrue() throws Exception {
        Card card = new Card(Rank.SEVEN, Suit.CLUBS);
        Card card2 = new Card(Rank.EIGHT, Suit.CLUBS);
        Card card3 = new Card(Rank.NINE, Suit.CLUBS);
        Card card4 = new Card(Rank.TEN, Suit.CLUBS);
        Card card5 = new Card(Rank.JACK, Suit.CLUBS);
        Player player = new Player(new Card[]{card,card2,card3,card4,card5});
        Assert.assertEquals(true, player.determineIfItIsStraightFlush());
    }


}