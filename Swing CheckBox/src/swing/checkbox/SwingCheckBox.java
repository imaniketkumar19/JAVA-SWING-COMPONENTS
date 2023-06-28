package swing.checkbox;
//Working with Checkbox

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingCheckBox  extends JFrame implements ActionListener
{
    JLabel lb;
    JCheckBox m,f,o;
    JButton show;
    public SwingCheckBox ()
    {
        lb=new JLabel("Gender:");
        m=new JCheckBox("Male");
        f=new JCheckBox("Female");
        o=new JCheckBox("Other");
        show=new JButton("Show");
        lb.setBounds(20, 20, 80, 20);
        m.setBounds(110, 20, 60, 20);
        f.setBounds(180, 20, 80, 20);
        o.setBounds(260, 20, 60, 20);
        show.setBounds(130, 60, 80, 20);
        setLayout(null);
        add(lb);
        add(m);
        add(f);
        add(o);
        add(show);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(m.isSelected()||f.isSelected()||o.isSelected())
        {
            if(m.isSelected())
                JOptionPane.showMessageDialog(this, "Your gender is "+m.getText());
            else if(f.isSelected())
                JOptionPane.showMessageDialog(this, "Your gender is "+f.getText());
            else
                JOptionPane.showMessageDialog(this, "Your gender is "+o.getText());
        }
        else
            JOptionPane.showMessageDialog(this, "Select your gender first ");
    }
    public static void main(String[] args) 
    {
        new SwingCheckBox ();
    }
}
