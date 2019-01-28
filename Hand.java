public class Hand {

	private PlayingCard[] cards;
	private int currentNumberOfCards;
	private static final String COMMA_SPACE = ", ";
	
	public Hand(int numberOfCardsToHold) {
		this.cards = new PlayingCard[numberOfCardsToHold];
		this.currentNumberOfCards = 0;
	}// Ending bracket of constructor
	
	public void sort() {
		boolean isNotSorted = true;//sentinal value -
		PlayingCard tempCard = null;// use null if you do not have an object
		while(isNotSorted) {
			isNotSorted = false;
			for(int i = 0; i < this.cards.length - 1; ++i) {
				if(this.cards[i].getRankValue() < this.cards[i + 1].getRankValue()) {
					tempCard = this.cards[i];
					this.cards[i] = this.cards[i + 1];
					this.cards[i + 1] = tempCard;
					isNotSorted = true;
				}// Ending bracket of if
			}// Ending bracket of for
		}// Ending bracket of while
	}// Ending bracket of method sort
	
	public void addCard(PlayingCard newCard) {
		this.cards[this.currentNumberOfCards] = newCard;// the assigning a card the the array cards
		this.currentNumberOfCards++;
	}// Ending bracket of addCard
	
	public String toString() {
		StringBuffer sb = new StringBuffer();// to add string without extra memory 
		for (PlayingCard card : this.cards) {
			sb.append(card.toString());// append means to add to the end
			sb.append(COMMA_SPACE);		
		}// Ending bracket of for each loop - Cards
		return sb.toString();//
	}// Ending bracket of method toString
	
	public String toStringSymbol() {
		StringBuffer sb = new StringBuffer();// to add string without extra memory 
		for (PlayingCard card : this.cards) {
			sb.append(card.toString());
			sb.append(COMMA_SPACE);		
		}// Ending bracket of for loop
		return sb.toString();//
	}// Ending bracket of method toString

}// Ending bracket of class Hand
