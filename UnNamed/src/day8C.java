import java.util.*;
public class day8C {

	public static void main(String[] args) {
		
		final Formatter x;
		
		try {
			x= new Formatter("NewD.txt");
			System.out.println("You Created a File");
		}
		catch(Exception e) {
			System.out.println("You got an error");
		}
	}

}
