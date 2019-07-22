package tool;

import java.io.PrintWriter;

public class Page {
	public static final String DB_NAME = "java:/comp/env/jdbc/serv";

	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Servlet Sample</title>");
		out.println("</head>");
		out.println("<body>");
	}

	public static void kusokoraHeader(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>クソコラ</title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
		out.println("</head>");
		out.println("<body>");
	}


	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

	public static void parg(PrintWriter out,String msg) {
		out.println("<p>" + msg + "</p>");
	}
}
