package com.thp.project.vintud.dao.factory;


import java.sql.Connection;

import com.thp.project.vintud.dao.AnnouncementDao;
import com.thp.project.vintud.dao.CategoryDao;
import com.thp.project.vintud.dao.FavorisDAO;
import com.thp.project.vintud.dao.RechercheDAO;
import com.thp.project.vintud.dao.RoleDao;
import com.thp.project.vintud.dao.UserDao;
import com.thp.project.vintud.dao.impl.AnnouncementDaoImpl;
import com.thp.project.vintud.dao.impl.CategoryDaoImpl;
import com.thp.project.vintud.dao.impl.FavorisDaoImpl;
import com.thp.project.vintud.dao.impl.RechercheDaoImpl;
import com.thp.project.vintud.dao.impl.RoleDaoImpl;
import com.thp.project.vintud.dao.impl.UserDaoImpl;
import com.thp.project.vintud.db.ConnectionManager;





public class DAOFactory {
	
	
	
	public static AnnouncementDao getAnnoucementDAO(){
        return new AnnouncementDaoImpl();
    }
	
	public static CategoryDao getCategoryDAO(){
        return new CategoryDaoImpl();
    }	
	public static FavorisDAO getFavorisDAO(){
        return new FavorisDaoImpl();
    }	
	public static RechercheDAO getRechercheDAO(){
        return new RechercheDaoImpl();
    }	
	public static RoleDao getRoleDAO(){
        return new RoleDaoImpl();
    }	
	public static UserDao getUserDAO(){
        return new UserDaoImpl();
    }
	
  
	public static Connection connect () {
		return ConnectionManager.getInstance().getConnection() ;
	}

}
