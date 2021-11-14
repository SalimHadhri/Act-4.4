package com.thp.project.vintud.dao.controller;


import java.util.ArrayList;  

import com.thp.project.vintud.dao.AnnouncementDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Announcement; 
 


public class AnnouncementController {

	AnnouncementDao announcementDao = DAOFactory.getAnnoucementDAO() ;
	
	
	
	public AnnouncementController() {
	}

	public ArrayList<Announcement> getAnnoncesByUtilisateurId(int utilisateurId) {		
		return announcementDao.findAnnounceByIdUser(utilisateurId) ;	
	}
	
	public Announcement getAnnoncesById(int annonceId) {		
		return announcementDao.findAnnounceById(annonceId);	
	}
	
	public ArrayList<Announcement> getAllAnnonces() {		
		return announcementDao.findAllAnnoucement();	
	}
	
	public int addAnnouncement(Announcement announcement) {
		
		return announcementDao.addAnnouncement(announcement);

	}
	
	

}
