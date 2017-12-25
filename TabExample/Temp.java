package TabExample;

import javax.swing.*;
import java.awt.*;
public class Temp extends JPanel{
	JTextField input;
	JRadioButton rbConvertToCel, rbConvertToF;
	public Temp() {
		setLayout(new FlowLayout());
		input = new JTextField(20);
		ButtonGroup bg = new ButtonGroup();
		rbConvertToCel = new JRadioButton("Celsius");
		rbConvertToF = new JRadioButton("Fahrenheit");
		bg.add(rbConvertToCel);
		bg.add(rbConvertToF);
		add(input);
		add(rbConvertToCel);
		add(rbConvertToF);
		setSize(300, 300);
		setVisible(true);
		//TODO : Complete the program 
	}
	
	
}
