
public class Player {
	protected Hand hand;

	public boolean hasBlackJack(){
		return hand.getTotalValue() == 21;
	}
	
	
	public boolean isBust(){
		return hand.getTotalValue() > 21;
	}
	

	public String show(){
		return hand.toString() + hand.getTotalValue();
	}
	
	
}
