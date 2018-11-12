import java.util.*;
public class day8E {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int x=1;
		 do {
			 
		 try {
			 System.out.println("Enter First Number:");
			 int n1 = input.nextInt();
			 System.out.println("Enter Second Number:");
			 int n2 = input.nextInt();
			 int result = n1/n2;
			 System.out.println(result);
			 x=2;

	}
		 catch(Exception e) {
			 System.out.println("You can't do that");
		 }
		 }
		 while(x==1);
		
	

}
}