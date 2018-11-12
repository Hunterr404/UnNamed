import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class day8 extends JFrame {
	private String details;
	private JLabel statusbar;
	
	public day8() {
		super("Title set by super");
		
		statusbar = new JLabel("This is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	private class Mouseclass extends MouseAdapter{
		public void mouseClicked(MouseEvent event) {
			details = String.format("You Clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with right mouse button";
			else if(event.isAltDown())
				details += "With center mouse button";
			else 
				details += "With left mouse button";
			
			statusbar.setText(details);
		}
	}

}
