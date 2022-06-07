/*
 	EmpListController.java
 	- 사용자 정의 컨트롤러 클래스
 	- 리스트 페이지 요청에 따른 액션 처리
 	  (일반 사원 전용)
 	- DAO 객체에 대한 의존성 주입(DI) 을 위한 준비
 	   → 인터페이스 형태의 자료형을 속성으로 구성
 	   → setter 메소드 준비	  
*/
package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmpListController implements Controller
{
	private IEmlpoyeeDAO dao;
	
	public void setDao(IEmlpoyeeDAO dao)
	{
		this.dao = dao;
	}


	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
		// ------------------------------------------------------------- 세션 처리과정 추가
		
		// 로그인 처리과정
		HttpSession session = request.getSession();
		

		
				if (session.getAttribute("name")==null)	//-- 로그인 되어 있지 않은 상황
				{
					mav.setViewName("redirect:loginform.action");
					return mav;
				}
				
	    // ------------------------------------------------------------- 세션 처리과정 추가
		
		
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		try
		{
			employeeList = dao.list();
			mav.addObject("employeeList", employeeList);
			mav.setViewName("/WEB-INF/view/EmpList.jsp");
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		return mav;
		
	}
	
}