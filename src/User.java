
public class User extends Player {

	private String name;

	User(String name) {
		hand = new Hand();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void whetherHit(Card card) {
		if (isBust()) {
			System.out.println(getName() + " has busted");
			
		} else if (hasBlackJack()) {
			System.out.println(getName() + " has BlackJack");
			

		} else {
			hand.addNextCard(card);
			
		}
	}

}
