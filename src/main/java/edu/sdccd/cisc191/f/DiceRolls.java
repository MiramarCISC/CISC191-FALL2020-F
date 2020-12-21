package edu.sdccd.cisc191.f;

/**
  Dice Rolls class will handle the rolling of dice

  Author:
  - Jaycue Vales
*/

public class DiceRolls {
    //two six sided die (at random)
    public int dice1;
    public int dice2;

    public void rollDice1() {
        dice1 = (int) (Math.random() * 6 + 1);
    }

    public void rollDice2() {
        dice2 = (int) (Math.random() * 6 + 1);
    }

    public int Dice1(){
        return dice1;
    }

    public int Dice2(){
        return dice2;
    }

    public int getDiceTotal(){
        return dice1 + dice2;
    }
}