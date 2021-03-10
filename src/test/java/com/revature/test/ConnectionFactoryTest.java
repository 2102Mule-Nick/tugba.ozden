package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.mockito.MockitoAnnotations.Mock;
//import org.mockito.junit.MockitoJUnit;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;

import com.revature.util.ConnectionFactoryPostgres;

@Runwith(MockitoJUnit.class)
class ConnectionFactoryTest {
	
	/*ConnectionFactoryPostgres connectionFactory;
	
	@BeforeEach
	private void setUp() {
		connectionFactory=new ConnectionFactoryPostgres();
	}*/
	
	
	@Mock
	private Connection connection;

	
	@Test
	void test() {
		assertNotNull(ConnectionFactoryPostgres.getConnection(),"Connection is done.");
		
	}
	
	
	

}
