package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    List<Card> deck = new ArrayList<>();

    public Deck() {
        this.deck = generateDeck();
    }

    public enum Suits{
        CLUBS("C"),
        SPADES("S"),
        DIAMONDS("D"),
        HEARTS("H");

        String suit;

        private Suits(String s){
            suit = s;
        }
    }

    public enum Ranks{
        ACE("A"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"),
        QUEEN("Q"),
        KING("K");

        String rank;

        private Ranks(String r){
            rank = r;
        }
    }

    public List generateDeck(){
        List<Card> newDeck = new ArrayList<>();

        for (Ranks rank : Ranks.values()){
            for (Suits suit : Suits.values()){
                Card card = new Card(suit.suit, rank.rank);
                newDeck.add(card);
            }
        }

        return newDeck;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck, new Random());
    }

    public Card dealCards(){
        Card dealCard = deck.get(0);
        deck.remove(dealCard);
        return dealCard;
    }

    @Override
    public String toString() {
        return "Deck = " + deck;
    }
}
