package FinalJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    // Field
    private List<Card> cards;

    // Constructor
    public Deck() {
        cards = new ArrayList<>();
        // Populate the deck with 52 cards
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        
        for (String suit : suits) {
            for (int i = 0; i < values.length; i++) {
                String cardName = values[i] + " of " + suit;
                int cardValue = i + 2; // Value is from 2 to 14 (Ace is 14)
                cards.add(new Card(cardValue, cardName));
            }
        }
    }

    // Method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw a card from the deck
    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}

