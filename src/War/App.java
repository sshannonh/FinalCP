package War;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WarDeck deck = new WarDeck();
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		
		deck.shuffle();
		//deck.describe();
		
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
		for (int f = 0; f < 26; f++) {
			
			System.out.println("Round " + (f + 1));
			WarCard p1Card = p1.flip();
			System.out.print("Player 1: ");
			p1Card.describe();
			
			WarCard p2Card = p2.flip();
			
			System.out.print("Player 2: ");
			p2Card.describe();
			
			// p1Card.getValue();
			// p2Card.getValue();
			
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
				
				System.out.println("Player 1 wins the round!");
				
			} else if (p1Card.getValue() < p2Card.getValue()) {
				p2.incrementScore();
				
				System.out.println("Player 2 wins the round!");
			} else {
				System.out.println("War! No points awarded.");
			}
			
			
			System.out.println("Player 1 has " + p1.score + " points!");
			System.out.println("Player 2 has " + p2.score + " points! \n" );
			} // end of round loop 
			
			if (p1.score > p2.score) {
				System.out.println("Player 1 wins WAR!");
			} else if (p2.score < p1.score) {
				System.out.println("Player 2 wins WAR!");
			} else {
				System.out.println("WAR ends in a draw.");
			}
			
			
			
			
			
		
		
		
		
	} // end of main ***

} // end of app ****
