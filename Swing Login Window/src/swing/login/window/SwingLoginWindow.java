package swing.login.window;
// Login Window

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingLoginWindow extends JFrame implements ActionListener
{
    JLabel lb1,lb2,lb3;
    JTextField tf;
    JPasswordField pf;
    JButton login,reset;
    public SwingLoginWindow()
    {
        lb1=new JLabel("Login Portal");
        lb2=new JLabel("User ID:");
        lb3=new JLabel("Password:");
        tf=new JTextField();
        pf=new JPasswordField();
        login=new JButton("Login");
        reset=new JButton("Reset");
        lb1.setFont(new Font("SERIF",Font.BOLD,28));
        lb1.setBackground(Color.red);
        lb1.setBackground(Color.blue);
        lb2.setForeground(Color.GRAY);
        lb3.setForeground(Color.GRAY);
        login.setOpaque(true);
        reset.setOpaque(true);
        login.setForeground(Color.white);
        reset.setForeground(Color.black);
        login.setBackground(Color.blue);
        reset.setBackground(Color.LIGHT_GRAY);
        lb1.setBounds(70, 10, 200, 40);
        lb2.setBounds(20, 70, 120, 20);
        lb3.setBounds(20, 100, 120, 20);
        tf.setBounds(160, 70, 100, 20);
        pf.setBounds(160, 100, 100, 20);
        login.setBounds(50, 130, 80, 20);
        reset.setBounds(150, 130, 80, 20);
        setLayout(null);
        add(lb1); add(lb2); add(lb3); 
        add(tf); add(pf); 
        add(login); add(reset);
        setVisible(true);
        setSize(300,300);
        login.addActionListener(this);
        reset.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
        String u=tf.getText();
        String p=pf.getText();
        if(a.getSource()==login)
        {
            if(u.equals("ABC")&& p.equals("123"))
                JOptionPane.showMessageDialog(this, "Logged in Successfully!");
            else
                JOptionPane.showMessageDialog(this, "Invalid User ID or Password!");
        }
        if(a.getSource()==reset)
        {
            tf.setText("");
            pf.setText("");
        }
    }
    public static void main(String[] args) 
    {
        new SwingLoginWindow();
    }
}