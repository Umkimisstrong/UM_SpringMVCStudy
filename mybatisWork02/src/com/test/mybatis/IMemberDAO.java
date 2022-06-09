/*
	IMemberDAO.java
	- 인터페이스
	- 
*/

package com.test.mybatis;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IMemberDAO
{
	public int add(MemberDTO m);
	
	public ArrayList<MemberDTO> list();
	
	public int count();
	
	public int remove(String mid);
}
