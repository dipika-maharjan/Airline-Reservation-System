/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApp.Database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Karishma
 */
public class DatabaseConnection {
    public Connection connection;
    Statement statement;
    ResultSet resultset;
    
      public DatabaseConnection(){
        try {
            String username="root";
            String password="@Teju_sha3187";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseUrl="jdbc:mysql://localhost:3306/ticketbookingdb";
            connection = DriverManager.getConnection(databaseUrl,username,password);
            if(connection !=null){
                System.out.println("connected");
                
            }else{
                System.out.println("not connected");
                
            }
            statement=connection.createStatement();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
      public void manipulate(String query){
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet retrive(String query){
        try {
            resultset=statement.executeQuery(query);
            return resultset;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

