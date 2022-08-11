package org.ajax.commend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ajax.dao.AjaxDao;

public class AjaxJoinOkCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AjaxJoinOkCommend");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userPhone=request.getParameter("userPhone");
		
		AjaxDao dao=AjaxDao.getInstance();
		
		int rs=dao.insertDo(userId, userPw, userPhone);
		System.out.println(rs);
		
		PrintWriter out=response.getWriter();
		
		out.print(rs+"");
		out.close();
		
	}

}
