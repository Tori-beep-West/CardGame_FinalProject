package FinalJava;

public class App {
    public static void main(String[] args) {
        // Instantiate a deck and two players
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Shuffle the deck
        deck.shuffle();

        // Draw 52 cards (26 each for two players)
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Game loop: 26 rounds of flipping cards
        for (int i = 0; i < 26; i++) {
            System.out.println("\nRound " + (i + 1));

            // Player 1 flips a card
            Card card1 = player1.flip();
            card1.describe();
            // Player 2 flips a card
            Card card2 = player2.flip();
            card2.describe();

            // Compare values
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 gets a point!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 gets a point!");
            } else {
                System.out.println("It's a tie, no point awarded.");
            }

            // Print current score
            System.out.println("Current score - Player 1: " + player1.getScore() + ", Player 2: " + player2.getScore());
        }

        // Final result
        System.out.println("\nFinal scores:");
        System.out.println("Player 1: " + player1.getScore());
        System.out.println("Player 2: " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 wins!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
