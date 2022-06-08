/*================================
	HelloController.java
	- 사용자 정의 컨트롤러 클래스
==================================*/

package com.test.mvc;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberRecordController
{
	/*
	// ※ 액션 처리를 위한 메소드는 사용자 지정.
	@RequestMapping("URL매핑주소")
	public String 메소드이름(매개변수)
	{
		// ※ 업무 로직 처리(비즈니스로직 처리 → 모델 활용)
		// ...
		
		return "뷰 이름.jsp";
		
	}
	*/
	
	public String memberList(Model model)
	{
		String result = "";
		
		ArrayList<MemberDTO> list  = new ArrayList<MemberDTO>();
		MemberDAO dao = new MemberDAO();
		
		try
		{
			dao.connection();
			list = dao.lists();
			
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				dao.cloas();
			} catch (Exception e2)
			{
				System.out.println(e2.toString());
			}
		}
		
		model.addAttribute("list", list);
		result = "/WEB-INF/view/MemberList.jsp";
		
		return result;
	}
	
	public String memberInsertForm()
	{
		String reuslt = "";
		return result;
	}
	
	public String memberInsert(MemberDTO dto)
	{
		String result = "";
		return result;
	}
	
	
	
	
	
	
	

}
