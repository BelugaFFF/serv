package mytest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class CookieMemo
 */
@WebServlet("/CookieMemo")
public class CookieMemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieMemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		input(out);

		Page.footer(out);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		String newTag = (String)request.getParameter("tag");
		String newText = (String)request.getParameter("text");

		Cookie cookie = new Cookie(URLEncoder.encode(newTag,"utf-8"),URLEncoder.encode(newText,"utf-8"));
		cookie.setMaxAge(60);
		response.addCookie(cookie);


		ArrayList<String> tags = new ArrayList<String>();
		ArrayList<String> texts = new ArrayList<String>();
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				tags.add(URLDecoder.decode(c.getName(), "utf-8"));
				texts.add(URLDecoder.decode(c.getValue(), "utf-8"));
			}
		}

		input(out);
		out.println("<br>");
		out.println("<p>-----メモ-----</p>");
		if(tags != null && texts != null) {
			for(int i = 0;i < tags.size(); i++) {
				out.println(tags.get(i) + ":" + texts.get(i));out.println("<br>");
			}
		}
		out.println(newTag + ":" + newText);out.println(" <-new!");out.println("<br>");

		Page.footer(out);
	}

	public void input(PrintWriter out) {
		out.println("<p>メモを記入</p>");
		out.println("<form action=\"CookieMemo\" method=\"post\">");
		out.println("タグ:<input type=\"text\" name=\"tag\">");
		out.println("本文:<input type=\"text\" name=\"text\">");
		out.println("<input type=\"submit\" value=\"送信\">");
		out.println("</form>");
		out.println("<br>");
	}
}
