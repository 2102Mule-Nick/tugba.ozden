package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.util.ConnectionFactoryPostgres;

class ConnectionFactoryTest {
	
	/*ConnectionFactoryPostgres connectionFactory;
	
	@BeforeEach
	private void setUp() {
		connectionFactory=new ConnectionFactoryPostgres();
	}*/
	
	
	

	@Test
	void test() {
		assertNotNull(ConnectionFactoryPostgres.getConnection(),"Connection is done.");
	}
	
	

}
