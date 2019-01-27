package egr283.chapter1and2.edu;

public class PokerPlayer {
	private String name;
	private Hand hand;
	
	public PokerPlayer(String newName, int numberOfCards) {
		this.setName(newName);
		this.setHand(new Hand(numberOfCards));
	}// Ending bracket of constructor
	
	public void addCard(PlayingCard newCard) {
		this.hand.addCard(newCard);;
	}// Ending bracket of method addCard
	
	public String getName() {
		return this.name;
	}// Ending bracket of method getNasme
	
	public void setName(String newName) {
		this.name = newName;
	}// Ending bracket of method setName
	
	public Hand getHand() {// We are breaking encapsulation doing this.
		return this.hand;
	}// Ending bracket of method getHand
	
	public void setHand(Hand newHand) {
		this.hand = newHand;
	}// Ending bracket of setHand

}// Ending bracket of class PokerPlayer

