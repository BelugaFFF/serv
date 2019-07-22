package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Integer count = new Integer(0);

    public Serv() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;

		//response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		//out.println(createHtml(count.toString()));
		out.println("hello!");

		//out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		//out.println(createHtml(count.toString()));

		//out.close();
	}

	protected String createHtml(String methodType) {
		StringBuffer sb = new StringBuffer();

		  sb.append("<html>");
		    sb.append("<head>");
		    sb.append("<title>サンプル</title>");
		    sb.append("</head>");
		    sb.append("<body>");
		    sb.append("<p>");
		    sb.append(methodType);
		    sb.append("メソッドで呼び出されました</p>");

		    sb.append("<p><a href=\"/serv/serv\">リンク</a></p>");

		    sb.append("<form action=\"/serv/serv\" method=\"get\">");
		    sb.append("<input type=\"submit\" value=\"GETで送信\">");
		    sb.append("</form>");

		    sb.append("<form action=\"/serv/serv\" method=\"post\">");
		    sb.append("<input type=\"submit\" value=\"POSTで送信\">");
		    sb.append("</form>");

		    sb.append("<p>" + new java.util.Date() + "</p>");

		    sb.append("</body>");
		    sb.append("</html>");

		    return new String(sb);
	}
}
