
public class day5B4 {
	private day5B1[] thelist = new day5B1[5];
	private int i=0;
	public void add(day5B1 d) {
		if(i<thelist.length) {
		thelist[i]=d;
		System.out.println("day5B1 added at index  "+ i);
		i++;
		}
	}
 }
