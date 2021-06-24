package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameEngine {
    Deck deck = new Deck();

    List<Card> playerHand = new ArrayList<>();
    List<Card> cpuHand = new ArrayList<>();
    List<Card> table = new ArrayList<>();

    int playerScore = 0;
    int cpuScore = 0;

    public GameEngine(Deck deck) {
        this.deck = deck;
    }

    public void dealToPlayers(){
        playerHand.add(deck.dealCards());
        playerHand.add(deck.dealCards());

        cpuHand.add(deck.dealCards());
        cpuHand.add(deck.dealCards());

        table.add(deck.dealCards());
        table.add(deck.dealCards());
        table.add(deck.dealCards());
    }

    public void printTable(){
        System.out.println("Table: " + table);
    }

    public void printHands(){
        System.out.println("Player hand: " + playerHand);
        System.out.println("CPU hand: " + cpuHand);
    }

    public void dealNext(){
        if (table.size() < 5) {
            table.add(deck.dealCards());
        } else {
            System.out.println("Cannot deal more cards, table is full");
        }
    }

    public void scorePlayers(){
        List<Card> fullHand = new ArrayList<>();
        fullHand.addAll(playerHand);
        fullHand.addAll(table);

        Set<String> ranks = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (Card card : fullHand){
            if (!ranks.add(card.getRank())){
                duplicates.add(card.getRank());
            }
        }

        System.out.printf(duplicates + " " + fullHand);

    }

    public boolean decideWinner(){
        boolean playerWon = false;



        return playerWon;
    }
}
