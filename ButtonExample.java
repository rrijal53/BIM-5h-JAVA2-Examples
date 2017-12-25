import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener{
	JLabel result;
	JTextField name;
	JButton btn1, btn2;
	public A() {
		result = new JLabel ("Result");
		btn2 = new JButton("Button 2");
		name = new JTextField (30);
		btn1 = new JButton ("submit");
        add (result,BorderLayout.NORTH);
        result.setForeground(Color.RED);
        add (name,BorderLayout.CENTER);
        add(btn2, BorderLayout.EAST);
     
        btn1.addActionListener (new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText("Button 1 clicked");

			}
		});
        btn2.addActionListener (this);

        add(btn1, BorderLayout.SOUTH);
        setBounds(10, 10, 300, 300);
        Container aa = this.getContentPane();
        aa.setBackground(Color.GREEN);
        setVisible (true);
   
	}
	public void actionPerformed (ActionEvent or) {
		System.out.println(or.getActionCommand());
		if(or.getActionCommand().equals("submit")) {
		String n = name.getText();
		result.setText(n);
		}
		else {
			result.setText("Button 2 clicked");
		}
	}
	}
public class ButtonExample {
		public static void main(String[] args) {
			new A();
		}
}
