package com.Umera.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Umera.Bean.LoginBean;
import com.Umera.Dao.LoginDao;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btn_login")!=null) 
        {
            String username=request.getParameter("txt_username"); 
            String password=request.getParameter("txt_password"); 
            
            LoginBean loginBean=new LoginBean(); 
            
            loginBean.setUsername(username); 
            loginBean.setPassword(password); 
            
            LoginDao loginDao=new LoginDao();
            
            String authorize=loginDao.authorizeLogin(loginBean);
            
            if(authorize.equals("SUCCESS LOGIN")) 
            {
                HttpSession session=request.getSession(); //session is created
                session.setAttribute("login",loginBean.getUsername()); //session name is "login" and  store username in "getUsername()" get through loginBean object
                RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp"); //redirect to welcome.jsp page
                rd.forward(request, response);
            }
            else
            {
                request.setAttribute("WrongLoginMsg",authorize); //wrong login error message is "WrongLoginMsg"
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp"); //show error same index.jsp page
                rd.include(request, response);
            }
        }
	}

}
