<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>add user</title>
        <link rel="stylesheet" href="" />



    </head>

    <body>
      <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.js"></script>


      <form action=""  id="registration" method="post">
      		<table>  
      			<tr><td>identifiant utilisateur : </td><td><input type="text" name="id" id="id"/></td></tr>
      			<tr><td>Nom  :</td><td><input type="text" name="Nom" id="Nom"/></td></tr>
      			<tr><td>Prenom : </td><td><input type="text" name="Prenom" id="Prenom"/></td></tr>
      			<tr><td>Pseudo : </td><td><input type="text" name="Pseudo" id="Pseudo"/></td></tr>
      			<tr><td>Email : </td><td><input type="text" name="Email" id="Email"/></td></tr>
      			<tr><td>Password : </td><td><input type="text" name="Password" id="Password"/></td></tr>
      			<tr><td>Phone : </td><td><input type="text" name="Telephone" id="Telephone"/></td></tr>
      			<tr><td>Address : </td><td><input type="text" name="Address" id="Address"/></td></tr>     			     			
      			<tr><td>Role : </td><td>  
					<select name="Role" id="Role"  type="text" style="width:150px">  
							<option>CLIENT</option>  
							<option>ADMIN</option>  
							<option>MODERATEUR</option>  
					</select>  
					</td></tr>
				<tr><td colspan="2"><input type="submit" value="Save User" /></td></tr>					
			</table>
      	</form>



    </body>
</html>
