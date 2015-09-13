import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> cardsOnHand;
	private int totalValue = 0;

	public Hand() {
		cardsOnHand = new ArrayList<>();
	}

	public void addManyCards(List<Card> cards) {
		for (Card c : cards) {
			totalValue += c.getRankValue();
		}
		cardsOnHand.addAll(cards);
	}

	public void addNextCard(Card card) {
		totalValue += card.getRankValue();
		cardsOnHand.add(card);
	}

	public int getHandSize() {
		return cardsOnHand.size();
	}

	public int getTotalValue() {
		return totalValue;
	}

	public List<Card> getListOfCardsOnHand() {
		return cardsOnHand;
	}

	@Override
	public String toString() {

		return this.cardsOnHand.toString();
	}

}
