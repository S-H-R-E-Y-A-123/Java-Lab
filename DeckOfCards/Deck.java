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

    // Displays a specific card by index
    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println("Card at index " + index + ": " + deck.get(index));
        } else {
            System.out.println("Invalid index. Choose between 0 and " + (deck.size() - 1));
        }
    }

    // Finds all cards from the same suit
    public void sameCard(String suit) {
        System.out.println("\n------ CARDS FROM SUIT: " + suit + " ------");
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }
}
