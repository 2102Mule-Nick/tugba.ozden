package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;
import com.revature.exception.UserNameTaken;
import com.revature.exception.UserNotFound;
import com.revature.pojo.User;
import com.revature.util.ConnectionFactoryPostgres;

public class UserDaoPostgres implements UserDao {	
	Logger log = Logger.getRootLogger();

	@Override
	public void createUser(User user) throws UserNameTaken {	
		
		
		Connection conn = ConnectionFactoryPostgres.getConnection();
		
		String sql = "insert into users (user_name, pass_word) values ('" + user.getUserName() + "', '" +user.getPassWord() + "')";
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public User getUserByUserName(String userName) throws UserNotFound {

		User user = null;
			
		Connection conn = ConnectionFactoryPostgres.getConnection();		
			
			String sql = "select * from users where user_name =?";
			try {
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				//log.info("User found in DB");
				user = new User();
				user.setUserName(rs.getString("user_name"));
				user.setPassWord(rs.getString("pass_word"));
			}
			
		} catch (SQLException e) {
			//log.error("Failure to connect to DB", e);
		}
		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(User user) {
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "delete from users where user_name =? and pass_word =?";
		conn = ConnectionFactoryPostgres.getConnection();
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, user.getPassWord());
			stmt.setString(2, user.getUserName());
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public void updateUser(User user) {
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		String sql = "update users set pass_word = ? WHERE user_name = ?";
		
		conn = ConnectionFactoryPostgres.getConnection();
		
		try {
			stmt=conn.prepareStatement(sql);
			stmt.setString(1, user.getPassWord());
			stmt.setString(2, user.getUserName());
			stmt.execute();
			log.info("User is updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Unsuccessfuly updated");
		}
		
	}
	
	

}
