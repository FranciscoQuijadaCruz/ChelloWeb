<%-- 
    Document   : login
    Created on : 4/12/2018, 11:00:11 AM
    Author     : Dell
--%>

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
        <title>Iniciar sesión</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
    
    </head>
    
    <body background="img/str42.jpg" >
        
        <form method="POST" action="jsp/entrar.jsp" style="background-color: #ffffff; align-content:center; margin: 10%; margin-left: 33%; margin-right: 30%; font-family: calibri;
              box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.15); padding: 40px 40px; border: none; border-radius: 10px;">
            <h1 style="text-align: left; font-weight: bold; font-size: 45px;">Iniciar sesión </h1>
            
            
            <div id="mensaje"></div>
            <div class="form-group">
                <label for="email">Correo Electrónico</label>
                <input type="email" class="form-control" name="email" id="email"
                aria-describedby="emailHelp" placeholder="P ej. Fraquijada97@gmail.com">
            </div>
            <div class="form-group">
                <label for="password">Contraseña</label>
                <input type="password" class="form-control" name="password" 
                id="password" placeholder="P ej: *********">
            </div>
              <button type="submit" class="btn btn-success" style="width: 100%;">Iniciar sesión</button>
              <button type="button" class="btn btn-primary btnfor " style="width: 100%; margin-top:12px;" onClick="location.href='signup.jsp'">Crear cuenta</button>


        </form>
        
        
    </body>
</html>
