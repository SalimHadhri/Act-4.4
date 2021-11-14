<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>


 

  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
                      
                      
 <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Annonces</title>
</head>
<body>

   <%@ include file = "header.jsp"  %>

	<h3>  Liste des Annonces </h3>
	

	
		<table border='1' width='100%'>
		
			<tr><th>identifiant</th><th>title</th><th>description</th><th>category</th><th>price</th><th>localisation</th></tr>
				
			
		        <c:forEach items="${listAnnonces}" var="annonce"  >
		        
				        <c:if  test="${sessionScope.id eq annonce.getUser_id()}">     
				                <tr>
				                        <th><c:out value="${annonce.getId_annoucement()}" /></th>
				                        <th><c:out value="${annonce.title}" /></th>
				                        <th><c:out value="${annonce.description}" /></th>
				                        <th><c:out value="${annonce.category.name}" /></th>
				                        <th><c:out value="${annonce.price}" /></th>
				                        <th><c:out value="${annonce.localisation}" /></th>	                        
				                  </tr>	
				                  
				          </c:if>
		            	                    	                   
		        </c:forEach>
			</table>
		


</body>
</html>