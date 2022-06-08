/*
	#3 Region.java
	- 지역 데이터 자료형 클래스
*/

/*
---------- -------- ------------ 
REGIONID   NOT NULL NUMBER       
REGIONNAME          VARCHAR2(30)
*/
package com.test.mvc;

public class Region
{
	// 주요 속성 구성
	private String regionId, regionName;
	private int delCheck;	// 삭제 가능여부 확인(1이상 : 불가능, 0 : 가능)
	
	
	
	public String getRegionId()
	{
		return regionId;
	}
	public void setRegionId(String regionId)
	{
		this.regionId = regionId;
	}
	public String getRegionName()
	{
		return regionName;
	}
	public void setRegionName(String regionName)
	{
		this.regionName = regionName;
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
