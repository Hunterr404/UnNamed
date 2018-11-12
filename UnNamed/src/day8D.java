import java.io.*;
import java.lang.*;
import java.util.*;

public class day8D {
	
	private Formatter x;
	
	public void openFile() {
		try {
			x= new Formatter("Chinese.txt");
		}
		catch(Exception e) {
			System.out.println("Yoy have an error");
		}
	}
	public void addRecords() {
		x.format("%s%s%s", "27", " Dharmendra"," Kumar" );
	}
	public void closeFile() {
		x.close();
	}

}
