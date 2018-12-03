package com.Umera.Dao;
import java.sql.*;
import com.Umera.Bean.*;
public class RegisterDao {
	public String authorizeRegister(RegisterBean registerBean) 
    {
        String firstname=registerBean.getFirstname();
        String lastname=registerBean.getLastname();
        String username=registerBean.getUsername();  
        String password=registerBean.getPassword();
        
        String url="jdbc:mysql://localhost:3306/UmeraDB"; 
        String uname="root"; 
        String pass=""; 
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection(url,uname,pass); 
            
            PreparedStatement pstmt=null; 
            
            pstmt=con.prepareStatement("insert into user(firstname,lastname,username,password) values(?,?,?,?)"); //sql insert query
            pstmt.setString(1,firstname);
            pstmt.setString(2,lastname);
            pstmt.setString(3,username);
            pstmt.setString(4,password); 
            pstmt.executeUpdate();
            pstmt.close(); 
            
            con.close(); 
           
            return "SUCCESS REGISTER";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            return "FAIL REGISTER";
    }

}
