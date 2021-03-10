package com.revature.dao;

import java.util.List;

import com.revature.pojo.Answer;
import com.revature.pojo.Contents;

public interface AnswerDao {
	
	public Contents getAnswerByInput(String input);

	public List<Answer> getfindAnswerByCategoryId(Contents categoryId);
	


}
