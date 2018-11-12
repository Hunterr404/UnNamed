import javax.swing.JOptionPane;


public class day6 {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter your first number");
		String sn = JOptionPane.showInputDialog("Enter Second number");
		int num1 = Integer.parseInt(fn);
		int num2  = Integer.parseInt(sn);
		int sum = num1+num2;
		JOptionPane.showMessageDialog(null, "Your sum is+ "+ sum, "Title is Sum", JOptionPane.PLAIN_MESSAGE);

	}

}
