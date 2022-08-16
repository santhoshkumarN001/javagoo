

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class actionn
 */
@WebServlet("/actionn")
public class actionn extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public actionn() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		String s=request.getParameter("fname");
		pw.println("<h1>Hello,"+s);
		
		String z=request.getParameter("mname");
		pw.println("<h1>middle name:,"+z);
		
		String a=request.getParameter("lname");
		pw.println("<h1>last name:,"+a);
		
		
		
		String t=request.getParameter("provice");
		pw.println("<h1>PROVINCE:,"+t);
		
		String u=request.getParameter("sex");
		pw.println("<h1>GENDER:,"+u);
		
		String v=request.getParameter("city");
		pw.println("<h1>CITY:,"+v);
		
		String w=request.getParameter("dob");
		pw.println("<h1>DATE OF BIRTH,"+w);
		
		String d=request.getParameter("address1");
		pw.println("<h1>ADDERSS,"+d);
		
		String e=request.getParameter("address2");
		pw.println("<h1>street address,"+e);
		
		
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
