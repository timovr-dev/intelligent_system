import java.lang.Math;
public class Dice {
	private int diceNumber;
	
	public int rollDice() {
		this.diceNumber = (int) ((Math.random() * 6) + 1);
		return this.diceNumber;
	}

}

