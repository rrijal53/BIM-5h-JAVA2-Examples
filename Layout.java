import javax.swing.*;
import java.awt.*;
class Layout extends JFrame{

	public Layout(){
		JLabel lbl = new JLabel("Teesttt");
		JLabel lbl2 = new JLabel("Teesttt 222");		
		JLabel lbl3 = new JLabel("Teesttt 3");
		JLabel lbl4 = new JLabel("Teesttt 222");
		//add(lbl, BorderLayout.NORTH);
		//add(lbl2, BorderLayout.SOUTH);
		JPanel jp = new JPanel();
		jp.add(lbl);
		jp.add(lbl2);
		setLayout(new GridLayout(4,2));
		add(jp);
		add(lbl3);
		add(lbl4);
		setSize(300,300);
		setVisible(true);
	}

public static void main(String[] args) {
	new Layout();
}
}