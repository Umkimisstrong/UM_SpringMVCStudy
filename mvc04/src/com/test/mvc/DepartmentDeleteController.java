/* =================================
	DepartmentDeleteController.java
	- 사용자 정의 컨트롤러 클래스
	- 직원 삭제 액션 수행
	- dao. setter 생성
================================= */


package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class DepartmentDeleteController implements Controller
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
		
		HttpSession session = request.getSession();
		
		if ( session.getAttribute("name") == null  )
		{
			mav.setViewName("redirect:loginform.action");
			return mav;
		}
		else if( session.getAttribute("admin") == null )
		{
			mav.setViewName("redirect:logout.action");
			return mav;
		}
		
		String departmentId = request.getParameter("departmentId");
		
		int delCheck = 0;
		
		try
		{
			delCheck = dao.searchDelCheck(departmentId);
			
			if (delCheck != 0) // delCheck이 0이 아닌경우.. (삭제불가능)
			{
				mav.setViewName("redirect:departmentlist.action");
				return mav;
			}
			
			// 삭제
			dao.remove(departmentId);
			mav.setViewName("redirect:departmentlist.action");
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		return mav;
	}
	
}




























