/* =================================
	HelloController.java
	- 사용자 정의 컨트롤러 클래스
================================= */


package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class HelloController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
		String message = "Hello, SpringMVC World~!!!";
		mav.addObject("message", message);
		mav.setViewName("/WEB-INF/view/Hello.jsp");
		return mav;
		
	}
	
}




























