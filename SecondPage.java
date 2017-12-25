import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SecondPage extends JPanel{
	JTextField input;
	JRadioButton rbC, rbF;
	
	public SecondPage(String s, String gender) {
//		System.out.println("Name " + s);
//		name = new JLabel(s + " " + gender);
//		add(name);
		input = new JTextField(20);
		rbC = new JRadioButton("Convert to c");

		rbF = new JRadioButton("Convert to f");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbC);
		bg.add(rbF);
		rbC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});;
		add(rbC);
		add(rbF);
		
		setSize(200, 200);
		setVisible(true);
	}
	

}
