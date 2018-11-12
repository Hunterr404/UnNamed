import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class day8H extends JFrame{
		private JButton b;
		private Color color = (Color.WHITE);
		private JPanel panel;
		
		public day8H() {
			super("The Title");
			panel = new JPanel();
			panel.setBackground(color);
			
			b= new JButton("Choose a Color");
			b.addActionListener(
					new ActionListener() {
						public void actionPerformed(ActionEvent event) {
							
							color = JColorChooser.showDialog(null, "Pick Your Color", color);
							if(color==null)
								color=(Color.WHITE);
							panel.setBackground(color);
							
						}
					}
					
					);
						add(panel, BorderLayout.CENTER);
						add (b, BorderLayout.SOUTH);
						setSize(425,150);
						setVisible(true);
			
		}
	

}
