package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleNew. Since the introduction of annotation
 * in Servlet 3.0 you no longer need to map the servlets in the web.xml.
 * You can see below we already added the info in the @WebServlet annotations. 
 */
@WebServlet(
		name = "SampleNew",
		description = "practice",
		urlPatterns = {"/SampleNew"}
)
public class SampleNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String HTMLSTART = "<HTML><BODY>";
	private static final String HTMLEND = "</BODY></HTML>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SampleNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println(HTMLSTART+"<H1>Hello Again</H1></BR><H2>This is a test. Not mapped to the web.xml</H2><P>done by: Carlo Paulo Tolentino</P>"+HTMLEND);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
