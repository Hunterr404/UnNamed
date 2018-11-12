import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class day8F extends JFrame {
	
	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public day8F () {
		super("the Title");
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		//Left stuff is here
		lb = new JButton("Left");
		add(lb);
		lb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);
					}
				}
				
				
				);
		//center stuff is here
		cb = new JButton("CENTER");
		add(cb);
		cb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);
					}
				}
				
				
				);
		//Right stuff is here
		rb = new JButton("Right");
		add(rb);
		rb.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);
					}
				}
				
				
				);
		
	}
}
