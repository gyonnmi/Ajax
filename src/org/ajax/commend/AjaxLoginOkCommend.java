package org.ajax.commend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ajax.dao.AjaxDao;

public class AjaxLoginOkCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AjaxLoginOkCommend");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		AjaxDao dao=AjaxDao.getInstance();
		
		
		int rs=dao.loginDo(userId, userPw);
		System.out.println(rs);
		HttpSession session=request.getSession();
		if(rs==1) {
			if(userId.equals("admin")) {
				session.setAttribute("sessionId", "ADMIN");
				session.setAttribute("roll", "ADMIN_ROLL");
				session.setMaxInactiveInterval(60*10);				
			} else {
				session.setAttribute("sessionId", userId);
				session.setAttribute("roll", "USER_ROLL");
				session.setMaxInactiveInterval(60*20);	
			}
		}
		
		PrintWriter out=response.getWriter();
		
		response.setContentType("text/html; charset=utf8"); 
		
		out.print(rs+"");
		out.close();
		
	}

}
