import java.util.Scanner;

public class GameTable {

	private Deck deck;
	private User user;
	private Dealer dealer;
	private boolean gameOver = false;
	private String winner;
	Scanner sc = new Scanner(System.in);
	String choice;
	GameTable() {
		this.deck = new Deck();
		this.user = new User("Przemek");
		this.dealer = new Dealer();
		deck.shuffle();
	}

	public void whetherGameOver(String choice){
		if(user.isBust() || dealer.isBust() || user.hasBlackJack() || dealer.hasBlackJack() || choice.equalsIgnoreCase("stay")){
			gameOver = true;
			
		}else {
			gameOver = false;
		}
	}
	public boolean isGameOver() {
		return this.gameOver;
	}
	
	public void turn(){
		System.out.println(user.show());
		System.out.println(dealer.showFirstCard());
		System.out.println("Hit or Stay?");
		choice = sc.nextLine();
		dealer.whetherHit(deck.drawOneCard());
		if(choice.equalsIgnoreCase("hit")){
		user.hit(deck.drawOneCard());
		}
		

		whetherGameOver(choice);
	}
	
	
	public void giveCardsOnStart(){
		user.hand.addManyCards(deck.drawMany(2));
		dealer.hand.addManyCards(deck.drawMany(2));
		
	}
	
	public void showPlayersHand(){
		System.out.println(user.show());
		System.out.println(dealer.show());
	}
	
	
	public void whoWon(){
		if(user.hand.getTotalValue() > dealer.hand.getTotalValue() || dealer.isBust() || user.hasBlackJack()){
			winner = user.getName() + " won!";
		}else if(user.hand.getTotalValue() < dealer.hand.getTotalValue() || user.isBust() || dealer.hasBlackJack()){
			winner = "Dealer won!";
		}else{
			winner = "DRAW!";
		}
		System.out.println(winner);
	}
	
	

}
