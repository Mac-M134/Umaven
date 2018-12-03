package com.Umera.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Umera.Bean.QuestionBean;
import com.Umera.Dao.QuestionDao;

/**
 * Servlet implementation class QuestionController
 */
@WebServlet("/QuestionController")
public class QuestionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		if(request.getParameter("btnSubmit")!=null)
        {	
			String q_title=request.getParameter("q_title");
	        String q_text=request.getParameter("q_text");  
	        String q_postedBy=request.getParameter("q_postedby");
            
	        QuestionBean questionBean=new QuestionBean(); 
            
            questionBean.setQ_title(q_title);
            questionBean.setQ_text(q_text);
            questionBean.setQ_postedBy(q_postedBy); 
            
            QuestionDao questiondao=new QuestionDao(); 
            
            String questionValidate=questiondao.authorizeRegister(questionBean); 
            
            if(questionValidate.equals("SUCCESS"))
            {
                request.setAttribute("QuestionSuccessMsg",questionValidate); 
                RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp"); 
                rd.forward(request, response);
            }
            else
            {
                request.setAttribute("QuestionErrorMsg",questionValidate);
                RequestDispatcher rd=request.getRequestDispatcher("Question.jsp");
                rd.include(request, response);
            }
        }
		
		
		
		
	}

}
