package com.thp.project.vintud.dao;

import java.util.ArrayList; 

import com.thp.project.vintud.entity.Announcement;



public interface AnnouncementDao {

	
	public void consulterAnnonces ()  ;
	public void findAnnouncementByNameCatgeryAndOrPrice () ;		
	public void filtreAnnoucementPrix () ;
	public void filtreAnnoucementLocalisation () ;
	public void voirNombreVues (String email, String pwd) ;
	
	public ArrayList<Announcement> findAnnounceByIdUser(int id);
	public Announcement findAnnounceById (int id) ;	
	
	public ArrayList<Announcement> findAllAnnoucement();
	public int addAnnouncement(Announcement announcement) ;

	
}
