<%-- 
    Document   : index
    Created on : 04/12/2018, 11:38:54 AM
    Author     : Dell
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="webservices.Tablero"%>
<%@page import="UsuarioWS.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    HttpSession sesion = request.getSession();
    
    Usuario u = new Usuario();
    Tablero t = new Tablero();
    List<Tablero> tableros = new ArrayList();
    
    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("../login.jsp");
    }
 
    try {
	UsuarioWS.UsuarioWS_Service service = new UsuarioWS.UsuarioWS_Service();
	UsuarioWS.UsuarioWS port = service.getUsuarioWSPort();
	 // TODO initialize WS operation arguments here
	int id = Integer.parseInt(sesion.getAttribute("usuario").toString());
	// TODO process result here
	u = port.seleccionarUsuario(id);

    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
 
    try {
	webservices.TableroUsuarioWS_Service service = new webservices.TableroUsuarioWS_Service();
	webservices.TableroUsuarioWS port = service.getTableroUsuarioWSPort();
	 // TODO initialize WS operation arguments here
	int idUsuario = u.getId();
	// TODO process result here
	tableros = port.obtenerTablerosDeUsuario(idUsuario);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }

%>


<html>
    <head>
        <title>Chello-Home</title>
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
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
    </head>


    <body style="background-color: #fafafa">


        <nav class="navbar navbar-dark contenedor_nav" id="navbarid" style="background-color: #3973ac; color: white; ">

            <a class="navbar-brand" href="index.jsp">
                <img src="../img/trello-logo-blue.png" alt="" style="width: 110px;height: 30px;"/>
            </a>

            

            <div class="dropdown" >
                <a  class="dropdown-item salir" href="../SSalir">Cerrar sesión</a>
                
            </div>
            <style>
                .dropdown-menu a{
                    font-size: 15px; color: #758280; margin-right: 50%;
                }
            </style>
        </nav>
        
        
        <div class="container mt-3 margin_total">
            <div class="row">
                <div class="col-sm contenedor_aside">
                    <h5 class="text-left">
                        <img src="../img/outline_view_day_black_18dp.png" alt=""/>
                       
                        <a class="dropdown-item salir"  href="">Home <span class="sr-only">(current)</span></a>
                        <a class="dropdown-item salir" href="../profile">Perfil</a>
                        <a class="dropdown-item salir" href="#">Configuración</a>
                        <a class="dropdown-item salir" href="#">Ayuda</a>
                        
                </div>
                <div class="col-sm-9">
                    <div class="container-fluid">

                        <div class="row">
                            <h5 class="tab_title">                                
                                Tableros personales
                            </h5>
                        </div>
                        
                        <div class="row">
                            <%if(tableros.size()==0){%>
                            <h2>No tienes ningun tablero</h2>    
                            <%}%>
                            
                            <% for (int i = tableros.size()-1; i >= 0; i--) {%>
                            <div class="col-sm-6 col-md-4 col-lg-3 mt-3">

                                <% if (i % 2 == 0) {%>
                                <a href="tablero.jsp?id=<% out.print(tableros.get(i).getId()); %>">
                                    <button type="button" style="font-size: 1em; cursor: pointer; color:white; 
                                            border:none; border-radius: 5px; background-color: #008299; width: 100%; height: 100px;">
                                        <p style="font-weight: bold"><% out.print(tableros.get(i).getTitulo()); %></p>
                                    </button>
                                </a> 
                                <%} else {%> 
                                <a href="tablero.jsp?id=<% out.print(tableros.get(i).getId()); %>">
                                    <button type="button" style="font-size: 1em; cursor: pointer; color:white; 
                                            border:none; border-radius: 5px; background-color: #005B8F; width: 100%; height: 100px;">
                                        <p style="font-weight: bold"><% out.print(tableros.get(i).getTitulo()); %></p>
                                    </button>
                                </a> 
                                <%}%>

                            </div>        
                            <% }%>
                            
                        </div>

                        <div class="row mt-5 mb-4">
                            <div class="col-sm-6 col-md-4 col-lg-3">
                                <button type="button" class="btn btn-light" data-toggle="modal" 
                                        data-target="#exampleModalLong" style=" background-color: #D9DFE1; border:none; 
                                        border-radius: 5px; cursor: pointer; width: 100%; height: 100px;">
                                <span style="font-weight: bold">Nuevo</span><br/><span style="font-weight: bold">Tablero</span>
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLongTitle">Crear Tablero</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">

                                                <form method="POST" action="../jsp/creartablero.jsp">
                                                    <div class="form-group">
                                                        <label for="name">Nombre del tablero</label>
                                                        <input type="text" class="form-control" name="titulo" id="titulo">
                                                        <small style="color:gray"></small>
                                                    </div>
                                                    <div class="form-group">
                                                        <button type="submit" class="btn btn-success">Crear Tablero</button>
                                                    </div> 
                                                </form>       

                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                        
            </div>
        </div>
        <footer></footer>
    </body>
</html>

