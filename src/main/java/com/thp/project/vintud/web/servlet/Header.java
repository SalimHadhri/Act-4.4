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




@WebServlet("/header")
public class Header extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Header() {
        // TODO Auto-generated constructor stub
    }
    



    


    
    AnnouncementController announcementController = new AnnouncementController() ;
    
    
	ArrayList<Announcement> annonces = announcementController.getAllAnnonces() ;

    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        CreateAnnouncement create= new CreateAnnouncement() ;
        ViewAnnouncement voir = new ViewAnnouncement() ;

           if(request.getParameter("announcements").equals("View announcements"))
           {

        	   voir.doGet(request, response) ;

           }
           else if(request.getParameter("announcements").equals("Create announcement"))
           {
   			create.doGet(request, response) ;
           }      
        
    }
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    

}
