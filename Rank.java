
public enum Rank {
	
	DEUCE("Deuce", '2'), TREY("Trey", '3'), FOUR("Four", '4'),
	FIVE("Five", '5'), SIX("Six", '6'), SEVEN("Seven", '7'),
	EIGHT("Eight", '8'), NINE("Nine", '9'), TEN("Ten", 'T'),
	JACK("Jack", 'J'), QUEEN("Queen", 'Q'), KING("King", 'K'),
	ACE("Ace", 'A');
	
	private String rank;
	private char symbol;
	
	private Rank(String newRank, char newSymbol) {
		this.rank = newRank;
		this.symbol = newSymbol;
	}// Enidng bracket of constructor
	
	public String getRank() {
		return this.rank;
	}// Ending bracket of method getRank;
	
	public char getSymbol() {
		return this.symbol;
	}

}// Ending bracket of class Rank
