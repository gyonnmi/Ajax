package org.ajax.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ExcuteCommend {
	void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException;
}
