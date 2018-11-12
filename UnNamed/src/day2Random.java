import java.util.Random;
public class day2Random {

	public static void main(String[] args) {
		Random Dice = new Random();
		int Number;
		for(int counter=1; counter<=10; counter++) {
			Number= 1+ Dice.nextInt(6);
			System.out.println(Number);
		}

	}

}
