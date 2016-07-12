package com.oracle.Log4jDemo;

import org.apache.log4j.Logger;

public class LoginDAO {
	
	public String checkLogin(String userid,String password){
		Logger logger=Logger.getLogger(LoginDAO.class);
			logger.debug("Login DAO class");
		if(userid.equals(password)){
			return "Welcome";
		}
		else{
			return "UserId OR Password is Wrong";}
		}

}
