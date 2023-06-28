package swing.db3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintException;
import javax.swing.*;
import javax.swing.table.*;

public class TableFromDatabase extends JFrame implements ActionListener
{
    JTable table;
      public TableFromDatabase()throws SQLException,ClassNotFoundException
      {     
            
            Vector columnNames = new Vector();
            Vector data = new Vector();
            try
            {
                  //  Connect to the Database

                  String driver = "oracle.jdbc.driver.OracleDriver";

                   Class.forName( driver );
                  Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","aniket");

                  //  Read data from a table

                  String sql = "select * from student ORDER BY rollno ASC";
                  Statement stmt = connection.createStatement();
                  ResultSet rs = stmt.executeQuery( sql );
                  ResultSetMetaData md = rs.getMetaData();
                  int columns = md.getColumnCount();

                  //  Get column names

                  for (int i = 1; i <= columns; i++)
                  {
                        columnNames.addElement( md.getColumnName(i) );
                  }

                  //  Get row data

                  while (rs.next())
                  {
                        Vector row = new Vector(columns);

                        for (int i = 1; i <= columns; i++)
                        {
                              row.addElement( rs.getObject(i) );
                        }

                        data.addElement( row );
                  }

                  rs.close();
                  stmt.close();
            }
            catch(Exception e)
            {
                  System.out.println( e );
            }

            //  Create table with database data
            
            table = new JTable(data, columnNames);
            JScrollPane scrollPane = new JScrollPane( table );
            getContentPane().add( scrollPane );

            JPanel buttonPanel = new JPanel();
            getContentPane().add( buttonPanel, BorderLayout.SOUTH );
            
           
            setSize(500,400);
            JButton print;
            print=new JButton("Print");
            add(print,BorderLayout.SOUTH);
            print.addActionListener(this);
            
        }
        public void actionPerformed(ActionEvent a)
          {
            try 
            {
            table.print();    
            }catch(PrinterException pe)
            {
              System.err.println(pe.getMessage());  
            }
        }  
            
}

