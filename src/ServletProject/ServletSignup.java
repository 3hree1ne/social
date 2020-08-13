package ServletProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletSignup extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String name;
	static String password;
	static String mail;		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
				
			res.setContentType("text/html; charset=UTF-8");
			name = req.getParameter("name");
			password = req.getParameter("passwd");
			mail= req.getParameter("mail");
			
			Signup signup = new Signup();
			signup.kisiOlustur();	
			
			if(Signup.karsilasma.equals("true")) {
				RequestDispatcher dispatcher = req
						.getRequestDispatcher("html/signupError.html");
				
				dispatcher.forward(req, res);
			}
			else {
					
				/*
			HttpSession session = req.getSession();
			
			session.setAttribute("name", name);
			session.setAttribute("password", password);
			session.setAttribute("mail", mail);			
				
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("html/login.html");
			dispatcher.forward(req, res);
			*/
			res.sendRedirect("html/login.html");
			
			}	
		}	
}