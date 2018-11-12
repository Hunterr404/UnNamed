
public class day4I {

	public static void main(String[] args) {
		day4H day4HObject = new day4H(12);
		for(int i=0; i<5; i++) {
			day4HObject.add();
			System.out.printf("%s", day4HObject);
		}
	}

}
