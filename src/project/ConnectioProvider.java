/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;


/**
 *
 * @author Laden
 */
public class ConnectioProvider {
     public static Connection getCon()
     {
try
{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pro","root","laden");
    return con;
}
catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
}
     }
