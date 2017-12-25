import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FormMenuBarAndValidation extends JFrame implements ActionListener {
JTextField name, address, phone;
JTextArea description;
JLabel result;
JRadioButton rbMale, rbFemale;
 
	public FormMenuBarAndValidation() {
		name = new JTextField(50);
		add(new JLabel("Name:"));
		add(name);
		add(new JLabel("Gender:"));
		
		rbMale = new JRadioButton("Male", true);
		rbFemale = new JRadioButton("Female");

		rbMale.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbMale);
		bg.add(rbFemale);
		add(rbMale);
		add(rbFemale);
		add(new JLabel("Address:"));
		address = new JTextField(50);
		add(address);
		add(new JLabel("Phone:"));
		phone = new JTextField(50);
		add(phone);
		add(new JLabel("Tell me about yourself:"));
		description  = new JTextArea();
		add(description);
		
		//Menu Bar
		JMenuBar m = new JMenuBar();
		JMenuItem i = new JMenuItem("HEY");
		JMenuItem j = new JMenuItem("HEY MR");
		JMenu menu = new JMenu("A Menu");
		
		menu.add(i);
		menu.addSeparator();
		menu.add(j);
		menu.addSeparator();
		m.add(menu);
		setJMenuBar(m);
		JButton jbtn = new JButton("Submit");
		jbtn.addActionListener(this);
		add(jbtn);

		result = new JLabel();
		add(result);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new GridLayout(0,1));
		setVisible(true);
	}
	  public void actionPerformed(ActionEvent e) {
		  String n = name.getText();
		  String a = address.getText();
		  String p = phone.getText();
		  String desc = description.getText();
		  String gen = rbMale.isSelected() ? "Male" : "Female";
		 
		  if(n.isEmpty()) {
				result.setText("Please enter your name");
				return;
		  }
		  if(a.isEmpty()) {
			  result.setText("Please enter your address");
			  return;
		  }
			long ph;	
		  if(p.length() < 10) {
			  result.setText("Please enter phone number with no less than 10 digit");
			  return;
		  }else {
			  try {
				 ph = Long.parseLong(p);  
			  }catch(Exception ex) {
				  ex.printStackTrace();
				  result.setText("Invalid phone number.");
				  return;
			  }
		  }
		  
		  result.setText("Name : " + n + "\nAddress: " + a +"\nGender: "+ gen + "\nPhone: "  + ph + "\nDescription:" + desc);
	  }
	public static void main(String[] args) {
		new FormMenuBarAndValidation();
	}
}
