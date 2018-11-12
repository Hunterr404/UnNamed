import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class day7 extends JFrame {
	
		private JTextField tf;
		private Font pf;
		private Font bf;
		private Font ift;
		private Font bif;
		private JRadioButton pb;
		private JRadioButton bb;
		private JRadioButton ib;
		private JRadioButton bib;
		private ButtonGroup group;
		
		public day7() {
			super("The Title");
			setLayout(new FlowLayout());
			
			tf = new JTextField("NoBody is hotter than me");
			add(tf);
			
			pb = new JRadioButton("plain",true);
			bb = new JRadioButton("bold", false);
			ib = new JRadioButton("italic",false);
			bib = new JRadioButton("bold and italic",false);
			add(pb);
			add(bb);
			add(ib);
			add(bib);
			
			group = new ButtonGroup();
			group.add(pb);
			group.add(bb);
			group.add(ib);
			group.add(bib);
			
			pf = new Font("serif", Font.PLAIN, 15);
			bf = new Font("serif", Font.BOLD, 15);
			ift = new Font("serif", Font.ITALIC, 15);
			bif = new Font("serif", Font.BOLD + Font.ITALIC, 15);
			tf.setFont(pf);
			//wait for event to happen 
			pb.addItemListener(new HandlerClass(pf));
			bb.addItemListener(new HandlerClass(bf));
			ib.addItemListener(new HandlerClass(ift));
			bib.addItemListener(new HandlerClass(bif));
		}
			private class HandlerClass implements ItemListener{
				private Font font;
				
				public HandlerClass(Font f) {
					font = f;
				}
				public void itemStateChanged(ItemEvent event) {
					tf.setFont(font);
					
				}
			}
			
			
						
		}

