import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class day7B extends JFrame {
		private JComboBox box;
		private JLabel picture;
		
		private static String[] filename = {"11.jpg", "12.jpg"};
		private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
		
		public day7B() {
			super("The Title");
			setLayout(new FlowLayout());
			box = new JComboBox(filename);
			
			box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED) 
							picture.setIcon(pics[box.getSelectedIndex()]);
						
			
					}
				}
					
				);
			add(box);
			picture = new JLabel(pics[0]);
			add(picture);
		}
	
}
