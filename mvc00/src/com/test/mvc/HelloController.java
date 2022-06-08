<<<<<<< HEAD
/*================================
	HelloController.java
	- 사용자 정의 컨트롤러 클래스
==================================*/
=======
/* =================================
	HelloController.java
	- 사용자 정의 컨트롤러 클래스
================================= */

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c

package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring 의 『Controller』인터페이스를 구현하는 방법을 통해
=======

import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class HelloController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
<<<<<<< HEAD
		
		ModelAndView mav = new ModelAndView();
		
		
		
		
		return mav;
	}

}
=======
		ModelAndView mav = new ModelAndView();
		
		return mav;
		
	}
	
}




























>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
