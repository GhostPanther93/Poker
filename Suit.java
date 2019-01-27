package egr283.chapter1and2.edu;

public enum Suit {
	HEARTS("Hearts", '\u2665'), DIAMONDS("Diamonds", '\u2666'),
	CLUBS("Clubs", '\u2663'), SPADES("Spades", '\u2660');
	
	private String suit;
	private char symbol;
	
	private Suit(String newSuit, char newSymbol) {
		this.suit = newSuit;
		this.symbol = newSymbol;
	}// Ending bracket of constructor
	
	public String getSuit() {
		return this.suit;
	}// Ending bracket of method
	
	public char getSymbol() {
		return this.symbol;
	}// Ending bracket of getSymbol

}// Ending bracket of enum Suit
