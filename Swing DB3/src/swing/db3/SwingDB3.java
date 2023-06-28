package swing.db3;
import javax.swing.*;

import java.awt.event.*;

import java.sql.*;

import java.util.logging.Level;

import java.util.logging.Logger;
 

public class SwingDB3 extends JFrame implements ActionListener

{
    //Vector col,data;
   
    JLabel roll,name,fee;

    JTextField rf,nf,ff;

    JButton save,search,delete,update,close,clear,vtr;

    Connection con;

    Statement st;
  
    

    public SwingDB3()

    {
       
        roll=new JLabel("Enter Roll No:");

        name=new JLabel("Enter Name:");

        fee=new JLabel("Enter Fee:");

        rf=new JTextField();

        nf=new JTextField();

        ff=new JTextField();

        save=new JButton("Save");

        search=new JButton("Search");

        delete=new JButton("Delete");

        update=new JButton("Update");

        close=new JButton("Close");
        clear=new JButton ("Clear");
        vtr=new JButton ("View Table Records");

        setLayout(null);

        roll.setBounds(40, 20, 100, 20);

        name.setBounds(40, 50, 100, 20);

        fee.setBounds(40, 80, 100, 20);

        rf.setBounds(280, 20, 100, 20);

        nf.setBounds(280, 50, 100, 20);

        ff.setBounds(280, 80, 100, 20);

        save.setBounds(10, 110, 70, 20);

        search.setBounds(85, 110, 80, 20);

        delete.setBounds(170, 110, 80, 20);

        update.setBounds(255, 110, 80, 20);

        close.setBounds(340, 110, 80, 20);
        clear.setBounds(430, 110, 80, 20);
        vtr.setBounds(180, 150, 150, 20);

        add(roll); add(name); add(fee);

        add(rf); add(nf); add(ff);

        add(save); add(search); add(delete);

        add(update); add(close); add(clear);
        add(vtr);
        
        setVisible(true);

        setSize(550,250);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        save.addActionListener(this);

        search.addActionListener(this);

        close.addActionListener(this);

        update.addActionListener(this);

        delete.addActionListener(this);
        clear.addActionListener(this);
        vtr.addActionListener(this);

    update.setEnabled(false);

    delete.setEnabled(false);
   // table.setVisible(true);
   

    }

    @Override
    public void actionPerformed(ActionEvent a)

    {
        if(a.getSource()==vtr)
        {
            try {
                  
               TableFromDatabase x= new TableFromDatabase();
               x.show();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         if(a.getSource()==clear)
        {
                rf.setText("");
                nf.setText("");
                ff.setText("");
        }

        if(a.getSource()==save)

        {

            int flag=0;

          int roll1=Integer.valueOf(rf.getText());

            try {

                db();

              

                ResultSet rs=st.executeQuery("select * from student where rollno="+roll1);

                while(rs.next()){

                    flag=1;

                } 

            }catch (SQLException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            }

           

            

        if(flag==0){   

        int roll=Integer.valueOf(rf.getText());

        String name=String.valueOf(nf.getText());

        int fee=Integer.valueOf(ff.getText());

            try {

                db();

                int flag1=st.executeUpdate("insert into student values("+roll+",'"+name+"',"+fee+")");

                con.close();

                if(flag1!=0)

                    JOptionPane.showMessageDialog(this,"Successfully inserted a record");

                update.setEnabled(false);

                delete.setEnabled(false);

                rf.setText("");

                nf.setText("");

                ff.setText("");

               

            } catch (SQLException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        else
        {

         JOptionPane.showMessageDialog(this,"This roll no.'s record already exist");  
        }

        }

       

        if(a.getSource()==close)

                {

                    System.exit(1000);

                }

        if(a.getSource()==search)

        {

            int roll=Integer.valueOf(rf.getText());

            try {

                db();

                int flag=0;

                ResultSet rs=st.executeQuery("select * from student where rollno="+roll);

                while(rs.next()){

                    flag=1;

                    nf.setText(rs.getString(2));

                ff.setText(String.valueOf(rs.getInt(3)));

                update.setEnabled(true);

                delete.setEnabled(true);

                }

                if(flag==0)

                  JOptionPane.showMessageDialog(this,"Record not found"); 

                con.close();

            } catch (SQLException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            }
        }

        if(a.getSource()==update)

        {

        int roll=Integer.valueOf(rf.getText());

        String name=String.valueOf(nf.getText());

        int fee=Integer.valueOf(ff.getText());

            try {

                db();

                int flag=st.executeUpdate("update student set name='"+name+"',fee="+fee+" where rollno="+roll+"");

                con.close();

                if(flag!=0)

                    JOptionPane.showMessageDialog(this,"Successfully updated a record");

                update.setEnabled(false);

                delete.setEnabled(false);

                rf.setText("");

                nf.setText("");

                ff.setText("");

               

            } catch (SQLException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            }

       

        }

           if(a.getSource()==delete)

        {

        int roll=Integer.valueOf(rf.getText());

       

            try {

                db();

                int flag=st.executeUpdate("delete from student where rollno="+roll+"");

                con.close();

                if(flag!=0)

                    JOptionPane.showMessageDialog(this,"Successfully deleted a record");

                update.setEnabled(false);

                delete.setEnabled(false);

                rf.setText("");

                nf.setText("");

                ff.setText("");

               

            } catch (SQLException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            } catch (ClassNotFoundException ex) {

                Logger.getLogger(SwingDB3.class.getName()).log(Level.SEVERE, null, ex);

            }

       

        }

    }

   

    public void db() throws SQLException,ClassNotFoundException

    {

        Class.forName("oracle.jdbc.driver.OracleDriver");

        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","aniket");

        st=con.createStatement();

    }

 

    public static void main(String[] args) {

        new SwingDB3();

    }

}
