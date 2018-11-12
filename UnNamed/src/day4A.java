
public class day4A {

	public static void main(String[] args) {
		day4 day4Object = new day4();
		day4 day4Object2 = new day4(11);
		day4 day4Object3 = new day4(11,12);
		day4 day4Object4 = new day4(11,12,13);
		System.out.printf("%s\t", day4Object.toMilitary());
		System.out.printf("%s\t", day4Object2.toMilitary());
		System.out.printf("%s\t", day4Object3.toMilitary());
		System.out.printf("%s\t", day4Object4.toMilitary());
		
		day4B day4BObject= new day4B(17,11,18);
		day4B day4BObject2= new day4B(5,10,15);
		
		day4C day4CObject= new day4C("dDancer",day4BObject);
		System.out.println(day4CObject);
	}

}
