import java.util.Scanner;

import com.revature.dao.AnswerDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoKryo;
import com.revature.dao.UserDaoPostgres;
import com.revature.exception.UserNameTaken;
import com.revature.pojo.User;
import com.revature.service.AuthorizeService;
import com.revature.service.AuthorizeServiceImpl;
import com.revature.ui.Chatting;
import com.revature.ui.Chatting;
import com.revature.ui.Login;
import com.revature.ui.Logout;
import com.revature.ui.Menu;
import com.revature.ui.Registration;
import com.revature.ui.Welcome;

public class Driver {
	public static void main(String[] args) {
		
		//Tugba Ozden
		
		Scanner scan = new Scanner(System.in);
		/*UserDaoPostgres po=new UserDaoPostgres();
		User user =new User(1234,"john","123");
		try {
			po.createUser(user);
		} catch (UserNameTaken e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*AnswerDaoImpl a=new AnswerDaoImpl();
		System.out.println(a.getAnswerByInput("hello").getCategoryId());*/
		
		
		UserDao userDao = new UserDaoPostgres();
		
		AuthorizeService authorizeService = new AuthorizeServiceImpl(userDao);
		
		Menu register = new Registration();
		
		Menu login = new Login(authorizeService);
		
		Menu chatting= new Chatting();
		
		Menu logout=new Logout(authorizeService);	
		
		Menu welcome = new Welcome(login, register, logout, chatting);		
		
		((Registration) register).setWelcome(welcome);
		
		((Registration) register).setAuthorizeService(authorizeService);
		
		login.setScanner(scan);
		
		register.setScanner(scan);
		
		welcome.setScanner(scan);
		
		logout.setScanner(scan);
		
		chatting.setScanner(scan);
		
		Menu nextM = welcome;
		
		nextM.displayFirst();
		do {
			
			nextM.displayOptions();					
			nextM = nextM.advance();
			//login.displayOptions();
			
		} while (nextM != null);
		
		//nextM.displayOptions();
		nextM=chatting;
		do {			
			nextM.displayOptions();
			nextM=nextM.advance();	
			
		}while (nextM != null);
		
	}
		
	}
	
	


