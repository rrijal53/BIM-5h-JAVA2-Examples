import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Form extends JFrame implements ActionListener{
	JTextField name, address;
	JRadioButton male, female;
	ButtonGroup bg;
	JComboBox country;
	JLabel result, na, ad;
	JButton submit;

	String[] countries = {"Nepal", "India", "China"};

	public Form(){
		name = new JTextField(20);
		na = new JLabel("NAME");
		ad = new JLabel("ADDRESS");
		address = new JTextField(20);
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		
		country = new JComboBox(countries);
		result = new JLabel("Resutl");
		submit = new JButton("Submit");
		submit.addActionListener(this);
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);

		add(na);
		add(name);
		add(ad);
		add(address);
		add(male);
		add(female);
		add(country);
		add(submit);
		add(result);

		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
			if(e.getSource() == submit){
				String n = name.getText();
				String ad = address.getText();
				String gender = male.isSelected() ? "Male" : "Female";
				String c = countries[country.getSelectedIndex()] ;
				result.setText(n + " " + ad + " " + gender + " " + c);
			}
	}

	public static void main(String[] args) {
		new Form();
	}




}