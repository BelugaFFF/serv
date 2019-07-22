package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init() throws ServletException {
    	System.out.println("init");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	System.out.println("service");
    	super.service(request, response);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	public void outf(String fName,String msg) {
		try {
			FileWriter file = new FileWriter("\\tmp\\" + fName);
			PrintWriter pw = new PrintWriter(new BufferedWriter(file));

			pw.println(msg);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
