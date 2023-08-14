package practicals;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practicals extends JFrame implements ActionListener{
    
    JButton b1, b2, b3;
    
    Practicals() {
        setTitle("Colour Change");
        setLayout(null);
        
        JLabel label = new JLabel();
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Click on a box");
        text.setFont(new Font("System", Font.BOLD, 30));
        text.setBounds(400, 40, 400 , 40);
        add(text);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(1000,700);
        setVisible(true);
        setLocation(350, 50);
        
        b1 = new JButton("RED");
        b1.setBounds(50, 100, 250, 250);
        b1.setFont(new Font("System", Font.BOLD, 20));
        b1.setBackground(Color.RED);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("BLUE");
        b2.setBounds(330, 100, 250, 250);
        b2.setFont(new Font("System", Font.BOLD, 20));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("YELLOW");
        b3.setBounds(610, 100, 250, 250);
        b3.setFont(new Font("System", Font.BOLD, 20));
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1) {
             getContentPane().setBackground(Color.RED);
        } else if(ae.getSource() == b2) {
             getContentPane().setBackground(Color.BLUE);
        } else if(ae.getSource() == b3) {
             getContentPane().setBackground(Color.YELLOW);
        }
    }
    
    public static void main(String[] args) {
        new Practicals();
    }
    
}