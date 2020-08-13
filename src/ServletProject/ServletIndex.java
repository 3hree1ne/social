package ServletProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String mail;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=UTF-8");
		HttpSession session = req.getSession();
		if(session.getAttribute("mail") == null) {
			System.out.println(session.getAttribute("mail") + " calisiyor mu?");
			res.sendRedirect("html/login.html");
		}
		else {			
			System.out.println(session.getAttribute("mail") + " calisiyor mu?");
			RequestDispatcher dispatcher = req
					.getRequestDispatcher("/servlethome");
			
			dispatcher.forward(req, res);
		}
	}

}
