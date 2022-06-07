/*
	#8 IPositionDAO.java
	- 직위 인터페이스
*/

package com.test.mvc;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IPositionDAO
{
	// 주요 메소드 선언
	public ArrayList<Position> list() throws SQLException;
	
	public int add(Position position) throws SQLException;
	public int remove(String positionId) throws SQLException;
	public int modify(Position position) throws SQLException;
	
}
