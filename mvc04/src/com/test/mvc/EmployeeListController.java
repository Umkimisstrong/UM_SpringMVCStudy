/* ==================================================
	#17 EmployeeListController.java
	- 사용자 정의 컨트롤러 클래스
	- 리스트 페이지 요청에 대한 액션 처리
	- DAO 객체에 대한 의존성 주입(DI)을 위한 준비
	  → 인터페이스 형태의 자료형을 속성으로 구성
	  → setter 메소드 준비
=============================================== */


package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;

public class EmployeeListController implements Controller
{
	// 주요 속성 구성
	// → 인터페이스 형태의 자료형을 구성
	private IEmlpoyeeDAO dao;
	
	// setter 구성
	public void setDao(IEmlpoyeeDAO dao)
	{
		this.dao = dao;
	}
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
		// 로그인 되지 않고 요청되었다면 - > 로그인페이지로 이동
		HttpSession session = request.getSession();
		
		// ------------------------------------------------------------- 세션 처리과정 추가
		
		if (session.getAttribute("name")==null)	//-- 로그인 되어 있지 않은 상황
		{
			mav.setViewName("redirect:loginform.action");
			return mav;
		}
		else if (session.getAttribute("admin")==null) // -- 로그인은 되었지만 관리자가 아닌 상황
		{
			mav.setViewName("redirect:logout.action");
			return mav;
			// -- 로그인은 되어 있지만 이 때 클라이언트는
			//    일반 직원으로 로그인 되어 있는 상황이므로
			//    기존의 로그인 내용을 없애고, 
			//    로그아웃 액션 처리하여
			//    다시 관리자로 로그인하게 유도
		}
		
		// ------------------------------------------------------------- 세션 처리과정 추가
		
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		try
		{
			employeeList = dao.list();
			mav.addObject("employeeList", employeeList);
			mav.setViewName("/WEB-INF/view/EmployeeList.jsp");

		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
				
		
		return mav;
		
	}
	
}




























