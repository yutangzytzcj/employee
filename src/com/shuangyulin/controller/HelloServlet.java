package com.shuangyulin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(
			HttpServletRequest request,
			HttpServletResponse response)
	throws ServletException,IOException{
		//告诉浏览器，服务器返回的数据类型
		response.setContentType("text/html");
		//通过response(响应对象)获得一个输出流
		PrintWriter out = 
				response.getWriter();
		//将向浏览器发送的数据利用输出流输出。
		out.println("hello servlet");
		//关闭流。
		out.close();
	}
}





