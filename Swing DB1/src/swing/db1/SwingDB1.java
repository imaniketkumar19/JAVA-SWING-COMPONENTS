package swing.db1;

import java.sql.*;
class SwingDB1 
{
public static void main(String a[]) throws ClassNotFoundException,SQLException
{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","aniket");
    Statement st= con.createStatement();
    int flag=st.executeUpdate("insert into Student values(1,'Aniket',5000)");
    if (flag!=0)
      System.out.println("Successfully added");
    else
    System.out.println("Unsuccessfully added");
    con.close();
}
}

 