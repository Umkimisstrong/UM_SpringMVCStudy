<<<<<<< HEAD
=======
/*
	MemberDAO.java
	- 데이터베이스 액션 처리 클래스
	- IMemberDAO 인터페이스를 구현하는 클래스
	- Connection 객체에 대한 의존성 주입
	  준비 → setter 메소드 추가
	- DataSource 인터페이스를 속성으로 구성
*/
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
package com.test.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
<<<<<<< HEAD
=======
import java.sql.Statement;
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
import java.util.ArrayList;

import javax.sql.DataSource;

<<<<<<< HEAD

public class MemberDAO implements IMemberDAO
{
	
	// 커낵션 객체에 대한 의존성 주입을 위한 준비
	// ① 인터페이스 형태의 데이터 타입을 취하는 속성 구성
=======
public class MemberDAO implements IMemberDAO
{
	// ※ Connection 객체에 대한 의존성 주입을 위한 준비
	// ① 인터페이스 형태의 데이터타입을 취하는 속성 구성 ▽▽
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	private DataSource dataSource;
	
	// ② setter 구성
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
<<<<<<< HEAD
	// ※ IMemberDAO 인터페이스의 메소드 오버라이딩.
	
	@Override
	public ArrayList<MemberDTO> lists() throws SQLException
	{
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		
		// db 연결
		Connection conn = dataSource.getConnection();
		
		// 쿼리문 준비 
		String sql = "SELECT MID, NAME, TELEPHONE FROM TBL_MEMBERLIST ORDER BY MID";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
=======
	
	// ※ IMemberDAO 인터페이스의 메소드 오버라이딩 ▽▽
	
	// 데이터 추가된 행 반환
	@Override
	public int add(MemberDTO member) throws SQLException
	{
		int result = 0;
		Connection conn = dataSource.getConnection();
		String sql = "INSERT INTO TBL_MEMBERLIST(MID, NAME, TEL) VALUES(MEMBERLISTSEQ.NEXTVAL, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, member.getName());
		pstmt.setString(2, member.getTel());
		
		result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
				
		return result;
	}
	
	// MembetDTO 들 반환
	@Override
	public ArrayList<MemberDTO> list() throws SQLException
	{
		ArrayList<MemberDTO> result = new ArrayList<MemberDTO>();
		Connection conn = dataSource.getConnection();
		String sql = "SELECT MID, NAME, TEL FROM TBL_MEMBERLIST ORDER BY MID";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
		
		while (rs.next())
		{
			MemberDTO dto = new MemberDTO();
<<<<<<< HEAD
			
			dto.setMid(rs.getInt("MID"));
			dto.setName(rs.getString("NAME"));
			dto.setTelephone(rs.getString("TELEPHONE"));
			
			result.add(dto);
		}
		rs.close();
		pstmt.close();
		
=======
			dto.setMid(rs.getInt("MID"));
			dto.setName(rs.getString("NAME"));
			dto.setTel(rs.getString("TEL"));
			
			result.add(dto);
		}
		
		rs.close();
		stmt.close();
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
		conn.close();
		
		return result;
	}

<<<<<<< HEAD
=======
	// 전체 인원 수 반환
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
	@Override
	public int count() throws SQLException
	{
		int result = 0;
<<<<<<< HEAD
		
		// db 연결
		Connection conn = dataSource.getConnection();
		
		// 쿼리문 준비
		String sql = "SELECT COUNT(*) AS COUNT FROM TBL_MEMBERLIST";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next())
		{
			result = rs.getInt("COUNT");
		}
		// 리소스 반납
		rs.close();
		pstmt.close();
		
		// 커낵션 종료
		conn.close();
		
		return result;
	}

	@Override
	public int add(MemberDTO dto) throws SQLException
	{
		int result = 0;
		
		// db 연결
		Connection conn = dataSource.getConnection();
		
		// 쿼리문 준비
		String sql = "INSERT INTO TBL_MEMBERLIST(MID, NAME, TELEPHONE) VALUES (MEMBERLISTSEQ.NEXTVAL, ?, ?)";		
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getTelephone());

		result = pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();

		return result;
		
	}

	
	


=======
		Connection conn = dataSource.getConnection();
		String sql = "SELECT COUNT(*) AS COUNT FROM TBL_MEMBERLIST";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
			result = rs.getInt("COUNT");
		
		rs.close();
		stmt.close();
		conn.close();
		return result;
	}

	
>>>>>>> 8e201cad326225debe5d05f2705421fb671ac32c
}
