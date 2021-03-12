package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.pojo.Answer;
import com.revature.pojo.Contents;
import com.revature.pojo.User;
import com.revature.util.ConnectionFactoryPostgres;

public class AnswerDaoImpl implements AnswerDao{
	//Logger log = Logger.getRootLogger();

	@Override
	public Contents getAnswerByInput(String user_input) {
		Contents contents= null;
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		
		String sql = "select * from contents where input_content like ? " ;
			try {
				stmt = conn.prepareStatement(sql);
				stmt.setString(1, user_input);
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					contents=new Contents();
					contents.setId(rs.getInt("input_id"));
					int categoryId=rs.getInt("category_id");
					contents.setCategoryId(categoryId);
										
				}
				
			//return contents;	
				
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		} 
			return contents;
		
		
	}

	@Override
	public List<Answer> getfindAnswerByCategoryId(Contents contents) {
		List<Answer> list=null;	
		PreparedStatement stmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		
		String sql = "select * from answer where category_id=? " ;
			try {
				
				list=new ArrayList<Answer>();
				stmt = conn.prepareStatement(sql);
				stmt.setInt(1, contents.getCategoryId());
				rs=stmt.executeQuery();
			
				while (rs.next()) {
					Answer answer=new Answer();
					answer.setId(rs.getInt("answer_id"));
					answer.setCategoryId(rs.getInt("category_id"));
					answer.setAnswer(rs.getString("answer"));
					list.add(answer);
					
					
				}
		} catch (SQLException e) {
			
			//log.error("Failure to connect to DB", e);
		}finally {
			try {
				conn.close();
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
		
	}

	@Override
	public void getUserNameUsingCallable() throws SQLException {
		
		CallableStatement cstmt=null;
		ResultSet rs= null;
		Connection conn = ConnectionFactoryPostgres.getConnection();
		
		
		 //Preparing a CallableStatement
	      try {
			cstmt = conn.prepareCall("{? = call getName(?)}");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	      cstmt.registerOutParameter(1, Types.VARCHAR);	     
	      cstmt.execute();

	      System.out.print("User Name: "+cstmt.getString(1));
		
		
	}	
	

}
