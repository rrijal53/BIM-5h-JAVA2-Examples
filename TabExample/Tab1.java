package TabExample;

import javax.swing.*;
import java.awt.*;
public class Tab1 extends JPanel {

	public Tab1() {
		setLayout(new FlowLayout());
		add(new JTextField(20));
		add(new JButton("Click me"));
	}
}
