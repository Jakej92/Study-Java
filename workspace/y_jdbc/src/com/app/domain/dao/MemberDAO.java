package com.app.domain.dao;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import com.app.configuration.Configuration;
import com.app.domain.vo.MemberVO;

public class MemberDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	회원가입
	public void insert(MemberVO memberVO) {
		String query = "INSERT INTO TBL_MEMBER "
				+ "(ID, MEMBER_EMAIL, MEMBER_PASSWORD, MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER) "
				+ "VALUES(SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?, ?)";
		
		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberGender());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
				
	}
	
//	로그인
	public Optional<MemberVO> selectByMemberEmailAndMemberPassword(MemberVO memberVO) {
		MemberVO member = null;
		String query = "SELECT "
				+ "ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
				+ "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
				+ "FROM TBL_MEMBER "
				+ "WHERE MEMBER_EMAIL = ? AND MEMBER_PASSWORD = ?";
		
		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				member = new MemberVO();
				
				member.setId(resultSet.getLong(1));
				member.setMemberEmail(resultSet.getString(2));
				member.setMemberPassword(resultSet.getString(3));
				member.setMemberName(resultSet.getString(4));
				member.setMemberAge(resultSet.getInt(5));
				member.setMemberGender(resultSet.getString(6));
				member.setCreatedDate(resultSet.getString(7));
				member.setUpdatedDate(resultSet.getString(8));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
		return Optional.ofNullable(member);
	}
	
//	아이디로 회원 조회
	public MemberVO selectById(Long id) {
		MemberVO member = null;
		String query = "SELECT "
				+ "ID, MEMBER_EMAIL, MEMBER_PASSWORD, "
				+ "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE "
				+ "FROM TBL_MEMBER "
				+ "WHERE ID = ?";
		
		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				member = new MemberVO();
				
				member.setId(resultSet.getLong(1));
				member.setMemberEmail(resultSet.getString(2));
				member.setMemberPassword(resultSet.getString(3));
				member.setMemberName(resultSet.getString(4));
				member.setMemberAge(resultSet.getInt(5));
				member.setMemberGender(resultSet.getString(6));
				member.setCreatedDate(resultSet.getString(7));
				member.setUpdatedDate(resultSet.getString(8));
				
				System.out.println(member);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
		return member;
	}
	
//	회원 정보 수정
	public void update(MemberVO memberVO) {
		String query = "UPDATE TBL_MEMBER "
				+ "SET MEMBER_NAME = ?, MEMBER_AGE = ?, MEMBER_GENDER = ? "
				+ "WHERE ID = ?";
		
		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberVO.getMemberName());
			preparedStatement.setInt(2, memberVO.getMemberAge());
			preparedStatement.setString(3, memberVO.getMemberGender());
			preparedStatement.setLong(4, memberVO.getId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	
//	삭제하기
	public void delete(Long id) {
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ?";
		
		connection = Configuration.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

	
//	전체 회원 조회
	public List<MemberVO> lookUpAllMember() {
		List<MemberVO> members = new ArrayList<>();
	    String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, " 
        + "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE " 
        + "FROM TBL_MEMBER";	
	    
	    connection = Configuration.getConnection();
	    
	    try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				MemberVO member = new MemberVO();
				
				member.setId(resultSet.getLong(1));
				member.setMemberEmail(resultSet.getString(2));
				member.setMemberPassword(resultSet.getString(3));
				member.setMemberName(resultSet.getString(4));
				member.setMemberAge(resultSet.getInt(5));
				member.setMemberGender(resultSet.getString(6));
				member.setCreatedDate(resultSet.getString(7));
				member.setUpdatedDate(resultSet.getString(8));
				
				members.add(member);
				
			}
			
	    }catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				} if(preparedStatement != null) {
					preparedStatement.close();
				} if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	    return members;
	}
	
	

//	// 외부에서 호출할 수 있는 메서드, 모든 회원 정보를 조회하여 리스트로 반환
//	public List<MemberVO> lookUpAllMembers() {
//
//	    // 조회된 회원 정보를 저장할 리스트 생성
//	    // List<MemberVO>: 회원 정보를 담은 MemberVO 객체 리스트
//	    List<MemberVO> members = new ArrayList<>();
//
//	    // SQL 쿼리 작성: TBL_MEMBER 테이블에서 회원 정보를 조회
//	    // "SELECT ~ FROM TBL_MEMBER": 회원 ID, 이메일, 비밀번호, 이름, 나이, 성별, 생성일, 수정일을 조회하는 SQL 문
//	    String query = "SELECT ID, MEMBER_EMAIL, MEMBER_PASSWORD, " 
//	                 + "MEMBER_NAME, MEMBER_AGE, MEMBER_GENDER, CREATED_DATE, UPDATED_DATE " 
//	                 + "FROM TBL_MEMBER";
//
//	    // 데이터베이스 연결 객체 생성
//	    // Configuration.getConnection(): DB 연결을 생성하고 반환하는 메서드 호출
//	    connection = Configuration.getConnection();
//
//	    try {
//	        // SQL 실행을 위한 PreparedStatement 객체 생성
//	        // preparedStatement: 미리 컴파일된 SQL 문을 실행하기 위한 객체
//	        preparedStatement = connection.prepareStatement(query);
//
//	        // SQL 실행 및 결과(ResultSet) 저장
//	        // executeQuery(): SELECT 문 실행 후 조회된 데이터를 ResultSet 객체로 반환
//	        resultSet = preparedStatement.executeQuery();
//
//	        // 조회된 데이터가 있는 동안 반복 실행
//	        // resultSet.next(): 다음 행(row)으로 이동하며 데이터가 있으면 true 반환
//	        while (resultSet.next()) { 
//	            // 한 명의 회원 정보를 저장할 MemberVO 객체 생성
//	            MemberVO member = new MemberVO();
//
//	            // 조회된 데이터(ResultSet)에서 각 컬럼 값을 가져와 member 객체에 저장
//	            // resultSet.getLong(1): 첫 번째 컬럼(ID)을 Long 타입으로 가져와 설정
//	            member.setId(resultSet.getLong(1)); // 회원 ID (Long 타입)
//	            member.setMemberEmail(resultSet.getString(2)); // 회원 이메일 (String 타입)
//	            member.setMemberPassword(resultSet.getString(3)); // 회원 비밀번호 (String 타입)
//	            member.setMemberName(resultSet.getString(4)); // 회원 이름 (String 타입)
//	            member.setMemberAge(resultSet.getInt(5)); // 회원 나이 (Integer 타입)
//	            member.setMemberGender(resultSet.getString(6)); // 회원 성별 (String 타입)
//	            member.setCreatedDate(resultSet.getString(7)); // 계정 생성일 (String 타입)
//	            member.setUpdatedDate(resultSet.getString(8)); // 계정 수정일 (String 타입)
//
//	            // 리스트에 MemberVO 객체 추가
//	            members.add(member); 
//
//	            // 콘솔에 회원 정보 출력 (비밀번호가 포함될 수 있어 보안상 주의 필요)
//	            System.out.println(member);
//	        }
//
//	    } catch (SQLException e) {
//	        // SQL 실행 중 예외 발생 시 예외 메시지를 출력 (오류 로그 출력)
//	        e.printStackTrace();
//	    } finally {
//	        // 리소스 해제 (데이터베이스 연결 및 쿼리 실행 객체 닫기)
//	        try {
//	            if (resultSet != null) resultSet.close(); // ResultSet 닫기
//	            if (preparedStatement != null) preparedStatement.close(); // PreparedStatement 닫기
//	            if (connection != null) connection.close(); // Connection 닫기 (반드시 필요)
//	        } catch (SQLException e) {
//	            // 리소스 해제 중 예외 발생 시 런타임 예외 발생 (추적 가능)
//	            throw new RuntimeException(e);
//	        }
//	    }
//
//	    // 조회된 회원 목록(List<MemberVO>)을 반환
//	    return members;
//	}

//	이메일 중복 검사

	public Optional<MemberVO> checkId(String memberEmail) {
		MemberVO member = null;
		String query = "SELECT MEMBER_EMAIL "
				+ "FROM TBL_MEMBER "
				+ "WHERE MEMBER_EMAIL = ?";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memberEmail);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {	
				member = new MemberVO();
				member.setMemberEmail(resultSet.getString(1));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				} if(preparedStatement != null) {
					preparedStatement.close();
				} if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		return Optional.ofNullable(member);
	}
	
	
	
	
	
	
}
