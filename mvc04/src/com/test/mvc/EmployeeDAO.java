/*
	#9 EmployeeDAO.java
	- 데이터베이스 액션 처리 클래스
	- 직원 데이터 입력 / 출력 / 수정 / 삭제 액션
	- Connection 객체에 대한 의존성 주입을 위한 준비.
	   → 인터페이스 형태의 속성 구성(DataSource).
	   → setter 메소드 정의.
*/



package com.test.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

public class EmployeeDAO implements IEmlpoyeeDAO
{
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	
	@Override
	public ArrayList<Employee> list() throws SQLException
	{
		ArrayList<Employee> result = new ArrayList<Employee>();
		
		Connection conn = dataSource.getConnection();
		// 전체 직원 출력
		String sql = "SELECT EMPLOYEEID, NAME, SSN, BIRTHDAY, LUNAR, LUNARNAME"
				   + ", TELEPHONE, DEPARTMENTID, DEPARTMENTNAME, POSITIONID, POSITIONNAME"
				   + ", REGIONID, REGIONNAME, BASICPAY, EXTRAPAY, PAY, GRADE"
				   + " FROM EMPLOYEEVIEW"
				   + " ORDER BY EMPLOYEEID";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next())
		{
			Employee employee = new Employee();
			
			employee.setEmployeeId(rs.getString("EMPLOYEEID"));
			employee.setName(rs.getString("NAME"));
			employee.setSsn(rs.getString("SSN"));
			employee.setBirthday(rs.getString("BIRTHDAY"));
			employee.setLunar(rs.getInt("LUNAR"));
			employee.setLunarName(rs.getString("LUNARNAME"));
			employee.setTelephone(rs.getString("TELEPHONE"));
			employee.setDepartmentId(rs.getString("DEPARTMENTID"));
			employee.setDepartmentName(rs.getString("DEPARTMENTNAME"));
			employee.setPositionId(rs.getString("POSITIONID"));
			employee.setPositionName(rs.getString("POSITIONNAME"));
			employee.setRegionId(rs.getString("REGIONID"));
			employee.setRegionName(rs.getString("REGIONNAME"));
			employee.setBasicPay(rs.getInt("BASICPAY"));
			employee.setExtraPay(rs.getInt("EXTRAPAY"));
			employee.setPay(rs.getInt("PAY"));
			employee.setGrade(rs.getInt("GRADE"));
			
			result.add(employee);
			
		}
		rs.close();
		stmt.close();
		
		conn.close();
		
		return result;
	}

	@Override
	public ArrayList<Region> regionList() throws SQLException
	{
		ArrayList<Region> result = new ArrayList<Region>();
		// 전체 지역 출력
		Connection conn = dataSource.getConnection();
		
		String sql = "SELECT REGIONID, REGIONNAME, DELCHECK FROM REGIONVIEW";
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while (rs.next())
		{
			Region region = new Region();
			
			region.setRegionId(rs.getString("REGIONID"));
			region.setRegionName(rs.getString("REGIONNAME"));
			region.setDelCheck(rs.getInt("DELCHECK"));
			
			result.add(region);
		}
		
		rs.close();
		stmt.close();
		conn.close();

		return result;
	}

	@Override
	public ArrayList<Department> departmentList() throws SQLException
	{
		ArrayList<Department> result = new ArrayList<Department>();
		// 전체 부서 출력
		Connection conn = dataSource.getConnection();
		String sql = "SELECT DEPARTMENTID, DEPARTMENTNAME, DELCHECK FROM DEPARTMENTVIEW";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			Department department = new Department();
			
			department.setDepartmentId(rs.getString("DEPARTMENTID"));
			department.setDepartmentName(rs.getString("DEPARTMENTNAME"));
			department.setDelCheck(rs.getInt("DELCHECK"));
			
			result.add(department);
		}
		rs.close();
		stmt.close();
		conn.close();
		return result;
	}

	@Override
	public ArrayList<Position> positionList() throws SQLException
	{
		ArrayList<Position> result = new ArrayList<Position>();
		// 전체 직위 출력
		Connection conn = dataSource.getConnection();
		
		String sql = "SELECT POSITIONID, POSITIONNAME, MINBASICPAY, DELCHECK"
			       + " FROM POSITIONVIEW";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			Position position = new Position();
			
			position.setPositionId(rs.getString("POSITIONID"));
			position.setPositionName(rs.getString("POSITIONNAME"));
			position.setMinBasicPay(rs.getInt("MINBASICPAY"));
			position.setDelCheck(rs.getInt("DELCHECK"));
			
			result.add(position);
		}
		rs.close();
		stmt.close();
		conn.close();
		return result;
	}

	@Override
	public int getMinBasicPay(String positionId) throws SQLException
	{
		// 해당 직위에 맞는 최소급여 출력
		int result = 0;
		Connection conn = dataSource.getConnection();
		String sql = "SELECT MINBASICPAY FROM POSITION WHERE POSITIONID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, positionId);
		
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next())
		{
			result = rs.getInt("MINBASICPAY");
		}
		rs.close();
		pstmt.close();
		conn.close();
		return result;
	}

	@Override
	public int employeeAdd(Employee employee) throws SQLException
	{
		int result = 0;
		// 직원 추가
		Connection conn = dataSource.getConnection();
		String sql = "INSERT INTO EMPLOYEE( EMPLOYEEID, NAME, SSN1, SSN2, BIRTHDAY"
				   + ", LUNAR, TELEPHONE, DEPARTMENTID, POSITIONID, REGIONID"
				   + ", BASICPAY, EXTRAPAY)"
				   + " VALUES( EMPLOYEESEQ.NEXTVAL, ?, ?, CRYPTPACK.ENCRYPT(?, ?), TO_DATE(?, 'YYYY-MM-DD')"
				   + ", ?, ?, ?, ?, ?"
				   + ", ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, employee.getName());
		pstmt.setString(2, employee.getSsn1());
		pstmt.setString(3, employee.getSsn2());
		pstmt.setString(4, employee.getSsn2());
		pstmt.setString(5, employee.getBirthday());
		pstmt.setInt(6, employee.getLunar());
		pstmt.setString(7, employee.getTelephone());
		//pstmt.setString(8, employee.getDepartmentId());				// 형변환 해주고 set
		pstmt.setInt(8, Integer.parseInt(employee.getDepartmentId()));
		//pstmt.setString(9, employee.getPositionId());					// 형변환 해주고 set
		pstmt.setInt(9, Integer.parseInt(employee.getPositionId()));
		//pstmt.setString(10, employee.getRegionId());					// 형변환 해주고 set
		pstmt.setInt(10, Integer.parseInt(employee.getRegionId()));
		pstmt.setInt(11, employee.getBasicPay());
		pstmt.setInt(12, employee.getExtraPay());
		
		result = pstmt.executeUpdate();
		
		if (result != 1)
		{
			System.out.println("데이터 추가되지 않음");
		}
		pstmt.close();
		conn.close();
		return result;
	}

	@Override
	public int remove(String employeeId) throws SQLException
	{
		int result = 0;
		// 직원 삭제
		Connection conn = dataSource.getConnection();
		String sql = "DELETE FROM EMPLOYEE WHERE EMPLOYEEID=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(employeeId));
		
		result = pstmt.executeUpdate();
		
		if (result != 1)
		{
			System.out.println("데이터 삭제되지 않음");
		}
		pstmt.close();
		conn.close();
		return result;
	}

	@Override
	public int modify(Employee employee) throws SQLException
	{
		int result = 0;
		// 직원 수정
		Connection conn = dataSource.getConnection();
		
		String sql = "UPDATE EMPLOYEE SET NAME=?, BIRTHDAY=TO_DATE(?, 'YYYY-MM-DD')"
				   + ", LUNAR=?, TELEPHONE=?, DEPARTMENTID=?, POSITIONID=?, REGIONID=?"
				   + ", BASICPAY=?, EXTRAPAY=?"
				   + ", SSN1=?, SSN2=CRYPTPACK.ENCRYPT(?, ?)"
				   + " WHERE EMPLOYEEID=?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, employee.getName());
		pstmt.setString(2, employee.getBirthday());
		pstmt.setInt(3, employee.getLunar());
		pstmt.setString(4, employee.getTelephone());
		//pstmt.setString(5, employee.getDepartmentId());
		pstmt.setInt(5, Integer.parseInt(employee.getDepartmentId()));
		//pstmt.setString(6, employee.getPositionId());
		pstmt.setInt(6, Integer.parseInt(employee.getPositionId()));
		//pstmt.setString(7, employee.getRegionId());
		pstmt.setInt(7, Integer.parseInt(employee.getRegionId()));
		pstmt.setInt(8, employee.getBasicPay());
		pstmt.setInt(9, employee.getExtraPay());
		pstmt.setString(10, employee.getSsn1());
		pstmt.setString(11, employee.getSsn2());
		pstmt.setString(12, employee.getSsn2());
		pstmt.setString(13, employee.getEmployeeId());
		
		result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return result;
	}

	@Override
	public Employee seachId(String employeeId) throws SQLException
	{
		Employee result = new Employee();
	      
	    Connection conn = dataSource.getConnection();
	      
	    String sql ="SELECT EMPLOYEEID, NAME, SSN1, TO_CHAR(BIRTHDAY, 'YYYY-MM-DD') AS BIRTHDAY, LUNAR, TELEPHONE, DEPARTMENTID"
	              + ", POSITIONID, REGIONID, BASICPAY, EXTRAPAY"
	              + " FROM EMPLOYEE WHERE EMPLOYEEID=?";
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1, employeeId);
	    ResultSet rs = pstmt.executeQuery();
	    while (rs.next())
	    {
	        result.setEmployeeId(rs.getString("EMPLOYEEID"));
	        result.setName(rs.getString("NAME"));
	        result.setSsn1(rs.getString("SSN1"));
	        result.setBirthday(rs.getString("BIRTHDAY"));
	        result.setLunar(rs.getInt("LUNAR"));
	        result.setTelephone(rs.getString("TELEPHONE"));
	        result.setDepartmentId(rs.getString("DEPARTMENTID"));
	        result.setPositionId(rs.getString("POSITIONID"));
	        result.setRegionId(rs.getString("REGIONID"));
	        result.setBasicPay(rs.getInt("BASICPAY"));
	        result.setExtraPay(rs.getInt("EXTRAPAY"));
	     }
	     rs.close();
	     pstmt.close();
	     conn.close();
	     return result;
	}

	@Override
	public String login(String id, String pw) throws SQLException
	{
		// 로그인
		String result = null;
		Connection conn = dataSource.getConnection();
		String sql = "SELECT NAME FROM EMPLOYEE WHERE"
				   + " EMPLOYEEID=? AND SSN2 = CRYPTPACK.ENCRYPT(?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(id));
		pstmt.setString(2, pw);
		pstmt.setString(3, pw);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next())
		{
			result = rs.getString("NAME");
		}
		rs.close();
		pstmt.close();
		conn.close();
		return result;
	}

	@Override
	public String loginAdmin(String id, String pw) throws SQLException
	{
		// 관리자로그인
		String result = null;
		Connection conn = dataSource.getConnection();
		String sql = "SELECT NAME FROM EMPLOYEE WHERE"
				+ " EMPLOYEEID=? AND"
				+ " SSN2 = CRYPTPACK.ENCRYPT(?, ?)"
				+ " AND GRADE = 0";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(id));
		pstmt.setString(2, pw);
		pstmt.setString(3, pw);
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next())
		{
			result = rs.getString("NAME");
		}
		rs.close();
		pstmt.close();
		conn.close();
		return result;
	}
	
	
}
