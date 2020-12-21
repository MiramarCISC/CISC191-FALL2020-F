package edu.sdccd.cisc191.f;

public class Main {
  /**
  This main class acts as the driver for our game.

  Group F:
   - Tiffany Buu
   - Jaycue Vales
  */

  public static void main(String[] args) {
		Board board = new GameBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}