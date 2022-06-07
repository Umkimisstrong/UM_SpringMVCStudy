/*
	#5 IEmployeeDAO.java
	- 직원 인터페이스
*/

package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IEmlpoyeeDAO
{
	// 주요 메소드 선언
	public ArrayList<Employee> list() throws SQLException;
	
	public ArrayList<Region> regionList() throws SQLException;
	public ArrayList<Department> departmentList() throws SQLException;
	public ArrayList<Position> positionList() throws SQLException;
	
	public int getMinBasicPay(String positionId) throws SQLException;
	public int employeeAdd(Employee employee)  throws SQLException;
	public int remove(String employeeId)  throws SQLException;
	public int modify(Employee employee) throws SQLException;
	public Employee seachId(String employeeId)  throws SQLException;
	
	public String login(String id, String pw)  throws SQLException;
	public String loginAdmin(String id, String pw)  throws SQLException;
	
	
}
