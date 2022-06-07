/* =================================
	MemberInsertController.java
	- 사용자 정의 컨트롤러 클래스
================================= */


package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;



// ※ 『implements Controller』 혹은 『extends AbstractController』
//  -- 서블릿에서 HttpServlet 을 상속받은 서블릿 객체 역할




// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class MemberInsertController implements Controller
{

	// 인터페이스 자료형을 취하는 속성 구성
	private IMemberDAO dao;
		
	// setter 메소드 구성
	public void setDao(IMemberDAO dao)
	{
		this.dao = dao;
	}
		
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		try
		{
			MemberDTO member = new MemberDTO();
			member.setName(name);
			member.setTel(tel);
			int result = dao.add(member);
			
			if (result != 1)
			{
				System.out.println("The insert function was not performed");
				return null;
			}
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		// sendRedirect() → memberlist.do
		// mav.setViewName("/WEB-INF/view/MemberList.jsp"); ▶ X
		
		mav.setViewName("redirect:memberlist.do");
		
		return mav;
		
	}
	
}




























