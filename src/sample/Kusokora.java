package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

public class Kusokora extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Kusokora() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");
		String text = request.getParameter("text");
		String industry = request.getParameter("industry");
		String position = request.getParameter("position");
		String age = request.getParameter("age");

		Page.kusokoraHeader(out);
		out.println("");

		test(out,text);
		test(out,industry);
		test(out,position);
		test(out,age);

		out.println("<div class=\"bookBox clearfix fadeOvj\" style=\"color: rgb(1, 124, 155); opacity: 1; transform: matrix(1, 0, 0, 1, 0, 0);\">");
		out.println("<img class=\"sp\" src=\"https://www.hatakoto.jp/wp-content/themes/hataraku/img/bg_book_space.jpg\" alt=\"\">");
		out.println("<p class=\"chinMsg vertical\">");
		//右下のアレ
		//業種
		out.println("");
		out.println("<span>/</span>");
		//職種

		//年代

		out.println("</p>");

		out.println("<div class=\"chinContent vertical\" id=\"chinContent\" style=\"top: 99.5px;\">" + text + "</div>");
		out.println("</div>");
		out.println("</div>");
		out.println("");
		out.println("");
		Page.footer(out);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void test(PrintWriter out,String text) {
		out.println("<p>" + text + "</p>");
	}

}
