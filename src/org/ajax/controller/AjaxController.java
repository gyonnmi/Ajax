package org.ajax.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ajax.commend.AjaxIdCheckedCommend;
import org.ajax.commend.AjaxJoinOkCommend;
import org.ajax.commend.AjaxLoginOkCommend;
import org.ajax.commend.AjaxLogoutCommend;
import org.ajax.commend.ExcuteCommend;

@WebServlet("*.ax")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		String basicURL=uri.substring(path.length());
		
		ExcuteCommend commend=null;
		
		System.out.println(path);
		System.out.println(uri);
		System.out.println(basicURL);
		
		String url="";
		if(basicURL.equals("/index.ax")) {
			url="/index.jsp";
		} else if(basicURL.equals("/joinView.ax")) {
			url="/joinView.jsp";
		} else if(basicURL.equals("/loginView.ax")) {
			url="/loginView.jsp";
		} else if(basicURL.equals("/deleteView.ax")) {
			url="/deleteView.jsp";
		} else if(basicURL.equals("/ajaxIdChecked.ax")) {
			commend=new AjaxIdCheckedCommend();
			commend.excuteQueryCommend(request, response);
			return;
		} else if(basicURL.equals("/joinOk.ax")) {
			commend=new AjaxJoinOkCommend();
			commend.excuteQueryCommend(request, response);
			return;
		} else if(basicURL.equals("/loginOk.ax")) {
			commend=new AjaxLoginOkCommend();
			commend.excuteQueryCommend(request, response);
			return;
		} else if(basicURL.equals("/logout.ax")) {
			commend=new AjaxLogoutCommend();
			commend.excuteQueryCommend(request, response);
			return;
		}
		
		RequestDispatcher disp=request.getRequestDispatcher(url);
		disp.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
