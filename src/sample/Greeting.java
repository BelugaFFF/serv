package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

public class Greeting extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Greeting() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String user = request.getParameter("user");

		Page.header(out);
		out.println("<p>こんにちは、" + user + "さん</p>");//未入力だとnullさんになる
		Page.footer(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
