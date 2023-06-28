package swing.arithmetic;
import javax.swing.*;
import java.awt.event.*;

public class SwingArithmetic extends JFrame  implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4,b5;
    
    public SwingArithmetic()
    {
        l1=new JLabel("Enter 1st Value:");
        l2=new JLabel("Enter 2nd Value:");
        l3=new JLabel("Result:");
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");
        b5=new JButton("%");
        l1.setBounds(10, 10, 120, 20);
        tf1.setBounds(140, 10, 100, 20);
        l2.setBounds(10 , 40, 120, 20);
        tf2.setBounds(140, 40, 100, 20);
        b1.setBounds(10, 70, 45, 20);
        b2.setBounds(60, 70, 45, 20);
        b3.setBounds(110, 70, 45, 20);
        b4.setBounds(160, 70, 45, 20);
        b5.setBounds(210, 70, 45, 20);
        l3.setBounds(10, 100, 120, 20);
        tf3.setBounds(140, 100, 100, 20);
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setVisible(true);
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        tf2.setText("0");
        tf1.setText("0");
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
        int x= Integer.parseInt(tf1.getText());
        int y= Integer.parseInt(tf2.getText());
        int r=0;
        if(a.getSource()==b1)
            r=x+y;
        else if(a.getSource()==b2)
            r=x-y;
        else if(a.getSource()==b3)
            r=x*y;
        else if(a.getSource()==b4)
            r=x/y;
        else if(a.getSource()==b5)
            r=x%y;
        
        tf3.setText(String.valueOf(r));
    }
    public static void main(String[] args) 
    {
        new SwingArithmetic();
    }
}

