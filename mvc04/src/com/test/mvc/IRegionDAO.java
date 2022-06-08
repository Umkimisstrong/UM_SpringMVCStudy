/*
	#7 IRegionDAO.java
	- 지역 인터페이스 
*/

package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IRegionDAO
{
	// 주요 메소드 선언
	public ArrayList<Region> list() throws SQLException;
	
	public int add(Region region) throws SQLException;
	public int remove(String regionId) throws SQLException;
	public int modify(Region region) throws SQLException;
}
