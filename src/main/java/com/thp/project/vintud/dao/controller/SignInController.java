package com.thp.project.vintud.dao.controller;


import java.util.ArrayList;  

import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.User;



public class SignInController {
	
	UserDao userDAO = DAOFactory.getUserDAO() ;
	
	public SignInController() {
	}
	
	public ArrayList<User> getAllUsers() {		
		return userDAO.findAllUsers();	
	}
	
	public int findIdRoleByName(String name) {
		
		return userDAO.findIdRoleByName(name);
	}
	
	public int addUser( User user) {
		return userDAO.creerUnCompte(user);
	}
	

}
