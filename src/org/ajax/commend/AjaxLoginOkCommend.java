package org.ajax.commend;

import java.io.IOException;

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
		
		HttpSession session=request.getSession();
		
		int rs=dao.loginDo(userId, userPw);
		System.out.println(rs);
	}

}
