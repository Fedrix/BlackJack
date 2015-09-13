
public class Dealer extends Player {

	Dealer() {
		hand = new Hand();
	}

	public void whetherHit(Card card) {
		if (hand.getTotalValue() <= 17) {
			hand.addNextCard(card);
			
		}
		
	}
	
	public Card showFirstCard(){
		return hand.getListOfCardsOnHand().get(0);
	}

}
