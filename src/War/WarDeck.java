package War;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WarDeck{

	private List<WarCard> cards = new ArrayList<WarCard>();
	
	WarDeck() {
		String names[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String values[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
				"Jack", "Queen", "King", "Ace"};
	
	
	
	for (String name : names) {
		int count = 2;
		for (String value : values) {
			WarCard c = new WarCard();
			c.setValue(count);
			c.setName(value + "  of " + name);
			cards.add(c);
			count++;
		}
	}
	
	} 
	
	public List<WarCard> getCards() {
		return cards;
	}
	
	public void setCards(List<WarCard> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for (WarCard card : cards) {
			card.describe();
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public WarCard draw() {
		WarCard card = this.cards.remove(0);
		return card;
	}
	
	
	
	
} //****************************************END*OF*MAIN*********************************
