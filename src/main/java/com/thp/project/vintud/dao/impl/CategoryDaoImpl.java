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

    ResultSet résultats = null;
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
		         résultats = stmt.executeQuery(requete);
				 boolean encore = résultats.next();
				  while (encore) {
					   System.out.println("*********** new category ********");
					   System.out.println("id category : "+résultats.getInt("id")+"\n" +"name category : "+  résultats.getString("name") +"\n"+
							   "description : "+  résultats.getString("description")  );
					   
					   encore = résultats.next();
				   }
				   résultats.close();
				} catch (SQLException e) {
					arret("Anomalie lors de l'execution de la requête") ;
				}
	    }
	
	
	public  Category getCategoryById(int id) {
		
		
		
		
		
		Category category  = new Category();
		
		requete = "SELECT * FROM vintud.category WHERE id ="+id + "  ;" ;
		try {
	         Statement stmt = con.createStatement();
	         résultats = stmt.executeQuery(requete);
				
	         boolean encore = résultats.next();
			if(encore) {	
				
				
				category.setId_category(résultats.getInt("id"));
				category.setName(résultats.getString("name"));		
				category.setDescription(résultats.getString("description"));
				 
			   	}
			   
			   résultats.close();
			   
		} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requête") ;
		}
		return category ;
	}

	
	public int getIdByName (String name) {
		
		int id = 0 ;
		
		requete = "SELECT * FROM vintud.category WHERE name ='"+ name + "'  ;" ;
		try {
	         Statement stmt = con.createStatement();
	         résultats = stmt.executeQuery(requete);
				
	         boolean encore = résultats.next();
			if(encore) {	
				
				id = résultats.getInt("id") ;

				 
			   	}
			   
			   résultats.close();
			   
		} catch (SQLException e) {
				arret("Anomalie lors de l'execution de la requête") ;
		}
		
		
		return id  ;
		
		
	}

	
	

}
