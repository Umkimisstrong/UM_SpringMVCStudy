/*
	LogoutController.java
	- 사용자 정의 컨트롤러 클래스
	- 로그아웃 액션 처리 → 다시 로그인 폼을 요청할 수 있도록 안내
*/
package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LogoutController implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();

		// 세션에 구성된 속성값들 제거
		HttpSession session = request.getSession();
		
		// 이름 / 관리자 값 제거
		session.removeAttribute("name");
		session.removeAttribute("admin");
	
		// 로그아웃 뷰 페이지(→ 안전하게 로그아웃 되었습니다. 로그인 페이지로 돌아가기) 없이
		// 바로 로그인 페이지를 다시요청할 수 있도록 처리
		mav.setViewName("redirect:loginform.action");
		
		
		
		return mav;
		
	}
	
}