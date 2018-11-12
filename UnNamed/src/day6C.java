import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class day6C extends JFrame{
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicbox;
	
	
	public day6C() {
		super ("The Title");
		setLayout(new FlowLayout());
		
		tf = new JTextField("This is a Sentence",20);
		tf.setFont(new Font("Serif", Font.PLAIN,15));
		add(tf);
		
		boldbox = new JCheckBox("Bold");
		italicbox = new JCheckBox("italic");
		add(boldbox);
		add(italicbox);
		
		HandlerClass handler = new HandlerClass();
		boldbox.addItemListener(handler);
		italicbox.addItemListener(handler);
	}
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			
			if(boldbox.isSelected()&& italicbox.isSelected())
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 15);
			else if(boldbox.isSelected())
				font = new Font("Serif", Font.BOLD,15);
			else if(italicbox.isSelected())
				font = new Font("Serif", Font.ITALIC,15);
			else 
				font = new Font("Serif", Font.PLAIN,15);
			tf.setFont(font);
			
			
			
			
		}
	}
}
