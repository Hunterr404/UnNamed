
public class day2_2 {

	public static void main(String[] args) {
		int age=90;
		if (age==30) {
			System.out.println(" You are Young");
		}else if(age<10) {
			System.out.println("You are a kid");
		}else if(age<20) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are Old");
			if (age>60) {
				System.out.println("You are really Old");
			}else {
				System.out.println("Dont worry You are not that old");
			}
		}
		System.out.println(age>80 ? "Aap bujurg aadmi hai" : "You are not a Senior Citizen");

	}

}
