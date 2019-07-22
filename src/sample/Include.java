package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class include
 */
@WebServlet("/Include")
public class Include extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Include() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		Page.header(out);
		request.getRequestDispatcher("/jsp/include/include1.jsp").include(request, response);
		request.getRequestDispatcher("/jsp/include/include2.jsp").include(request, response);

		request.getRequestDispatcher("soutai/soutai.html").include(request, response);
			//ドキュメント相対URL => /ドキュメント(サーブレット)のカレントディレクトリ/soutai/soutai.html
		request.getRequestDispatcher("/soutai/soutai.html").include(request, response);
			//サイトルート相対URL => /serv(コンテキストルート)/soutai/soutai.html
		request.getRequestDispatcher("/soutai/../soutai/soutai.html").include(request, response);
			//serv -> soutai -> serv -> soutai -> soutai.html

		Page.footer(out);
	}
}
