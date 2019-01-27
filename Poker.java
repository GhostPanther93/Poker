package egr283.chapter1and2.edu;

import java.util.Scanner;

public class Poker {

	public static void main (String[] args) {
		
		//First: create players then deal
		Scanner kb;
		kb = new Scanner(System.in);
		
		PokerPlayer p1 = new PokerPlayer("Scooby", 5);
		PokerPlayer p2 = new PokerPlayer("Shaggy", 5);
		PokerPlayer p3 = new PokerPlayer("Velma", 5);
		PokerPlayer p4 = new PokerPlayer("Fred", 5);
		PokerPlayer p5 = new PokerPlayer("Daphane", 5);
		
		p1.setHand(null);
		p2.setHand(null);
		p3.setHand(null);
		p4.setHand(null);
		p5.setHand(null);
		
		System.out.println("Welcome to cartoon Stub poker! \nPlease choose one of the following characters:");
		System.out.println("-->Player 1: " + p1.getName() + 
				"\n-->Player 2: " + p2.getName() + 
				"\n-->Player 3: " + p3.getName() + 
				"\n-->Player 4: " + p4.getName() + 
				"\n-->Player 5: " + p5.getName());
		System.out.println("\nWe will now begin to shuffle and deal out the cards: ");
		//Generating deck
		Deck deck = new Deck();
		deck.deal();
		deck.displayDeck();
		
	}// Ending bracket of method main

}//Ending bracket of class Poker

