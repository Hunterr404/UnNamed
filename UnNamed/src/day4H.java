
public class day4H {
	private int sum;
	private final int NUMBER;
	public day4H(int x) {
		NUMBER = x;
	}
	public void add() {
		sum+=NUMBER;
	}
	public String toString() {
		return String.format("sum=%d\n",sum);
	}
}
