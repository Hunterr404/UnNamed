import java.util.Scanner;
public class day2Average {
public static void main(String args[]) {
	float Average;
	int sum=0;
	int grade;
	
	System.out.println("Enter 10 nos. to find Average:");
	Scanner Num = new Scanner(System.in);
	for(int counter=0;counter<10; counter++) {
		grade=Num.nextInt();
		sum=sum +grade;
		
	}
	
	Average=sum/10;
	System.out.println("Your Average is" + Average);
}
}
