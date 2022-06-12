package com.test.mybatis;

import java.util.ArrayList;

public interface IGradeDAO
{
	public ArrayList<GradeDTO> list();
	
	public int add(GradeDTO grade);
	
	public int removeGrade(String sid);
	
	public int countGrade();
	
	public GradeDTO searchGrade(String sid);
}
