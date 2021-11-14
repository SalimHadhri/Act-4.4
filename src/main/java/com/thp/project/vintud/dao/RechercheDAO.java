package com.thp.project.vintud.dao;

import com.thp.project.vintud.entity.Recherche;

public interface RechercheDAO {
	
	public Recherche chooseRechercheSpecifications ();
	public void creerRecherche () ;
	public void afficherRecherches() ;
	public void supprimerRecherche () ;
	public Recherche findResearchByIdUser (int id_user) ;
	public void lancerRecherche(String email, String pwd) ;
	public void modifyRecherche() ;
	
}
