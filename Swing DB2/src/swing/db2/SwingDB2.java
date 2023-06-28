package swing.db2;
// Displaying Student's information from the database

import java.sql.*;

public class SwingDB2 
{
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","aniket");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from Student");
        System.out.println("Roll_No\t Name\t Fee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
        }
        con.close();
    }
}

 

    