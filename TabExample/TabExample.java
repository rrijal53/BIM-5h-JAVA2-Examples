package TabExample;

import javax.swing.*;
import java.awt.*;
public class TabExample extends JFrame {
	String[] abc = {"abc", "cde", "adjf"};

	JTabbedPane tab;
	public TabExample () {
		tab = new JTabbedPane();
		add(tab, BorderLayout.CENTER);
		
		
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		JTextField tf = new JTextField(20);
		JButton btn = new JButton("Click");
		p.add(tf);
		p.add(btn);
		
		
		tab.addTab("TAB", p);
		tab.addTab("TAB2", new JLabel("TAB 2 :)"));
		tab.addTab("Temp", new Temp());
		setSize(400,  400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new TabExample();
	}
	 
}
	 