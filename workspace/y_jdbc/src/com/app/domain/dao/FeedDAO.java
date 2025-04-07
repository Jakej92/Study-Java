package com.app.domain.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.app.configuration.Configuration;
import com.app.domain.vo.FeedVO;

public class FeedDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	피드 등록
	public void insert(FeedVO feedVO) {
		String query = "INSERT INTO TBL_FEED "
					+ "(ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT) "
					+ "VALUES(SEQ_FEED.NEXTVAL, SYSDATE, SYSDATE, ?)";

		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, feedVO.getFeedContent());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				} if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
	}
	
	
//	public void insertFeed(FeedVO feedVO) {
//		String query = "INSERT INTO TBL_FEED "
//				+	"(ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT) "
//				+	"VALUES(SEQ_FEED.NEXTVAL, SYSDATE, SYSDATE, ?)";
//		
//		connection = Configuration.getConnection();
//		
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			
////			preparedStatement.setString(1, feedVO.getCreateDate());
////			preparedStatement.setString(2, feedVO.getUpdateDate());
//			preparedStatement.setString(1, feedVO.getFeedContent());
//			
//			preparedStatement.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException();
//			} 
//		}
//	}
	
//	피드 ID로 조회
	public FeedVO selectById(Long id) {
		FeedVO feed = null;
		String query = "SELECT "
				+	"ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT "
				+	"FROM TBL_FEED "
				+	"WHERE ID = ?";
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();
		
			if(resultSet.next()) {
				feed = new FeedVO();
				
				feed.setId(resultSet.getLong(1));
				feed.setCreateDate(resultSet.getString(2));
				feed.setUpdateDate(resultSet.getString(3));
				feed.setFeedContent(resultSet.getString(4));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}if(preparedStatement != null) {
					resultSet.close();
				}if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
		return feed;
	}
	
	
//	public FeedVO lookUpById(Long id) {
//		FeedVO feed = null;
//		String query = "SELECT "
//				+	"ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT "
//				+	"FROM TBL_FEED "
//				+	"WHERE ID = ?";
//		
//		connection = Configuration.getConnection();
//		
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setLong(1, id);
//			
//			resultSet = preparedStatement.executeQuery();
//			
//			if(resultSet.next()) {
//				feed = new FeedVO();
//				
//				feed.setId(resultSet.getLong(1));
//				feed.setCreateDate(resultSet.getString(2));
//				feed.setUpdateDate(resultSet.getString(3));
//				feed.setFeedContent(resultSet.getString(4));
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				}if(preparedStatement != null) {
//					preparedStatement.close();
//				}if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException();
//			}
//		}
//		
//		return feed;
//	}
//	피드 수정 
	public void update(FeedVO feedVO) {
		String query = "UPDATE TBL_FEED "
				+ "SET FEED_CONTENT = ? WHERE ID = ?";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, feedVO.getFeedContent());
			preparedStatement.setLong(2, feedVO.getId());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null) {
					preparedStatement.close();
				}if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
			
		}
	}
	
	
//	public void update(FeedVO feedVO) {
//		String query = "UPDATE TBL_FEED "
//				+ "SET FEED_CONTENT = ? WHERE ID = ?";
//		
//		connection = Configuration.getConnection();
//		
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			
//			preparedStatement.setString(1, feedVO.getFeedContent());
//			preparedStatement.setLong(2, feedVO.getId());
//			
//			preparedStatement.executeUpdate();
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException();
//			}
//			
//		}
//		
//		
//	}
	
	
//	피드 삭제
	public void delete(Long id) {
		String query = "DELETE FROM TBL_FEED WHERE ID = ?";
		
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
				}if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
			
		}

	}
	
	
	
//	public void deleteFeed(Long id) {
//		String query = "DELETE FROM TBL_FEED WHERE ID = ?";
//		
//		connection = Configuration.getConnection();
//		
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			preparedStatement.setLong(1, id);
//			
//			preparedStatement.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(preparedStatement != null) {
//					preparedStatement.close();
//				}if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException();
//			}
//			
//		}
//	}
	
//	피드 전체 조회

	public List<FeedVO> selectAll() {
		List<FeedVO> feeds = new ArrayList<>();
		String query = "SELECT ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT "
				+	"FROM TBL_FEED";
		
		connection = Configuration.getConnection();
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				FeedVO feed = new FeedVO();
				
				feed.setId(resultSet.getLong(1));
				feed.setCreateDate(resultSet.getString(2));
				feed.setUpdateDate(resultSet.getString(3));
				feed.setFeedContent(resultSet.getString(4));
				
				feeds.add(feed);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}if(preparedStatement != null) {
					preparedStatement.close();
				}if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
		
		return feeds;
	}
	
	
	
//	public List<FeedVO> lookUpAllFeed() {
//		List<FeedVO> feeds = new ArrayList<>();
//		
//		String query = "SELECT ID, CREATE_DATE, UPDATE_DATE, FEED_CONTENT "
//				+	"FROM TBL_FEED";
//		
//		connection = Configuration.getConnection();
//		
//		try {
//			preparedStatement = connection.prepareStatement(query);
//			
//			resultSet = preparedStatement.executeQuery();
//			
//			while(resultSet.next()) {
//				FeedVO feed = new FeedVO();
//				
//				feed.setId(resultSet.getLong(1));
//				feed.setCreateDate(resultSet.getString(2));
//				feed.setUpdateDate(resultSet.getString(3));
//				feed.setFeedContent(resultSet.getString(4));
//				
//				feeds.add(feed);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(resultSet != null) {
//					resultSet.close();
//				} if(preparedStatement != null) {
//					preparedStatement.close();
//				} if(connection != null) {
//					connection.close();
//				}
//			} catch (SQLException e) {
//				throw new RuntimeException();
//			}
//		}
//		return feeds;
//	}
//	
	
	
} // class
















