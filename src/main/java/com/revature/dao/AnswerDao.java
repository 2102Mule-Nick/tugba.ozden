package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.pojo.Answer;
import com.revature.pojo.Contents;

public interface AnswerDao {
	
	public Contents getAnswerByInput(String input);

	public List<Answer> getfindAnswerByCategoryId(Contents categoryId);
	
	public void getUserNameUsingCallable() throws SQLException;
	


}
