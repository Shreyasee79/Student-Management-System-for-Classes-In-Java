/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author Lenovo
 */
public class CommonFunctions 
{
    static Connection getCon()
    {
        Connection con;
        try 
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classesdb","root","mySQL@16");
        } 
        catch (SQLException e) 
        {
            con=null;
            System.out.println("Exception Caught "+e);
        }
        return con;
    }
    
    
    
    
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        try{Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classesdb", "root", "mySQL@16");
//String query = "INSERT INTO s (id, photo) VALUES (?, ?)";
//PreparedStatement pst = con.prepareStatement(query);
//pst.setInt(1, 1); // Example ID
//FileInputStream fis = new FileInputStream("E:\\BVCOEW\\Java\\FinalProject\\src\\finalproject\\bus1.jpg");
//pst.setBinaryStream(2, fis, fis.available());
//pst.executeUpdate();
//        
//        }
//catch(SQLException e)
//{
//}
//        
//
//    }
    
    
}


