/*
	#2 Department.java
	- 부서 데이터 자료형 클래스 
*/

/*
-------------- -------- ------------ 
DEPARTMENTID   NOT NULL NUMBER       
DEPARTMENTNAME          VARCHAR2(30) 

*/
package com.test.mvc;

public class Department
{
	// 주요 속성 구성
	private String departmentId, departmentName;
	private int delCheck;	// 삭제가능여부확인(1이상 : 불가능, 0 : 가능)
	
	// getter / setter 구성
	public String getDepartmentId()
	{
		return departmentId;
	}
	public void setDepartmentId(String departmentId)
	{
		this.departmentId = departmentId;
	}
	public String getDepartmentName()
	{
		return departmentName;
	}
	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}
	public int getDelCheck()
	{
		return delCheck;
	}
	public void setDelCheck(int delCheck)
	{
		this.delCheck = delCheck;
	}
	
	
	
	
}
