
public class Card{

	private final Rank rank;
	private final Suit suit;

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}
	
	public int getRankValue(){
		return rank.getValue();
	}
	@Override
	public String toString(){
		return this.getRank() + " " + this.getSuit() + "[ " + this.getRankValue() + " ]";
	}

	
	
}
