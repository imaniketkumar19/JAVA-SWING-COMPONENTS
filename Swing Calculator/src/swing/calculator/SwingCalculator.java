package swing.calculator;
import javax.swing.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame implements ActionListener
{
    JTextField tf;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,
            ba,bs,bm,bd,br,result,clr;
    String first;
    int op;
    
    public SwingCalculator()
    {
        tf=new JTextField();
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("*");
        bd=new JButton("/");
        br=new JButton("%");
        result=new JButton("Result");
        clr=new JButton("CLR");
        tf.setBounds(10, 10, 200, 20);
        b1.setBounds(10, 40, 45, 20);
        b2.setBounds(60, 40, 45, 20);
        b3.setBounds(110, 40, 45, 20);
        b4.setBounds(10, 70, 45, 20);
        b5.setBounds(60, 70, 45, 20);
        b6.setBounds(110, 70, 45, 20);
        b7.setBounds(10, 100, 45, 20);
        b8.setBounds(60, 100, 45, 20);
        b9.setBounds(110, 100, 45, 20);
        b0.setBounds(60, 130, 45, 20);
        ba.setBounds(170, 40, 45, 20);
        bs.setBounds(170, 70, 45, 20);
        bm.setBounds(170, 100, 45, 20);
        bd.setBounds(170, 130, 45, 20);
        br.setBounds(170, 160, 45, 20);
        result.setBounds(10, 160, 80, 20);
        clr.setBounds(100, 160, 60, 20);
        setLayout(null);
        add(tf);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(ba);
        add(bs);
        add(bm);
        add(bd);
        add(br);
        add(result);
        add(clr);
        setVisible(true);
        setSize(250,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        br.addActionListener(this);
        result.addActionListener(this);
        clr.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==b1)
            tf.setText(tf.getText()+"1");
        if(a.getSource()==b2)
            tf.setText(tf.getText()+"2");
        if(a.getSource()==b3)
            tf.setText(tf.getText()+"3");
        if(a.getSource()==b4)
            tf.setText(tf.getText()+"4");
        if(a.getSource()==b5)
            tf.setText(tf.getText()+"5");
        if(a.getSource()==b6)
            tf.setText(tf.getText()+"6");
        if(a.getSource()==b7)
            tf.setText(tf.getText()+"7");
        if(a.getSource()==b8)
            tf.setText(tf.getText()+"8");
        if(a.getSource()==b9)
            tf.setText(tf.getText()+"9");
        if(a.getSource()==b0)
            tf.setText(tf.getText()+"0");
        if(a.getSource()==ba)
        {
            op=1;
            first=tf.getText();
            tf.setText("");
        }
        if(a.getSource()==bs)
        {
            op=2;
            first=tf.getText();
            tf.setText("");
        }
        if(a.getSource()==bm)
        {
            op=3;
            first=tf.getText();
            tf.setText("");
        }
        if(a.getSource()==bd)
        {
            op=4;
            first=tf.getText();
            tf.setText("");
        }
        if(a.getSource()==br)
        {
            op=5;
            first=tf.getText();
            tf.setText("");
        }
        if(a.getSource()==result)
        {
            String second;
            second = tf.getText();
            int f=Integer.parseInt(first);
            int s=Integer.parseInt(second);
            switch(op)
            {
                case 1:
                    tf.setText(String.valueOf(f+s));
                    break;
                case 2:
                    tf.setText(String.valueOf(f-s));
                    break;
                case 3:
                    tf.setText(String.valueOf(f*s));
                    break;
                case 4:
                    tf.setText(String.valueOf(Double.valueOf(f)/Double.valueOf(s)));
                    break;
                case 5:
                    tf.setText(String.valueOf(f%s));
                    break;
                    
            }
        }
        if(a.getSource()==clr)
            tf.setText("");
    }
    
    public static void main(String[] args) 
    {
        new SwingCalculator();
    }
}
    