import javax.swing.*;
import java.awt.*;
public class day8I1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		day8I p = new day8I();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500,270);
		f.setVisible(true);
		
	}

}
