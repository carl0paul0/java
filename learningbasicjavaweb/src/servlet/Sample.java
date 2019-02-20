package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample. This is still done by adding the servlet 
 * and its mapping to the web.xml. 
 */
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String HTMLSTART = "<HTML><BODY>";
	private static final String HTMLEND = "</BODY></HTML>";
	

    /**
     * Default constructor. 
     */
    public Sample() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(HTMLSTART+"<H1>Hello World</H1></BR><H2>This is a test</H2><P>done by: Carlo Paulo Tolentino</P>"+HTMLEND);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
