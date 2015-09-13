import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;
	private Card card;

	public Deck() {
		cards = new ArrayList<>();
		addCardToDeck();
	}

	public void shuffle() {
		Collections.shuffle(getDeck());
	}

	public void addCardToDeck() {

		for (Rank r : Rank.values()) {
			for (Suit s : Suit.values()) {
				card = new Card(r, s);
				cards.add(card);
			}
		}

	}

	public List<Card> getDeck() {
		return cards;
	}

	public List<Card> drawMany(int n) {
		if (getSizeOfDeck() < n) {
			throw new IllegalStateException();
		}

		List<Card> drawCards = this.cards.subList(0, n);
		List<Card> toTake = new ArrayList<>(drawCards);
		drawCards.clear();
		return toTake;
	}

	public Card drawOneCard() {
		if (getSizeOfDeck() < 1) {
			throw new IllegalStateException();
		}
		return drawMany(1).get(0);

	}

	public int getSizeOfDeck() {
		return cards.size();
	}

}
