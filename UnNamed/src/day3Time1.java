
public class day3Time1 {

	public static void main(String[] args) {
		day3Time day3timeObject= new day3Time();
		System.out.println(day3timeObject.toRailway());
		System.out.println(day3timeObject.toString());
		day3timeObject.setTime(14, 15, 16);
		System.out.println(day3timeObject.toRailway());
		System.out.println(day3timeObject.toString());
	}

}
