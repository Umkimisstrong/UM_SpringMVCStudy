/*
	#22 AjaxController.java
	- 
*/

package com.test.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AjaxController implements Controller
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
		
		// 데이터 수신(→ EmployeeInsertForm.jsp 에서 positionId 수신)
		request.setCharacterEncoding("UTF-8");
		String positionId = request.getParameter("positionId");
		
		int result = 0;
		
		try
		{
			result = dao.getMinBasicPay(positionId);
			mav.addObject("result", result);
			mav.setViewName("/WEB-INF/view/Ajax.jsp");
			
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
		return mav;
		
	}
	
}