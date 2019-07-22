package sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Select() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("getMethod ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");

		//以下のコードをsetCharacterEncoding()の前に呼び出すとエンコードができず文字化けを起こす?要調査
		//追記：そもそもsetCharacterEncoding()は入力ストリームから読み込む前に呼び出すもの
		List<String> names = Collections.list(request.getParameterNames());
//		System.out.println(names);


		String count = request.getParameter("count");//valueの数値や文字列が入る
		String payment = request.getParameter("payment");//チェックしたタグのvalueの文字列が入る
		String review = request.getParameter("review");
		String mail = request.getParameter("mail");//チェックボックスは

		Page.header(out);
		out.println("<p>" + count + "個の商品をカートに入れました。</p>");
		out.println("<p>お支払方法を" + payment + "に設定しました。</p>");
		out.println("<p>ご感想ありがとうございます。</p>");
		out.println("<p>「" + review + "」<p>");
		if(mail != null) {
			out.println("メールをお送りします。");
			System.out.println(mail);//"on"
		} else {
			out.println("メールはお送りしません。");
			System.out.println(mail);//null
		}
		Page.footer(out);
	}

}
