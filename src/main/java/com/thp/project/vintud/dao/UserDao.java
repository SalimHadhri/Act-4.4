package com.thp.project.vintud.dao;


import java.util.ArrayList;  

import com.thp.project.vintud.entity.User;


public interface UserDao {
		
	public int creerUnCompte (User user) ;	
	public User chooseUserSpecifications ();	
	public void afficherRoles() ;
	public User connectAccount (String email, String pwd) ; 
	public void modificationInformationsPersonnelles (String email, String pwd) ;
	public void afficherUtilisateurs() ;
	
	public ArrayList<User> findAllUsers () ;
	
	public int findIdRoleByName(String name) ;
	public boolean emailExist(String email) ;

	
}
