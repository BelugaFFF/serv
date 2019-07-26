package advance;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class CountC
 */
@WebServlet("/CountC")
public class CountC extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		Cookie[] cookies = request.getCookies();
		Integer count = null;

		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().contentEquals("count")) {
					count = Integer.valueOf(cookie.getValue());
					break;
				}
			}
		}

		if(count == null) {
			count = 0;
		}
		count++;

		Cookie cookie = new Cookie("count", count.toString());
		cookie.setMaxAge(60);
		response.addCookie(cookie);

		out.println(count);
		Page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
