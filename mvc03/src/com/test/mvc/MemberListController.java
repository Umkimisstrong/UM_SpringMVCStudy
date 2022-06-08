<<<<<<< HEAD
/*================================
	MemberListController.java
	- 사용자 정의 컨트롤러 클래스
	- 리스트 출력 액션
	- DAO 객체에 대한 의존성 주입
	- 준비 → setter 메소드 추가
==================================*/
=======
/* =================================
	MemberListController.java
	- 사용자 정의 컨트롤러 클래스
	- 리스트 출 력 액션
	- DAO 객체에 대한 의존성 주입
	  준비 → setter 메소드 추가
================================= */

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c

package com.test.mvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

<<<<<<< HEAD
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring 의 『Controller』인터페이스를 구현하는 방법을 통해
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class MemberListController implements Controller
{

	// 인터페이스 자료형을 취하는 속성 구성
	private IMemberDAO dao;
	
	// setter 구성
=======
//import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.web.servlet.ModelAndView;

// import > web.servlet.mvc.Controller : web jar 파일에 들어있음
import org.springframework.web.servlet.mvc.Controller;

// ※ Spring의 『Controller』 인터페이스를 구현하는 방법을 통해
//    사용자 정의 컨트롤러 클래스를 구성한다.
public class MemberListController implements Controller
{
	// 인터페이스 자료형을 취하는 속성 구성
	private IMemberDAO dao;
	
	// setter 메소드 구성

>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	public void setDao(IMemberDAO dao)
	{
		this.dao = dao;
	}
	
<<<<<<< HEAD
=======
	// 경로 얻기 용 Ctrl+Space bar
	//SimpleDriverDataSource
	
	
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 액션 코드
		ModelAndView mav = new ModelAndView();
		
<<<<<<< HEAD
=======
		request.setCharacterEncoding("UTF-8");
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
		int count = 0;
		ArrayList<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		try
		{
			count = dao.count();
<<<<<<< HEAD
			memberList = dao.lists();
=======
			memberList = dao.list();
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		mav.setViewName("/WEB-INF/view/MemberList.jsp");
		mav.addObject("count", count);
		mav.addObject("memberList", memberList);
<<<<<<< HEAD
		return mav;
	}



}
=======
		
		
		return mav;
		
	}
	
}




























>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
