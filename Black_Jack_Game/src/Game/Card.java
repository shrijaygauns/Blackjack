package Game;

public class Card {
	
	private Suit mySuit;        
	private Integer myNumber;   
	
	
	public Card(Suit aSuit, Integer aNumber) {
		
		this.mySuit = aSuit;
		
		if(aNumber >= 1 && aNumber <= 13) {
			this.myNumber = aNumber;
		}else {
			System.out.println(aNumber + "is not a valid Card number");
			System.exit(1);
		}
	}
	
	

	public Integer getMyNumber() {
		return myNumber;
	}
	
	
	
	public String toString() {
		String numStr = "Error";  
		
		switch(this.myNumber) {
		case 2 : numStr = "Two";
		         break;
		         
		case 3 : numStr = "Three";
		         break; 
		         
		case 4 : numStr = "Four"; 
                 break; 
        
		case 5 : numStr = "Five";
                 break; 
        
		case 6 : numStr = "Six";
                 break; 
        
		case 7: numStr = "Seven";
                 break; 
        
		case 8 : numStr = "Eight";
                 break; 
        
		case 9 : numStr = "Nine";
                 break; 
        
		case 10 : numStr = "Ten";
                 break; 
        
		case 11 : numStr = "Jack";
                 break; 
        
		case 12 : numStr = "Queen";
                 break; 
        
		case 13 : numStr = "King";
                 break; 
        
		case 1 : numStr = "Ace";
                 break; 
                 
		}
		
		return "\t" + numStr + " of " +mySuit.toString();
	
	}

}
