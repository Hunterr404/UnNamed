import java.util.Random;
public class day3dice {

	public static void main(String[] args) {
		Random Rand = new Random();
		int Dice[]=new int[7];
		for(int counter=0; counter<1000; counter++ ) {
			++Dice[1+Rand.nextInt(6)];
		}
		System.out.println("Face\tFrequency");
		for(int face=1; face<Dice.length; face++) {
			System.out.println(face +"\t"+ Dice[face]);
		}
	}

}
