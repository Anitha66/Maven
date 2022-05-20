package com.learning;

import java.util.ResourceBundle;

public class App {

	public int userLogin(String user,String pswd) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String userName = rb.getString("username");
		String password = rb.getString("password");
		
		if(user.equals(userName)&&pswd.equals(password)) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	
}
