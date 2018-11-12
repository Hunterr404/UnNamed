
public class day_1 {

	public static void main(String[] args) {
		int a=15, b=6;
		System.out.println("The remainder is 	" + a%b);
		int c;
		c=a/b;
		System.out.println("Value of c is	" + c);
		c++;
		System.out.println("New Value of c is	" + c);
		c*=5;
		System.out.println("New Value of c is	" + c);
		if(a>b && a%b==0) {
			System.out.println("Very Nice");
		}
		if(a/b== 2 || a%b==3) {
			System.out.println("Divisible or not Divisible");
		}
		else {
			System.out.println("Not so Nice");
		}
		switch(b) {
		case 1: 
			System.out.println("You are 1 year old");
			break;
		case 2:
			System.out.println("You are 2 year old");
			break;
		case 3:
			System.out.println("You are 3 year old");
			break;
		default:
				System.out.println("Dont Know How Old are You");
		break;		
		}
		int table=2;
		System.out.println("Table of 2 is");
		while(table<21) {
			System.out.println(table);
			table+= 2;
		}
	}

}
