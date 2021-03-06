import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoKryo;
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
		
		Scanner scan = new Scanner(System.in);
		
		UserDao userDao = new UserDaoKryo();
		
		AuthorizeService authorizeService = new AuthorizeServiceImpl(userDao);
		
		Menu register = new Registration();
		
		Menu login = new Login(authorizeService);
		
		Menu chatting= new Chatting();
		
		Menu logout=new Logout(authorizeService);	
		
		Menu welcome = new Welcome(login, register, logout);		
		
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
			
		} while (nextM != null);
		//System.out.println("....");
		nextM=chatting;
		do {			
			nextM.displayOptions();
			nextM=nextM.advance();
			
		}while (nextM != null);
		
	}
		
	}
	
	


