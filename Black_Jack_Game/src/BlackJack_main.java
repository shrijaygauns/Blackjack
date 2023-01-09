import Game.Deck;
import Game.Player;
import Game.Rules;

import java.util.Scanner;

public class BlackJack_main {

	public static void main(String[] args) {
		
        System.out.println("_____________________________________________________________________________________________________________________________");
		System.out.println("\n................................................>>> WELCOME TO BLACKJACK <<<.................................................");
		System.out.println("_____________________________________________________________________________________________________________________________");
		Rules rules = new Rules();
		rules.display();
		System.out.println("_____________________________________________________________________________________________________________________________");
		
		Scanner sc = new Scanner(System.in);
		Deck theDeck = new Deck(1, true);
		
		Player me = new Player("\tYOUR");
		Player dealer = new Player("\n\tDEALER");
		
		
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		me.addCard(theDeck.dealNextCard());
		dealer.addCard(theDeck.dealNextCard());
		
		System.out.println("\n\t-------------------------------");
		System.out.println("\tCards are dealt.");
		System.out.println("\t-------------------------------");
		System.out.println();
		me.printHand(true);
		dealer.printHand(false);
		System.out.println("\n");
		
		boolean meDone = false;
		boolean dealerDone = false;
		String ans;
		
		while (!meDone || !dealerDone) {
			if(!meDone) {
				System.out.print("\tHit or Stay? (Enter H or S): ");
				ans = sc.next();
				System.out.println();
				
				if(ans.compareToIgnoreCase("H")==0){
					
					meDone=!me.addCard(theDeck.dealNextCard());
					me.printHand(true);
					
				}else {
					meDone = true;
				}
				
			}
			
			if(!dealerDone) {
				if(dealer.getHandSum() < 17) {
					System.out.println("\n\tThe Dealer hits.\n");
					dealerDone = !dealer.addCard(theDeck.dealNextCard());
					dealer.printHand(false);
				} else {
					System.out.println("\n\tThe Dealer stays.\n");
					dealerDone = true;
				}
			}
			
			System.out.println();
			
		}
		
        sc.close();
		me.printHand(true);
		dealer.printHand(true);
		int mySum = me.getHandSum();
		int dealerSum = dealer.getHandSum();
		
		if(mySum  > dealerSum && mySum <=21 || dealerSum > 21) {
			System.out.println("\n\tYou win!!\ns");
		} 
		else 
		{
			System.out.println("\n\tDealer wins!\n");
		}	
		
	}

}
