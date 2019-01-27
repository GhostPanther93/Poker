package egr283.chapter1and2.edu;
import java.util.Random;

public class Deck {
	
	private PlayingCard[] cards;
	private static final int DECK_SIZE = 52;
	private Random randomizer;
	
	public Deck() {
		int arrayIndex = 0;
		this.cards = new PlayingCard[DECK_SIZE];
		this.randomizer = new Random();
		
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				cards[arrayIndex++] = new PlayingCard(rank, suit);
			}//Ending bracket of inner for each loop
		}// Ending bracket of outer for each loop
	}// Ending bracket of Deck constructor
	
	public PlayingCard deal() {
		PlayingCard rv = null;
		int index = 0;
		
		do {
			index = randomizer.nextInt(DECK_SIZE);
			rv = cards[index];
		} while (rv == null);
		cards[index] = null;
		return rv;
	}// Ending bracket of PlayingCard deal method
	
	public void displayDeck() {
		for(PlayingCard card : cards) {
			System.out.println(card.toString());
		}// Ending bracket of for each loop
	}// Ending bracket of displayDeck method
	
	public void displayDeckSymbol() {
		for(PlayingCard card : cards) {
			System.out.println(card.toStringSymbol());
		}// Ending bracket of for each loop
	}// Ending bracket of displayDeck method

}// Ending bracket of class Deck
