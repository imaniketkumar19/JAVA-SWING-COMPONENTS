package swing.buttonformatting;
// Working with Button Formatting


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingButtonFormatting implements ActionListener
{
    JFrame f =new JFrame("Welcome");
    JButton ok;
    public SwingButtonFormatting()
    {
        ok=new JButton("OK");
        ok.setBounds(170, 190, 60, 20);
        f.setLayout(null);
        f.add(ok);
        ok.setBackground(Color.yellow);
        ok.setForeground(Color.RED);
        ok.setOpaque(true);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLocationRelativeTo(null);
        ok.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
            JOptionPane.showMessageDialog(ok, "Welcome");
    }
    public static void main(String[] args) 
    {
        new SwingButtonFormatting();
    }
}



/*package Examples;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EX10 extends JFrame implements ActionListener
{
    JButton btn;
    public EX10()
    {
        btn=new JButton("OK");
        btn.setBounds(180, 180, 60, 20);
        add(btn);
        setLayout(null);
        btn.setBackground(Color.YELLOW);
        btn.setForeground(Color.RED);
        btn.setOpaque(true);
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent a)
    {
        JOptionPane.showMessageDialog(this, "Welcome");
    }
    public static void main(String[] args) 
    {
        new SwingButtonFormatting();
    }
}*/


    