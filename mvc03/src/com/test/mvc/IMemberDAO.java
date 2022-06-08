<<<<<<< HEAD
/*======================================
 	IMemerDAO.java
 	- 인터페이스
 =====================================*/

=======
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;
<<<<<<< HEAD
	
public interface IMemberDAO
{
	
	public ArrayList<MemberDTO> lists() throws SQLException; // 전체 리스트 출력 메소드
		
	public int count() throws SQLException;		// 전체 인원수 출력 메소드
	
	public int add(MemberDTO dto) throws SQLException;		// 신규 멤버 추가 메소드 
	
=======

public interface IMemberDAO
{
	// 회원 데이터 추가 메소드 선언
	public int add(MemberDTO member) throws SQLException;
	
	// 회원 리스트 확인 메소드 선언
	public ArrayList<MemberDTO> list() throws SQLException;
	
	// 전체 인원수 확인 메소드 선언
	public int count()  throws SQLException;
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
}
