package com.thp.project.vintud;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.thp.project.vintud.dao.AnnouncementDao;
import com.thp.project.vintud.dao.CategoryDao;
import com.thp.project.vintud.dao.FavorisDAO;
import com.thp.project.vintud.dao.RechercheDAO;
import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.controller.AnnouncementController;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Announcement;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		

		UserDao userDao = DAOFactory.getUserDAO();
		AnnouncementDao announcementDao = DAOFactory.getAnnoucementDAO() ;
		FavorisDAO favorisDAO = DAOFactory.getFavorisDAO();
		RechercheDAO rechercheDAO = DAOFactory.getRechercheDAO() ;
		CategoryDao categoryDao = DAOFactory.getCategoryDAO() ; 
	ArrayList<Announcement> nfjnf = announcementDao.findAllAnnoucement();
		

	    AnnouncementController announcementController = new AnnouncementController() ;
		
		
		//int id = categoryDao.getIdByName("Pantalon") ;

		//System.out.println(id);
		
		//	requete="INSERT INTO vintud.announcement VALUES ("+4+",'moto',' Je vends ma moto X5643'"+3+","+800.99+","+null+","+null+","+ true+","+ 1+",'Zedorame'"+","+67+");";
	   Timestamp time =  Timestamp.valueOf(LocalDateTime.now()) ;
	   //Random rd = new Random();
	   
	  //  String pattern = "yyyy-MM-dd hh:mm:ss";
	    //SimpleDateFormat format = new SimpleDateFormat(pattern);
	   // Timestamp time = format.pa
	    
	   
	   //Timestamp.valueOf(LocalDateTime
	    		//Date date=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss").parse(stringToBeParsed);
	    
	    //Timestamp date=(Timestamp) new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(time.toString());
	    
	    String s = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(time);


	    		
		//announcementDao.consulterAnnonces(); 
	    
	    /*
Announcement A = new Announcement() ;
		A.setTitle("moto");
		A.setDescription("vend moto");
		A.setCategory_id(3);
		A.setPrice(5);
		A.setPublication_date("fsf");
		A.setIs_available(false);
		A.setView_number(5);
		A.setLocalisation("tunis");
		A.setUser_id(1);
		A.setPicture("a voir ") ;
	A.setId_annoucement(7) ;

		
		announcementDao.addAnnouncement(A)  ;
		//System.out.println(s) ;
		*/
	    
	    
	    
	    System.out.println(userDao.findIdRoleByName("ADMIN")) ;
		
	}
	
	
	

}
