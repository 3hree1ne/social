package ServletProject;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletHome extends HttpServlet implements Serializable{
	private static final long serialVersionUID = 1L;
	
	static AnaEkran anaEkran = new AnaEkran();
	
	public static int tid = anaEkran.tidOku();

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		res.setContentType("text/html; charset=UTF-8");
		res.setCharacterEncoding("UTF-8");
		req.setAttribute("list", AnaEkran.Kisiler);
		req.setAttribute("tid",	tid);
		RequestDispatcher dispatcher = req.
				getRequestDispatcher("jsp/home.jsp");
		
		dispatcher.forward(req, res);
		
	}
}
