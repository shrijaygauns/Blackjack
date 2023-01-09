package Game;
public class Rules {

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("\n  BLACKJACK RULES: ");
		System.out.println("	-Each player is dealt with 2 cards. The dealer is dealt 2 cards with one face-up and one face-down[hidden].");
		System.out.println("	-Cards are equal to their value with face cards being 10 and an Ace being 1 or 11.");
		System.out.println("	-The players cards are added up for their total.");
		System.out.println("	-Players “Hit” to gain another card from the deck. Players “Stay” to keep their current card total.");
		System.out.println("	-Dealer “Hits” until they equal or exceed 17.");
		System.out.println("	-The goal is to have a higher card total than the dealer without going over 21."); 
		System.out.println("	-Players win their bet if they beat the dealer.");
		System.out.println("");
		
	}
	
}

