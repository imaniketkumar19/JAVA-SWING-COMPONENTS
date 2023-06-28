package swing.combobox;
// Working with JComboBox

import javax.swing.*;
import java.awt.event.*;

public class SwingComboBox  extends JFrame implements ActionListener
{
    JLabel lb;
    JComboBox country;
    JButton btn;
    public SwingComboBox ()
    {
        lb=new JLabel("Select your Country:");
        String c[]={"India","Srilanka","Nepal","USA"};
        country=new JComboBox(c);
        country.addItem("Australia");
        btn=new JButton("Show");
        lb.setBounds(20, 20, 120, 20);
        country.setBounds(150, 20, 100, 20);
        btn.setBounds(100, 60 , 80, 20);
        setLayout(null);
        add(lb); add(country); add(btn);
        setVisible(true);
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        btn.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent a)
    {
        JOptionPane.showMessageDialog(this, "Your selected country is "+country.getSelectedItem());
    }
    public static void main(String[] args) {
        new SwingComboBox ();
    }
}


    