package com.Umera.Dao;
import java.sql.*;

import com.Umera.Bean.QuestionBean;
public class QuestionDao {
	public String authorizeQuestion(QuestionBean questionBean) 
    {
        int q_no=questionBean.getQ_no();
        String q_title=questionBean.getQ_title();
        String q_text=questionBean.getQ_text();  
        String q_postedBy=questionBean.getQ_postedBy();
        
        String url="jdbc:mysql://localhost:3306/UmeraDB"; 
        String uname="root"; 
        String pass=""; 
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection(url,uname,pass); 
            
            PreparedStatement pstmt=null; 
            
            pstmt=con.prepareStatement("insert into questions(q_title,q_text,q_postedby,q_answered) values(?,?,?,?)"); //sql insert query
            pstmt.setString(1,q_title);
            pstmt.setString(2,q_text);
            pstmt.setString(3,q_postedBy);
            pstmt.setString(4,"false"); 
            pstmt.executeUpdate();
            pstmt.close(); 
            
            con.close(); 
           
            return "SUCCESS";
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            return "FAIL";
    }
	

}
