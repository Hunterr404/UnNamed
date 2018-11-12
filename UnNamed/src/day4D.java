
public enum day4D {
	cat("meow","8"),
	dog("bark", "14"),
	horse("neigh","19"),
	cow("bhawn","25");
	private final String desc;
	private final String year;
	
	day4D(String description, String birthday){
		desc=description;
		year=birthday;
	}
	public String getDesc() {
		return desc;
	}
	public String getYear() {
		return year;
	}
}
