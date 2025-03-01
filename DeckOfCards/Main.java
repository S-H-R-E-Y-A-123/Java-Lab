//Shreya Chaturvedi, 23070126123, AIML B2

import java.util.*;

class Main {
    public static void main(String args[]) {
        Deck deck = new Deck(); // Create deck using constructor
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n------ CARD DECK MENU ------");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Find Same Suit Cards");
            System.out.println("4. Compare Two Cards by Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter suit: ");
                    String suit = scanner.next();
                    deck.sameCard(suit);
                    break;
                case 4:
                    System.out.print("Enter first card index: ");
                    int idx1 = scanner.nextInt();
                    System.out.print("Enter second card index: ");
                    int idx2 = scanner.nextInt();
                    deck.compareCard(idx1, idx2);
                    break;
                case 5:
                    System.out.print("Enter rank: ");
                    String rank = scanner.next();
                    System.out.print("Enter suit: ");
                    String suitToFind = scanner.next();
                    deck.findCard(rank, suitToFind);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
