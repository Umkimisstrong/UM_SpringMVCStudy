<<<<<<< HEAD
/*==============================================
	ReceiveController.java
	- 사용자 정의 컨트롤러
================================================*/
=======
/*
	ReceiveController.java
	- 사용자 정의 컨트롤러
*/

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ReceiveController implements Controller
{
<<<<<<< HEAD

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mov = new ModelAndView();
		
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		
		mov.addObject("userName", userName);
		
		mov.setViewName("/WEB-INF/view/Receive.jsp");
		
		return mov;
	}
=======
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ModelAndView mav = new ModelAndView();
		request.setCharacterEncoding("UTF-8");
		
		String userName = request.getParameter("userName");
		
		mav.addObject("userName", userName);
		mav.setViewName("/WEB-INF/view/Receive.jsp");
		
		
		return mav;
	}

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	
}
