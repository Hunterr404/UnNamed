import java.io.File;
import java.nio.file.*;
public class day8B {

	public static void main(String[] args) {
		File x = new File("C:\\Users\\dHARMU\\eclipse-workspace\\UnNamed\\bin\\abc.txt");
		
		if(x.exists())
			System.out.println(x.getName() + " Exists");
		else
			System.out.println(" This thing doesn't exists");

	}

}
