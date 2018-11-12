import java.util.Scanner;
public class day1 {

	public static void main(String[] args) {
		int a, b ,c;
		Scanner dj = new Scanner(System.in);
		System.out.println("Enter a number");
		a=dj.nextInt();
		System.out.println("You have Entered	"+ a);
		Scanner dj1 = new Scanner(System.in);
		System.out.println("Enter 2nd number");
		b=dj1.nextInt();
		System.out.println("You have Entered	"+ b);
		c=a+b;
		System.out.println("Sum is	" + c);
		System.out.println("Table of b is");
		do {
			
			System.out.println(b);
			b+=b;
		}while(	b<b*11);
		
	}
}