package advance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;

import tool.Page;
import tool.MyDebug;

/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup(Page.DB_NAME);
			Connection con = ds.getConnection();

			String name = request.getParameter("name");
			Integer price = Integer.parseInt(request.getParameter("price"));

			PreparedStatement st = con.prepareStatement("insert into product values(null, ?, ?)");
			st.setString(1, name);
			st.setInt(2, price);
			int line = st.executeUpdate();

			if(line > 0) {
				out.println("追加に成功しました。");
			}
			//debug
			out.println("<br>");
			MyDebug.httpConfirm(request,response,out);

			st.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
