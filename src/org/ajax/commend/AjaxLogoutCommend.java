package org.ajax.commend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AjaxLogoutCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AjaxLogoutCommend");
		
		response.setContentType("text/html; charset=utf8"); 
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		
		if(session!=null) {
			session.invalidate();
			out.print(1);
		} else {
			out.print(0);
		}
		
		out.close();
		
	}

}
