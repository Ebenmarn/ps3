package pkgCore;
import org.junit.Test;
import static org.junit.Assert.*;


public class DeckTest {
	@Before
	public void NewDeckandcard() {
		Deck d = new Deck();
		Card c = new Card(pkgEnum.eSuit.SPADES,pkgEnum.eRank.ACE);
    }

	@Test
	public void TestEmptyDeck() {
		for(int i=0; i <=53;i++){
			d.Draw();
			if i
		}
		
	}
	
	@Test
	public void TestDrawSuit() {
		
		assertEquals(d.Draw(pkgEnum.eSuit.SPADES).geteRank()== c.geteRank());
	}
	
	@Test
	public void TestDrawRank() {
		assertEqual(d.Draw(pkgEnum.eRank.ACE).geteRank()==c.geteSuit());
	}
	
	public void TestDeckRankCount() {
		assertEquals(d.rankCount(pkgEnum.eRank.TEN), 4);
		
	}
	
	public void TestDeckSuitCount() {
		assertEquals(d.suitCount(pkgEnum.eSuit.SPADES), 13);
	}

}
