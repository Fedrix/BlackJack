import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		GameTable gameTable = new GameTable();
	
		gameTable.giveCardsOnStart();
	
		

			
		do {

			gameTable.turn();
			
			
			
		}while(!gameTable.isGameOver());
		gameTable.showPlayersHand();
		gameTable.whoWon();
		
	}
}
