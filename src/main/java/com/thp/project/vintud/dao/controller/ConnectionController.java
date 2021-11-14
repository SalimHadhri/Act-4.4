package com.thp.project.vintud.dao.controller;

import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.User;

public class ConnectionController {

	UserDao userDAO = DAOFactory.getUserDAO() ;

	
	public ConnectionController() {
				
	}

	public User connectedUser(String email, String pwd) {
		return userDAO.connectAccount(email, pwd) ;
	}
	
	
}
