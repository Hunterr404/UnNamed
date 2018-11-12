public class day2 {
	private String girlName;
	public day2(String Name) {
		girlName= Name;
	}
	
	public String getName() {
		return girlName;
	}
	public void naming() {
		System.out.printf("Your gf is %s\n" , getName());
	}
}
