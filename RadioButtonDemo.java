import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonDemo extends JFrame implements ActionListener {
	
	JRadioButton rbMale, rbFemale;
	ButtonGroup bgGender;
	JLabel lbResult;
	public RadioButtonDemo() {
		setLayout(new FlowLayout());
		
		rbMale = new JRadioButton("Male");
		rbFemale = new JRadioButton("Female");
		lbResult = new JLabel();
		
		bgGender = new ButtonGroup();
		bgGender.add(rbMale);
		bgGender.add(rbFemale);
		add(rbMale);
		add(rbFemale);
		add(lbResult);
		rbMale.addActionListener(this);
		rbFemale.addActionListener(this);
		setSize(500, 500);
		setVisible(true);
	}
	
	
public static void main(String[] args) {
	new RadioButtonDemo();
}

public void actionPerformed(ActionEvent e) {
		lbResult.setText(e.getActionCommand()  + " Selected");
	
}


	

}
