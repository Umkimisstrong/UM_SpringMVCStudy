/*
	#6 IDepartmentDAO.java
	- 부서 인터페이스
*/

package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IDepartmentDAO
{
	// 주요 메소드 선언
	public ArrayList<Department> list() throws SQLException;	// 출력용
	
	public int add(Department department) throws SQLException;	// 부서추가
	public int remove(String departmentId) throws SQLException; // 부서삭제
	public int modify(Department department) throws SQLException; // 부서수정
	public int searchDelCheck(String departmentId) throws SQLException;
	
	
}
