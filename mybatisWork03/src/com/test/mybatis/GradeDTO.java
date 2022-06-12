package com.test.mybatis;

public class GradeDTO
{
	private String sid, name, sub1, sub2, sub3, tot, avg, ch;
	// 아이디 이름 과목1점수 과목2점수 과목3점수 총점 평균 등급

	public String getSid()
	{
		return sid;
	}

	public void setSid(String sid)
	{
		this.sid = sid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSub1()
	{
		return sub1;
	}

	public void setSub1(String sub1)
	{
		this.sub1 = sub1;
	}

	public String getSub2()
	{
		return sub2;
	}

	public void setSub2(String sub2)
	{
		this.sub2 = sub2;
	}

	public String getSub3()
	{
		return sub3;
	}

	public void setSub3(String sub3)
	{
		this.sub3 = sub3;
	}

	public String getTot()
	{
		return tot;
	}

	public void setTot(String tot)
	{
		this.tot = tot;
	}

	public String getAvg()
	{
		return avg;
	}

	public void setAvg(String avg)
	{
		this.avg = avg;
	}

	public String getCh()
	{
		return ch;
	}

	public void setCh(String ch)
	{
		this.ch = ch;
	}
	
	// ※ 참고 사항
	// 원칙적으로는 각 데이터타입이있고
	// 맞춰서 속성타입 지정하는 것이 바람직.
	// 하지만 오라클에서 number 로 구성되어있는 정수 및 실수를
	// 숫자로 구성할 대 NULL 에 대한 컨트롤이 까다로워질 수도있다.
	// 이와 같으 ㄴ이유로 실무에서는 편의상 String 으로 구성하는 경우
	// 가 많고, 날짜 타입도 이에 해당한다.
	
	
}
