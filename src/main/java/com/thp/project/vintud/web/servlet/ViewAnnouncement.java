package com.thp.project.vintud.web.servlet;

import java.io.IOException;  
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thp.project.vintud.dao.controller.AnnouncementController;
import com.thp.project.vintud.entity.Announcement;


 




@WebServlet("/viewAnnouncement")
public class ViewAnnouncement extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewAnnouncement() {
        // TODO Auto-generated constructor stub
    }


    AnnouncementController announcementController = new AnnouncementController() ;
	ArrayList<Announcement> annonces = announcementController.getAllAnnonces() ;		
   // CategoryController categoryController = new CategoryController() ;


    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        
	      
    	request.setAttribute("tailleList",annonces.size());
    	request.setAttribute("listAnnonces",annonces);
    //	request.setAttribute("controllerCategory",categoryController);

    	



		
    	request.getRequestDispatcher("/WEB-INF/viewAnnouncement.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
