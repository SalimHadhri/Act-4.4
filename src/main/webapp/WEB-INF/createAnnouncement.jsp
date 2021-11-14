<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
                      
                      
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Déposer une annonce</title>
</head>
<body>
   <%@ include file = "header.jsp"  %>
	<h1>  Déposer une annonce </h1>
	

		<form action="createAnnouncement" method="post">  
				<table>  
					<tr><td>identifiant : </td><td><input type="text" name="id" id="id"/></td></tr>  				
					<tr><td>title : </td><td><input type="text" name="title" id="title"/></td></tr>  
					<tr><td>description : </td><td><input type="text" name="description" id="description"/></td></tr>  
					<tr><td>category : </td><td>  
					<select name="category" id="category"  type="text" style="width:150px">  
							<option>T-SHIRT</option>  
							<option>Pantalon</option>  
							<option>Veste</option>  
					</select>  
					</td></tr>
					<tr><td>price : </td><td><input type="text" name="price"/></td></tr>  	
					<tr><td>localisation  : </td><td><input type="text" id="localisation" name="localisation"/></td></tr>  							  
					<tr><td colspan="2"><input type="submit" value="Save Announcement" /></td></tr>  
				</table>  
		</form>  
			
      
      

</body>
</html>