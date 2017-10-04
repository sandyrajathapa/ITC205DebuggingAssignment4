//Initial Commit for Dice.java Thapa Sandesh Raja 11575549

public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() { //Thapa Sandesh Raja 11575549 BUG 3 found below this Line
		return DiceValue.getRandom();
	}		
	
	public String toString() {
		return value.toString();
	}
}
