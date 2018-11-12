
public class day4F {
	private String first;
	private String last;
	private static int members = 0;
	public day4F(String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for%s%s, Members in the club: %d\n",first,last,members);
	}
	public String getFirst() {
		return first;	
	}
	public String getLast() {
		return last;
	}
	
	public static int getMembers() {
		return members;
	}
}
