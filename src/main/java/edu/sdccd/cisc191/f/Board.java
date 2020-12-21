package edu.sdccd.cisc191.f;

import java.util.List;

/**
  edu.sdccd.cisc191.f.Board class to represent the board
  Will set the cards suit, rank, and point value

  Author:
  - Tiffany Buu
*/

public abstract class Board {
  //Variables
    private Card[] cards;
    private Deck deck;

  //Constructor
    public Board (int size, String[] suits, String[] ranks, int[] pointValues) {
      cards = new Card[size];
      deck = new Deck(suits, ranks, pointValues);

        //This is for debugging
          // System.out.println(deck);
          // System.out.println("------------");

      dealMyCards();
    }

  //Methods
    public void newGame() {
      deck.shuffle();
      dealMyCards();
    }

    public int size() {
      return cards.length;
    }

    public boolean isEmpty(){
      for (int i = 0; i < cards.length; i++) {
        if (cards[i] != null) {
          return false;
        }
      }
      return true;
    }

    public Card cardAt(int i) {
		return cards[i];
	}

    public void deal (int i) {
      cards[i]= deck.deal();
    }

    public int deckSize() {
      return deck.getSize();
    }

    public boolean gameIsWon() {
      if (deck.isEmpty()) {
        for (Card c : cards) {
          if (c != null) {
            return false;
          }
        }
        return true;
      }
      return false;
    }

    public abstract boolean isLegal(List<Integer> selectedCards, DiceRolls dice);
    public abstract boolean isAnotherPlayPossible(DiceRolls dice);

    public void replaceSelectedCards(List<Integer> selectedCards) {
		for (Integer k : selectedCards) {
			deal(k.intValue());
		}
	}

    private void dealMyCards() {
      for (int i = 0; i < cards.length; i++){
        cards[i] = deck.deal();
      }
      deck.setSize(0);
    }
}