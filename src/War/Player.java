package War;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<WarCard> hand = new ArrayList<WarCard>();
	int score;
	String p;
	
	Player(String p) {
		this.score = 0;
	}
	

	public Player() {
		// TODO Auto-generated constructor stub
	}



	public void describe() {
		int count = 2;
		System.out.println(this.p + "has " + this.score + " points!");
		for (WarCard card : hand) {
			card.describe();
		}
	}
	
	public WarCard flip() {
		return hand.remove(0);
	}
	
	public void draw(WarDeck deck) {
		 hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}

}
