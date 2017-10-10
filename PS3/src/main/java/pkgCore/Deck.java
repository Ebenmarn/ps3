package pkgCore;

import java.util.Collections;
import java.util.stream.*;


import java.util.ArrayList;
import pkgEnum.eRank;
import pkgEnum.eSuit;


public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}


	public Card Draw() {
		try {
		return cardsInDeck.remove(0);
	} 
		
		catch(Exception NoCardsinDeck) {
			System.out.println("No cards remaining in Deck");
			return new Card(null, null);
			
		}
	}
	
	public Card Draw(eSuit eSuit) {
		Card card = new Card(null,null);
		for (Card c: this.cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				card = c;
				cardsInDeck.remove(c);
				 
			}
		}
	
		return card;
	}
		

	
	public Card Draw(eRank eRank) {
		Card card = new Card(null,null);
		for (Card c: this.cardsInDeck) {
				if (c.geteRank() == eRank) {
					card = c;
					cardsInDeck.remove(c);
				}
		}
		return card;

	}
	
	public int suitCount(eSuit suit) {
		Stream<Card> cardsOfeSuit = cardsInDeck.stream().filter(c -> c.geteSuit() == suit);
		return (int) cardsOfeSuit.count();
	}

	public int rankCount(eRank rank) {
		Stream<Card> cardsOfeRank = cardsInDeck.stream().filter(c -> c.geteRank() == rank);
		return (int) cardsOfeRank.count();
	}
	
	
	public int Count(Card card) {
		if ((cardsInDeck.stream().filter(c -> c.geteRank() ==card.geteRank()
				&& c.geteSuit() == card.geteSuit())).count() > 0) {
			return 1;
		}
		return 0;

	}

	
}
	
