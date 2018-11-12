import java.util.EnumSet;
public class day4E {

	public static void main(String[] args) {
		for(day4D people:day4D.values())
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear()) ;
		
		System.out.println("\n And now for the range of constants!!!\n");
		for(day4D people:EnumSet.range(day4D.dog, day4D.cow))
			System.out.printf("%s\t%s\t%s\n", people,people.getDesc(),people.getYear()) ;
	}

}
