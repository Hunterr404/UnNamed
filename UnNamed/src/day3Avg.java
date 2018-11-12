
public class day3Avg {
public static void main(String args[]) {
	System.out.println(Average(12,13,14,15,16));
	System.out.println(Average(98,97,96,95,94));
}public static int Average(int...Numbers) {
	int total=0;
	for(int x:Numbers) { 
		total+=x;}
	return total/Numbers.length;
}
}
