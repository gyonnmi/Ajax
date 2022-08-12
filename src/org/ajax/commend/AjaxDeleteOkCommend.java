package org.ajax.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ajax.dao.AjaxDao;

public class AjaxDeleteOkCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("AjaxDeleteOkCommend");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		HttpSession session=request.getSession();
		
		AjaxDao dao=AjaxDao.getInstance();
		int rs=dao.deleteDo(userId, userPw);
		
		String url="";
		if(rs==1) {
			System.out.println("È¸¿øÅ»Åð ¼º°ø");
			session.invalidate();
			url="/index.ax";
		} else {
			System.out.println("È¸¿øÅ»Åð ½ÇÆÐ");
			url="/index.ax";
		}
		
	}

}
