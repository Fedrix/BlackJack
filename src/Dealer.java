
public class Dealer extends Player {

	Dealer() {
		hand = new Hand();
	}

	public void whetherHit(Card card) {
		if (isBust()) {
			System.out.println("Dealer has busted");
		
		} else if (hasBlackJack()) {
			System.out.println("Dealer has BlackJack");
			
			
		} else if (hand.getTotalValue() <= 17) {
			hand.addNextCard(card);
			
		}
		
	}
	
	public Card showFirstCard(){
		return hand.getListOfCardsOnHand().get(0);
	}

}
