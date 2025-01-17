package com.thp.project.vintud.dao.impl;



import java.sql.Connection;  
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.thp.project.vintud.dao.CategoryDao;
import com.thp.project.vintud.dao.factory.DAOFactory;
import com.thp.project.vintud.entity.Category;



 
public class CategoryDaoImpl implements CategoryDao{

	
	

    Connection con = DAOFactory.connect();

    ResultSet r�sultats = null;
    String requete = "";
    ResultSetMetaData rsmd;
	private static void arret(String message) {
        System.err.println(message);
        System.exit(99);
     }
    
    private static void affiche(String message) {
        System.out.println(message);
     }
    
    
	public CategoryDaoImpl() {
	}

	public void AfficherCategories () {
		
    	requete = "SELECT * FROM vintud.category ; ";
			try {
		         Statement stmt = con.createStatement();
		         r�sultats = stmt.executeQuery(requete);
				 boolean encore = r�sultats.next();
				  while (encore) {
					   System.out.println("*********** new category ********");
					   System.out.println("id category : "+r�sultats.getInt("id")+"\n" +"name category : "+  r�sultats.getString("name") +"\n"+
							   "description : "+  r�sultats.getString("description")  );
					   
					   encore = r�sultats.next();
				   }
				   r�sultats.close();
				} catch (SQLException e) {
					arret("Anomalie lors de l'execution de la requ�te") ;
				}
	    }
	
	
	public  Category getCategoryById(int id) {
		
		
		
		
		
		Category category  = new Category();
		
		requete = "SELECT * FROM vintud.category WHERE id ="+id + "  ;" ;
		try {
	         Statement stmt = con.createStatement();
	         r�sultats = stmt.executeQuery(requete);
				
	         boolean encore = r�sultats.next();
			if(encore) {	
				
				
				category.setId_category(r�sultats.getInt("id"));
				category.setName(r�sultats.getString("name"));		
				category.setDescription(r�sultats.getString("description"));
				 
			   	}
			   
			   r�sultats.close();
			   
		} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requ�te") ;
		}
		return category ;
	}

	
	public int getIdByName (String name) {
		
		int id = 0 ;
		
		requete = "SELECT * FROM vintud.category WHERE name ='"+ name + "'  ;" ;
		try {
	         Statement stmt = con.createStatement();
	         r�sultats = stmt.executeQuery(requete);
				
	         boolean encore = r�sultats.next();
			if(encore) {	
				
				id = r�sultats.getInt("id") ;

				 
			   	}
			   
			   r�sultats.close();
			   
		} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requ�te") ;
		}
		
		
		return id  ;
		
		
	}

	
	

}
