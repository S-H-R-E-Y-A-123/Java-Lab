import java.util.*;

class Deck {
    private ArrayList<Card> deck; // Deck stored as an ArrayList

    public Deck() {
        deck = new ArrayList<>();
        createDeck();
    }

    // Creates a standard deck of 52 cards
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suits = {"Clubs", "Diamonds", "Spades", "Hearts"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    // Displays all cards in the deck
    public void printDeck() {
        System.out.println("\n------ FULL DECK ------");
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
