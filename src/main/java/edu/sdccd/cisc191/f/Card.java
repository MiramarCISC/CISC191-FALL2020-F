package edu.sdccd.cisc191.f;

/**
  edu.sdccd.cisc191.f.Card class to represent the Playing edu.sdccd.cisc191.f.Card
  Will set the cards suit, rank, and point value

  Author:
  - Tiffany Buu
*/

public class Card {
  //Variables
    private String suit;
    private String rank;
    private int pointValue;

  //Constructor
    public Card (String suit, String rank, int pointValue){
      this.suit = suit;
      this.rank = rank;
      this.pointValue = pointValue;
    }

  //Methods
    public boolean match (Card a){
      return (
        a.getSuit().equals(this.getSuit()) && 
        a.getRank().equals(this.getRank()) && 
        a.getPointValue() == this.getPointValue()
        );
    }

  //Getters & Setters
    public String getSuit() {
      return suit;
    }

    public void setSuit(String suit) {
      this.suit = suit;
    }

    public String getRank() {
      return rank;
    }

    public void setRank(String rank) {
      this.rank = rank;
    }

    public int getPointValue() {
      return pointValue;
    }

    public void setPointValue(int pointValue) {
      this.pointValue = pointValue;
    }

}