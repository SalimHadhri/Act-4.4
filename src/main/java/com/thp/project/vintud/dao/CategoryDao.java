package com.thp.project.vintud.dao;

import com.thp.project.vintud.entity.Category;

public interface CategoryDao {

	public void AfficherCategories () ;
	
	
	
	public  Category getCategoryById(int id) ;
	
	public int getIdByName (String name) ;
	
	
}


