package org.ajax.commend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ajax.dao.AjaxDao;

public class AjaxIdCheckedCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AjaxIdCheckedCommend");
		
		response.setContentType("text/html);charset=utf-8");
		
		String userId=request.getParameter("userId");
		
		AjaxDao dao=AjaxDao.getInstance();
		
		int rs=dao.idChecked(userId);
		
		System.out.println(rs+ " rs");
		PrintWriter out=response.getWriter();
		
		out.print(rs+"");
		out.close();
		
		
	}

}
