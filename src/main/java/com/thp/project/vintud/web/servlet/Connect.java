package com.thp.project.vintud.web.servlet;


import java.io.IOException;   
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.thp.project.vintud.dao.controller.ConnectionController;
import com.thp.project.vintud.entity.User;




@WebServlet("/connect")
public class Connect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Connect() {
        // TODO Auto-generated constructor stub
    }

    ConnectionController connectionController = new ConnectionController() ;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
    	request.getRequestDispatcher("/WEB-INF/connect.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();	
		
		
		 	String email = request.getParameter("email");
	        String pwd = request.getParameter("password");
	        
	        ViewAnnouncement viewAnnouncement = new ViewAnnouncement();
	        
	        User userConnected = new User() ;
	        
	        userConnected= connectionController.connectedUser(email, pwd) ;
	        
	        

	        
	        
	        if(userConnected.getId_user() == -1) {

	        	out.print("<p>Email or password incorrect !! Make another try ;)</p>");
				request.getRequestDispatcher("/WEB-INF/connect.jsp").include(request, response);
		                	        	
	        }
	        else {
	        	HttpSession session = request.getSession();
		        session.setAttribute("id", userConnected.getId_user());
		        session.setAttribute("nom", userConnected.getName());
		        session.setAttribute("prenom", userConnected.getFirstname());

		        session.getServletContext().getRequestDispatcher("/WEB-INF/viewAnnouncement.jsp").forward(request, response); 	
	        }
	        
		
	}

}
