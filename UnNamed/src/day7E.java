import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class day7E extends JFrame {
		private JPanel mousepanel;
		private JLabel statusbar;
		
		public day7E() {
			super("Title");
			mousepanel = new JPanel();
			mousepanel.setBackground(Color.WHITE);
			add(mousepanel,BorderLayout.CENTER);
			
			statusbar = new JLabel("dafault");
			add(statusbar, BorderLayout.SOUTH);
			
			HandlerClass handler = new HandlerClass();
			mousepanel.addMouseListener(handler);
			mousepanel.addMouseMotionListener(handler);
		}
		private class HandlerClass implements MouseListener, MouseMotionListener{
			public void mouseClicked(MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));
		}public void mousePressed(MouseEvent event) {
			statusbar.setText("You Pressed down the mouse");
		}
		
		public void mouseReleased(MouseEvent event) {
			statusbar.setText("You Released the button");
		}
		public void mouseEntered(MouseEvent event) {
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited(MouseEvent event) {
			statusbar.setText("The Mouse has Left the window");
			mousepanel.setBackground(Color.WHITE);
		}
		
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("You are dragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("You Moved the mouse");
		}
		}
		
}
