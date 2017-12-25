package TabExample;

import javax.swing.*;
import java.awt.*;
public class TabExample2 extends JFrame {

	JLabel l;
	JTabbedPane tab;
	public TabExample2() {
		tab = new JTabbedPane();
		l = new JLabel("Test ");
		JPanel tab1 = new Tab1();
		tab.addTab("Tab1", tab1 );
		tab.addTab("Tab2", new JLabel("22") );
		add(tab, BorderLayout.CENTER);
		setSize(300, 200);
		add(tab, BorderLayout.CENTER);

		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new TabExample2();
	}
}
