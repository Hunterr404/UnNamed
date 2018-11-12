
public class day3 {
public static void main(String args[]) {
		int Diary[]= {5,10,15,20,25};
		int sum=0;
		int newsum=0;
		for(int counter=0; counter<Diary.length; counter++) {
			sum+=Diary[counter];
			
		}
		System.out.println("Sum is\t" + sum);
		for(int x:Diary) {
			newsum+=x;
			
		}
		System.out.println("New Sum is" + sum);
		
			change(Diary);
		
		for(int y: Diary) 
			System.out.println(y);
		}
	
		public static void change(int x[]) {
			for(int counter=0; counter<x.length; counter++)
				x[counter]+=5;	
		}
		
}
