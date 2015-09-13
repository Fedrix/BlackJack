
public class User extends Player {

	private String name;

	User(String name) {
		hand = new Hand();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void hit(Card card) {

			hand.addNextCard(card);
			
		
	}

}
