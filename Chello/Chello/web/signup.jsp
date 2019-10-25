<%-- 
    Document   : login
    Created on : 4/12/2018, 11:00:11 AM
    Author     : Dell
--%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    HttpSession sesion = request.getSession();
    
    if (sesion.getAttribute("usuario") != null) {
        response.sendRedirect("boards");
    }
%>

<html>
    <head>
        <title>Registrar usuario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="img/sig.jpg">
              
        <form method="POST" action="jsp/registrar.jsp" style=" background-color: #ffffff; align-content:center; margin: 5%;
              margin-left: 33%; margin-right: 33%; font-family: calibri; 
              box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.15); padding: 40px 40px; border: none; border-radius: 10px;">
            
            <h1 style="font-weight: bold; font-size: 33px; text-align: center;">Crear cuenta</h1>
            <h4 style="text-align: center">o inicie sesión <a href="login.jsp">aqui</a></h4>
            <br>
     
               
                <div class="form-group">
                    <label for="name">Nombre</label>
                    <input type="text" id="name" name="name"  class="form-control" id="name2" placeholder="P ej: Francisco Quijada">
                </div>
                <div class="form-group">
                    <label for="lastname">Correo Electrónico</label>
                    <input type="email" id="email" name="email" class="form-control" placeholder="P ej: fran@gmail.com">
                </div>
                      
                
                <div class="form-group" >
                    <label for="password">Contraseña</label>
                    <input type="password" name="password" id="password" class="form-control" id="id2" placeholder="P ej: *********">
                </div>
                <div class="form-group" >
                    <label for="butonr">¿Esta seguro?</label>
                    <button type="submit" class="btn btn-success form-control" >Crear cuenta de Chello</button> 
                </div>
           
                

        </form>
        
      
        
    </body>
</html>
