# Part 1: Card Representation

## Overview:
The Card Representation module defines the structure of a single playing card. Each card consists of a rank and a suit, which together form a standard deck of 52 playing cards.

## Classes and Functions:

### Card:
- The `Card` class represents an individual playing card.
- It contains attributes for:
  - **Rank** (e.g., Ace, King, Queen, etc.).
  - **Suit** (e.g., Hearts, Diamonds, Clubs, Spades).
- Provides methods to:
  - Retrieve the rank and suit.
  - Display the card as a formatted string.

---

# Part 2: Deck Management

## Overview:
The Deck Management module is responsible for creating and managing a deck of 52 playing cards. It allows shuffling, dealing, and displaying the deck.

## Classes and Functions:

### Deck:
- The `Deck` class represents a full deck of 52 cards.
- It contains methods to:
  - **Initialize** a standard deck with all possible card combinations.
  - **Shuffle** the deck randomly.
  - **Deal** a specified number of cards to players.
  - **Display** the deck’s current state.

---

# Part 3: Main Execution

## Overview:
The Main Execution module serves as the entry point for the program. It integrates the `Card` and `Deck` classes to simulate deck operations such as shuffling and dealing cards.

## Classes and Functions:

### Main:
- The `Main` class drives the execution of the program.
- It initializes an instance of `Deck` to:
  - Shuffle the deck.
  - Deal a set number of cards.
  - Display the dealt cards and the remaining deck.


