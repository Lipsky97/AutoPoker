package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();

	    System.out.println(deck);

	    deck.shuffleDeck();

	    System.out.println(deck);

	    GameEngine game = new GameEngine(deck);
	    game.dealToPlayers();
	    game.printTable();
	    game.printHands();

	    game.scorePlayers();
    }
}
