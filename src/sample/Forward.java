package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forward
 */
@WebServlet("/Forward")
public class Forward extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Forward() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
		request.getRequestDispatcher("/jsp/forward/forward.jsp").forward(request, response);
		//このForwardのクラスファイルは`/serv/Forward.class`
		//そのためjspは`/serv/jsp/forward/forward.jsp`
		//WebContentのフォルダ = サーブレット名のフォルダ

		//request.getRequestDispatcher("/Serv").forward(request, response);
	}
}
