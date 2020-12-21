package edu.sdccd.cisc191.f;

import java.util.List;
import java.util.ArrayList;

/**
  edu.sdccd.cisc191.f.Deck class will represent the deck of cards
  Will shuffle, deal and check if empty

  Author:
  - Tiffany Buu
*/

public class Deck {
  //Variables
    private List<Card> cards;
    private int size;

  //Constructors
    public Deck (String[] suits, String[] ranks, int[] values) {
      //Initialize the edu.sdccd.cisc191.f.Card ArrayList
      cards = new ArrayList<Card>();  
      //Add all the cards to the deck
      for (int i = 0; i < ranks.length; i++) {
        for (String suit : suits) {
          cards.add(new Card (suit, ranks[i], values[i]));
        }
      }
      //Set the size
      size = cards.size();
      //Shuffle the deck
      shuffle();
    }

    public Deck (ArrayList<Card> cards) {
      //Initialize the edu.sdccd.cisc191.f.Card ArrayList
      this.cards = cards; 
      //Set the size
      size = cards.size();
      //Shuffle the deck
      shuffle();
    }

  //Methods
    public boolean isEmpty() {
      //Returns whether the deck is empty
      return (size == 0);
    }

    public void shuffle() {
      //Shuffles the deck
      for (int i = cards.size() - 1; i > 0; i--) {
        int num = i + 1;
        int start = 0;
        //Get Random Position
        int ranPos = (int) (Math.random() * num) + start; 
        //Grab the front card
        Card temp = cards.get(i);
        //Swap the randomly selected card
        cards.set(i, cards.get(ranPos));
        cards.set(ranPos, temp); 
      }
      size = cards.size();
    }

    public Card deal() {
      if (isEmpty()) {
        return null;
      }
      size--;
      //Grab the top card
      Card c = cards.get(size);
      //Return top card
      return c;
    }

  //Getters and Setters
    public int getSize() {
      //Returns the amount of undealt cards in the deck
      return size;
    }
    public void setSize(int size) {
      //Returns the amount of undealt cards in the deck
      this.size = size;
    }
}