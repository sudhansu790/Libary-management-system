
package library.management.system;
import java.sql.*;


public class Conn {
     public static void main(String args[]){

     }
         
     
    
      Connection c;
      Statement s;
    public Conn(){
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///librarymanagementsystem", "root","123456");
            s = c.createStatement();
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}

