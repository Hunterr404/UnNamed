
public class day8J {
	public static void main(String args[]) {
		String a = "apples";
		String b ="dharmu";
		String c ="DHARMU";
		System.out.println(a.length());
		
		
			if(a.equals("apples")) {
				System.out.println("It Equals apples");
			}
			if (b.equals(c)) {
				System.out.println("it matched");
			}
			if (b.equalsIgnoreCase(c)) {
				System.out.println("dharmu match");
			}
		
	}

}
