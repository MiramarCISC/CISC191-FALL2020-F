package edu.sdccd.cisc191.f; /**
  edu.sdccd.cisc191.f.GameBoard class extends board
  Will initialize board with proper ranks

  Author:
  - Tiffany Buu
*/
import java.util.List;

public class GameBoard extends Board {

  //Variables
    private static final int boardSize = 10;
    private static final String[] suits = 
      {"spades", "hearts", "diamonds", "clubs"};
    //Game does not use "ace" "7" or "king"
    private static final String[] ranks =
      {"2", "3", "4", "5","6", "8", "9", "10", "jack", "queen"};
    private static final int[] pointValues =
      {2, 3, 4, 5, 6, 8, 9, 10, 11, 12};
    
  //Constructor
  public GameBoard() {
    super(boardSize, suits, ranks, pointValues);
  }

  public boolean isLegal (List<Integer> selectedCards, DiceRolls dice){
    boolean result = false;
    int total = 0;

    //Get the value of the total selected cards
    for (int i = 0; i < selectedCards.size(); i++) {
      Card temp = cardAt(selectedCards.get(i));
      total += temp.getPointValue();
    }

    //Need to check if the selected card matches the dice roll
    if (total == dice.getDiceTotal()) result = true;

    //If they rolled a double they can select two cards but that can be implemented later
    if (selectedCards.size() > 1) {
      if (dice.Dice1() == dice.Dice2()) {
        result = true;
      }
      else {
        result = false;
      }
    }

    return result;
  }

  public boolean isAnotherPlayPossible(DiceRolls dice) {
    boolean result = false;

    for (int i = 0; i < boardSize; i++) {
      Card temp = cardAt(i);
      if (temp == null) continue;
      else if (temp.getPointValue() == dice.getDiceTotal()) result = true;
    }

    return result;
  }
}