
public class day2CIntrst {

	public static void main(String[] args) {
		double amount, rate=0.01, principal=12000;
		for(int day=1; day<20; day++) {
			amount= principal*Math.pow(1+rate, day);
			System.out.println(day + "    "+ amount);
		}
		System.out.println(Math.abs (-14.789));
		System.out.println(Math.ceil(8.3));
		System.out.println(Math.floor(12.78));
		System.out.println(Math.max(12,17));
		System.out.println(Math.min(18,7));
		System.out.println(Math.pow(5,3));
		System.out.println(Math.sqrt(49));
	}

}
