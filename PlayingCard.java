package egr283.chapter1and2.edu;

public class PlayingCard {
	
	private final Suit suit;
	private final Rank rank;
	
	public PlayingCard(Rank newRank, Suit newSuit) {
		this.rank = newRank;
		this.suit = newSuit;
	}// Ending bracket of constructor
	
	public Rank getRank() {
		return this.rank;
	}// Ending bracket of method getRank
	
	public Suit getSuit() {
		return this.suit;
	}// Ending bracket of method getSuit
	
	public String toString() {
		return this.rank.getRank() + " of " + this.suit.getSuit();
	}// Ending bracket of method toString
	
	public String toStringSymbol() {
		return this.rank.getSymbol() + "" + this.suit.getSymbol();
	}// Ending bracket of method toString
	
	public int getRankValue() {
		return this.rank.ordinal() + 2;
	}// Ending bracket of method getRankVaule
	//So deuce will return a rank value of 2 seeing how deuce is in the position of 0.
	
	public boolean isSameSuit(PlayingCard otherCard) {
		return(this.getSuit() == otherCard.getSuit());
	}// Ending bracket of method isSameSuit
	
	public boolean isSameRank(PlayingCard otherCard) {
		return(this.getRank() == otherCard.getRank());
	}// Ending bracket of method isSameRank

}// Ending bracket of class PlayingCaard
