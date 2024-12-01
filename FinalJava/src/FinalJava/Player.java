package FinalJava;

import java.util.ArrayList;
import java.util.List;

public class Player {
    // Fields
    private List<Card> hand;
    private int score;
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }

    // Getters and Setters
    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to describe the player and their hand
    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    // Method to flip a card (remove and return the top card of the hand)
    public Card flip() {
        return hand.isEmpty() ? null : hand.remove(0);
    }

    // Method to draw a card from the deck and add it to the hand
    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    // Method to increment the player's score
    public void incrementScore() {
        score++;
    }
}
