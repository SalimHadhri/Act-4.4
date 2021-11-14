package com.thp.project.vintud.dao.controller;


import java.util.List;

import com.thp.project.vintud.dao.FavorisDAO;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Favoris; 





public class FavorisController {

	
	FavorisDAO favorisDAO = DAOFactory.getFavorisDAO() ;
	
	public List<Favoris> getFavorisByUtilisateurId(int utilisateurId){
		return favorisDAO.findFavoriByIdUser(utilisateurId) ;
	}
		
		
		
	
}
