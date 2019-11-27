import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerDemo  extends JFrame{
  public ListenerDemo() {
	  JButton button = new JButton("My Button");
	  JTextField tf = new JTextField(20);
	  setLayout(new FlowLayout());
	  
	  String[] arr = new String[] {"A", "B", "C"};
	  JComboBox jcb = new JComboBox(arr);
	  
	  tf.addKeyListener(new KeyAdapter() {
		  @Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
//			e.getKeyChar()
		}
	});
	  tf.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			
			System.out.println(tf.getText());
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			
//			System.out.println(e.getKeyChar());

		}
		
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println(e.getKeyChar());
			
		}
	});
	  
	  
	 
	  addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	  add(tf);
	  add(button);
	  setSize(200,200);
	  setVisible(true);
  }
  
  public static void main(String[] args) {
	new ListenerDemo();
}
}
