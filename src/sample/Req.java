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
 * Servlet implementation class Req
 */
@WebServlet("/Req")
public class Req extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);

		Page.parg(out,"request URL");
		Page.parg(out, request.getRequestURL().toString());

		Page.parg(out,"Host");
		Page.parg(out,request.getHeader("Host"));

		Page.parg(out,"User-Agent");
		Page.parg(out,request.getHeader("User-Agent"));

		Page.parg(out,"Remote Adress");
		Page.parg(out,request.getRemoteAddr());

		Page.footer(out);
	}
}
