package tool;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyDebug {
	public static void httpConfirm(HttpServletRequest request, HttpServletResponse response, PrintWriter out) {
		//debug
		out.println(request.getMethod());
		out.println("<br>");
		out.println(request.getRequestURI());
		out.println("<br>");
		Enumeration<String> hNames = request.getHeaderNames();
		while(hNames.hasMoreElements()) {
			String str = (String)hNames.nextElement();
			out.print(str + ":");
			out.println(request.getHeader(str));
			out.println("<br>");
		}
		out.println("<br>");
		Enumeration<String> pNames = request.getParameterNames();
		while(pNames.hasMoreElements()) {
			String str2 = (String)pNames.nextElement();
			out.print(str2 + ":");
			out.println(request.getParameter(str2));
			out.println("<br>");
		}
	}
}
