package swing.dm;
// Swing program without extending JFrame Class


import javax.swing.*;
import java.awt.event.*;

public class SwingDM implements ActionListener
{
    JFrame f =new JFrame("Welcome");
    JButton ok;
    public SwingDM()
    {
        ok=new JButton("OK");
        ok.setBounds(170, 190, 60, 20);
        f.setLayout(null);
        f.add(ok);
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
        new SwingDM();
    }
}




   