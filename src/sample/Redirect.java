package sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirect
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		System.out.println(count);
		//response.sendRedirect("http://localhost:8080/serv/Redirect");
		//リダイレクトを繰り返すとブラウザでは何も表示しない -> ERR_TOO_MANY_REDIRECTS
		//40~あたりでブラウザがエラー吐く
		response.sendRedirect("http://tomcat.apache.org/");

		//response.sendRedirect("Include");
		//サーブレットへのリダイレクト
		//「レスポンスがコミットされた後でsendRedirect()を呼び出すことはできません」
		//java.lang.IllegalStateException
	}
}
