package ServletProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ServletLogin extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static String password;
	static String mail;
		
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
				
			res.setContentType("text/html; charset=UTF-8");
			password = req.getParameter("passwd");
			mail= req.getParameter("mail");
			HttpSession session = req.getSession();
			session.setAttribute("mail", "");
			
			
			Login login = new Login();
			login.girisEkrani();			
						
			if(Login.karsilasma.equals("false")) {
				RequestDispatcher dispatcher = req
						.getRequestDispatcher("html/loginError.html");
				
				dispatcher.forward(req, res);
			}
			else if(Login.karsilasma.equals("true")){
			
			session.setAttribute("password", password);
			session.setAttribute("mail", mail);
							
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/servlethome");
			
			dispatcher.forward(req, res);
			}
	
		}
}
