<<<<<<< HEAD
/*================================
	MemberInsertController.java
	- 사용자 정의 컨트롤러 클래스
	- 리스트 출력 액션
	- DAO 객체에 대한 의존성 주입
	- 준비 → setter 메소드 추가
==================================*/
=======
/* =================================
	MemberInsertController.java
	- 사용자 정의 컨트롤러 클래스
================================= */

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c

package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 『implements Controller』  혹은 『extends AbstractController』 
//-- 서블릿에서 HttpServlet  을 상속받은 서블릿 객체 역할 

// ※ Spring 의 『Controller』인터페이스를 구현하는 방법을 통해
=======

import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;



// ※ 『implements Controller』 혹은 『extends AbstractController』
//  -- 서블릿에서 HttpServlet 을 상속받은 서블릿 객체 역할




// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class MemberInsertController implements Controller
{

	// 인터페이스 자료형을 취하는 속성 구성
	private IMemberDAO dao;
<<<<<<< HEAD
	
	// setter 구성
=======
		
	// setter 메소드 구성
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	public void setDao(IMemberDAO dao)
	{
		this.dao = dao;
	}
<<<<<<< HEAD
	
=======
		
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
<<<<<<< HEAD
		// 캐릭터 인코딩 설정
		request.setCharacterEncoding("UTF-8");

		// 이전 페이지로부터 넘어온 데이터 수신
		String name = request.getParameter("name");
		String tel = request.getParameter("telephone");
		
=======
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
		try
		{
			MemberDTO member = new MemberDTO();
			member.setName(name);
<<<<<<< HEAD
			member.setTelephone(tel);
			
			dao.add(member);
			
=======
			member.setTel(tel);
			int result = dao.add(member);
			
			if (result != 1)
			{
				System.out.println("The insert function was not performed");
				return null;
			}
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		// sendRedirect() → memberlist.do
<<<<<<< HEAD
		//mav.setViewName("/WEB-INF/view/MebmerList.jsp"); 이거 아님
		
		mav.setViewName("redirect:memberlist.do"); // 스프링 리다이렉트.
		
		return mav;
	}



}
=======
		// mav.setViewName("/WEB-INF/view/MemberList.jsp"); ▶ X
		
		mav.setViewName("redirect:memberlist.do");
		
		return mav;
		
	}
	
}




























>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
