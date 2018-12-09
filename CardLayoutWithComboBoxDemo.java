

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutWithComboBoxDemo implements ItemListener {
    JPanel cards; 
    
    final static String BUTTONPANEL = "Card with JButtons";
    final static String TEXTPANEL = "Card with JTextField";
    
    public void addComponentToPane(Container pane) {
        //Put the JComboBox in a JPanel to get a nicer look.
        JPanel comboBoxPane = new JPanel(); 
        String comboBoxItems[] = { BUTTONPANEL, TEXTPANEL, "sdsds" };
      
        JComboBox cb = new JComboBox(comboBoxItems);
        cb.setEditable(false);
        
        
        //add listener
        cb.addItemListener(this);
        comboBoxPane.add(cb);
        
        //Create the "cards".
        JPanel card1 = new JPanel();
        card1.add(new JButton("Button 1"));
        card1.add(new JButton("Button 2"));
        card1.add(new JButton("Button 3"));
        card1.add(new JButton("Button 4"));

        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));
        
        //Create the panel that contains the "cards".
        cards = new JPanel(new CardLayout());
        cards.add(card1, BUTTONPANEL);
        cards.add(card2, TEXTPANEL);
        
        pane.add(comboBoxPane, BorderLayout.PAGE_START);
        pane.add(cards, BorderLayout.CENTER);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(cards.getLayout());
        cl.show(cards, (String)evt.getItem());
    }
    
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CardLayoutWithComboBoxDemo demo = new CardLayoutWithComboBoxDemo();
        demo.addComponentToPane(frame.getContentPane());
       
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
     
                createAndShowGUI();
           
        
    }
}