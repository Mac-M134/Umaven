package com.Umera.Controller;

import java.io.IOException;
import com.Umera.Bean.*;
import com.Umera.Dao.RegisterDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("btn_register")!=null)
        {
            String firstname=request.getParameter("txt_firstname");
            String lastname=request.getParameter("txt_lastname");
            String username=request.getParameter("txt_username"); 
            String password=request.getParameter("txt_password");
            
            RegisterBean registerBean=new RegisterBean(); 
            
            registerBean.setFirstname(firstname);
            registerBean.setLastname(lastname);
            registerBean.setUsername(username); 
            registerBean.setPassword(password);
            
            RegisterDao registerdao=new RegisterDao(); 
            
            String registerValidate=registerdao.authorizeRegister(registerBean); 
            
            if(registerValidate.equals("SUCCESS REGISTER"))
            {
                request.setAttribute("RegiseterSuccessMsg",registerValidate); 
                RequestDispatcher rd=request.getRequestDispatcher("Login.jsp"); 
                rd.forward(request, response);
            }
            else
            {
                request.setAttribute("RegisterErrorMsg",registerValidate);
                RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
                rd.include(request, response);
            }
        }
	}

}
