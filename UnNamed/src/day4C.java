
public class day4C {
		private String name;
		private day4B birthday;
	public day4C(String theName,day4B theDate ) {
		name=theName;
		birthday=theDate;
	}
	public String toString() {
		return String.format("My Name is %s, My Birthday is%s", name,birthday);
	}
}
