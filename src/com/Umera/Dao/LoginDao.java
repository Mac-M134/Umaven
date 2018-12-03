package com.Umera.Dao;
import com.Umera.Bean.*;
import java.sql.*;
public class LoginDao {
	public String authorizeLogin(LoginBean loginBean)
    {
        String username=loginBean.getUsername(); 
        String password=loginBean.getPassword(); 
        
        String dbusername=""; 
        String dbpassword="";
        
        String url="jdbc:mysql://localhost:3306/UmeraDB"; 
        String uname="root"; 
        String pass=""; 
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pass);
            
            PreparedStatement pstmt=null; 
            
            pstmt=con.prepareStatement("select * from user where username=? and password=?");
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            ResultSet rs=pstmt.executeQuery(); 
             
            while(rs.next())
            {    
                dbusername=rs.getString("username");  
                dbpassword=rs.getString("password"); 
                
                if(username.equals(dbusername) && password.equals(dbpassword))
                {
                    return "SUCCESS LOGIN"; 
                }
            } 
           
            pstmt.close();
            
            con.close(); 
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }        
        return "WRONG USERNAME AND PASSWORD";
    }
}

