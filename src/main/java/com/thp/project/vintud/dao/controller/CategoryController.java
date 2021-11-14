package com.thp.project.vintud.dao.controller;

import com.thp.project.vintud.dao.CategoryDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Category;

public class CategoryController {

	CategoryDao categoryDao = DAOFactory.getCategoryDAO() ;

	
	public CategoryController() {
	}


	public Category getCategoryById(int id) {
		
		Category category =  categoryDao.getCategoryById(id) ;
		return category ;
		
	}
	
	public int getIdByName (String name) {
		
		return categoryDao.getIdByName(name);
	}
}
