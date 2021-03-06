/*
	DeptListController.java
	- 직원 전용 컨트롤러 클래스
	- 부서 내용 출력 액션처리
	- dao 구성
	- setter 주입 
*/
package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class DeptListController implements Controller
{
	
	private IDepartmentDAO dao;
	
	public void setDao(IDepartmentDAO dao)
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
		
		ArrayList<Department> departmentList = new ArrayList<Department>();
		
		try
		{
			departmentList = dao.list();
			mav.addObject("departmentList", departmentList);
			mav.setViewName("/WEB-INF/view/DeptList.jsp");
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		
		return mav;
		
	}
	
}