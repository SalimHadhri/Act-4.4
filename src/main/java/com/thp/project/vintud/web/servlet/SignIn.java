package com.thp.project.vintud.web.servlet;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thp.project.vintud.dao.controller.SignInController;
import com.thp.project.vintud.entity.User;




@WebServlet("/signIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SignIn() {
        // TODO Auto-generated constructor stub
    }

    
    SignInController signController = new SignInController() ;
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        
	     // response.setIntHeader("Refresh", 5);

    	request.getRequestDispatcher("/WEB-INF/signIn.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();	
		
		User utilisateurEnregistre = new User();
		
		Connect connexion = new Connect() ;
		
		String id=request.getParameter("id");		
		String Nom=request.getParameter("Nom");
		String Prenom=request.getParameter("Prenom");
		String Pseudo=request.getParameter("Pseudo");
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		String Telephone=request.getParameter("Telephone");
		String Address=request.getParameter("Address");
		String Role=request.getParameter("Role");

		int idUser = Integer.parseInt(id) ;
		int idRole = signController.findIdRoleByName(Role) ;
		
		utilisateurEnregistre.setId_user(idUser) ;
		utilisateurEnregistre.setName(Nom) ;
		utilisateurEnregistre.setFirstname(Prenom) ;
		utilisateurEnregistre.setPseudo(Pseudo) ;
		utilisateurEnregistre.setMail(Email) ;
		utilisateurEnregistre.setU_password(Password) ;
		utilisateurEnregistre.setPhone(Telephone) ;
		utilisateurEnregistre.setAddress(Address) ;
		utilisateurEnregistre.setRole_id(idRole) ;
				
		int status =signController.addUser(utilisateurEnregistre) ;	

		if (status>0) {
			
			connexion.doGet(request, response);
			
		}else if (status==-1){
			out.print("<p>Sorry! unable to save Account ! change your id !</p>");
			request.getRequestDispatcher("/WEB-INF/signIn.jsp").include(request, response);

		}else if(status==0) {
			out.print("<p>Sorry! unable to save Account ! change your email  !</p>");
			request.getRequestDispatcher("/WEB-INF/signIn.jsp").include(request, response);
		}
		else if(status==-2) {
			out.print("<p>Sorry! unable to save Account ! change your phone number  !</p>");
			request.getRequestDispatcher("/WEB-INF/signIn.jsp").include(request, response);
		}
		

	}

}
