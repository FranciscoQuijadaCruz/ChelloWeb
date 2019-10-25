<%-- 
    Document   : tablero
    Created on : 05-dic-2018, 2:20:09
    Author     : MASTER
--%>

<%@page import="UsuarioWS.Usuario"%>
<%@page import="ComentarioWS.Comentario"%>
<%@page import="ActividadWS.Actividad"%>
<%@page import="ModuloWS.Modulo"%>
<%@page import="TableroWS.Tablero"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    Tablero t = new Tablero();

    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("../login.jsp");
    }

    Usuario u = new Usuario();

    List<Modulo> modulos = new ArrayList();
    List<Actividad> actividades = new ArrayList();
    List<Comentario> comentarios = new ArrayList();
    java.util.List<webservices.Usuario> usuarios = new ArrayList();
    
    try {
        TableroWS.TableroWS_Service service = new TableroWS.TableroWS_Service();
        TableroWS.TableroWS port = service.getTableroWSPort();
        // TODO initialize WS operation arguments here
        int id = Integer.parseInt(request.getParameter("id"));
        // TODO process result here
        t = port.seleccionarTablero(id);

    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }

    try {
        ModuloWS.ModuloWS_Service service = new ModuloWS.ModuloWS_Service();
        ModuloWS.ModuloWS port = service.getModuloWSPort();
        // TODO initialize WS operation arguments here
        int idTablero = Integer.parseInt(request.getParameter("id"));
        // TODO process result here
        modulos = port.obtenerModulosDeTablero(idTablero);

    } catch (Exception ex) {
        // TODO handle custom exceptions here
    }
 

    try {
	webservices.TableroUsuarioWS_Service service = new webservices.TableroUsuarioWS_Service();
	webservices.TableroUsuarioWS port = service.getTableroUsuarioWSPort();
	 // TODO initialize WS operation arguments here
	int idTablero = Integer.parseInt(request.getParameter("id"));
	// TODO process result here
	usuarios = port.obtenerUsuariosDeTablero(idTablero);

    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }

    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../js/accionestablero.js" type="text/javascript"></script>
        <title><%=t.getTitulo()%></title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

        <script src="../js/sweetalert2.all.min.js" type="text/javascript"></script>
    </head>
    <body style="background-color: #FCFCFC" id="pizarra">


        <nav class="navbar navbar-dark" style="background-color: #3973ac; color: white; ">

            <a class="navbar-brand" href="../boards">
                <img src="../img/baseline_home_black_18dp.png" alt=""/>
            </a>

            <a class="navbar-brand mask flex-center rgba-blue-light" href="../boards">
                <img src="../img/trello-logo-blue.png" alt="" style="width: 110px;height: 30px;"/>
            </a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <img src="../img/outline_account_box_white_18dp.png" alt=""/>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../profile">Perfil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Configuración</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Ayuda</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../SSalir">Cerrar sesión</a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="mt-2 col-sm-12 col-md-10 col-lg-8">
                    <h5 style="color: #3d5c5c; font-weight: bold;" id="tableroTitulo"><%=t.getTitulo()%></h5>
                    <div class="p-2">

                        <%for (int users = 0; users < usuarios.size(); users++) {%>

                        <%
                            String[] iniciales = usuarios.get(users).getNombre().split(" ");
                        %>
                        <span title="<%= usuarios.get(users).getNombre()%>"
                              style="height: 30px;
                              cursor: pointer;
                              width: 30px;
                              display: table-cell;
                              text-align: center;
                              font-size:15px;
                              vertical-align: middle;
                              border-radius: 50%;
                              background: #3973AC;
                              color: #FFFFFF;"><%= iniciales[0].charAt(0) + "" + iniciales[1].charAt(0)%>
                        </span>       
                        <%}%>
                        <span class="ml-2" title="Agregar Usuario al tablero" 
                              data-toggle="modal" data-target="#agregarPersona" 
                              style="height: 30px;
                              cursor: pointer;
                              width: 30px;
                              display: table-cell;
                              text-align: center;
                              font-size:15px;
                              vertical-align: middle;
                              border-radius: 50%;
                              background: #3973AC;
                              color: #FFFFFF;">+
                        </span> 
                        <!-- Modal -->
                        <div class="modal fade" id="agregarPersona" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content" style="background-color: #EBEEF0">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Agregar Usuario al Tablero</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                        <form method="POST" action="../jsp/tablerousuario.jsp">
                                            <div class="form-group">
                                                <input name="tablero-agregar-usuario" type="hidden" 
                                                       value="<% out.print(request.getParameter("id")); %>" 
                                                       id="tablero-agregar-usuario">
                                                <label for="email-agregar-usuario">Email del Usuario</label>
                                                <input type="email" class="form-control" 
                                                       name="email-agregar-usuario" id="email-agregar-tablero"
                                                       placeholder="Escriba el email del usuario" 
                                                       onkeyup="detectarEmail()" autocomplete="off">
                                                <ul class="border" id="lista"></ul>
                                            </div>
                                            <button type="submit" class="btn btn-primary">Agregar</button>
                                        </form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="row mt-3" style="position: relative;">
                <%for (int m = modulos.size()-1; m >= 0; m--) {%>
                <div class="col-xs-12 col-md-6 col-lg-3 mt-3" style="">
                    <button  type="button" style="font-size: 1em; cursor: pointer; color:white; 
                             border:none; border-radius: 20px; background-color: #3973AC; width: 100%; height: 100px;">
                        <p style="font-weight: bold"><%= modulos.get(m).getNombre()%></p>
                    </button>

                    <%
                    try {
                        ActividadWS.ActividadWS_Service service = new ActividadWS.ActividadWS_Service();
                        ActividadWS.ActividadWS port = service.getActividadWSPort();
                         // TODO initialize WS operation arguments here
                        int idModulo = modulos.get(m).getId();
                        // TODO process result here
                        actividades = port.obtenerActividadesDeModulo(idModulo);

                    } catch (Exception ex) {
                        out.println(ex);
                    }
                    %>

                    <div class="container-fluid" style="padding-bottom:50px">
                        <div class="row">




                            <%for (int a = 0; a < actividades.size(); a++) {%>

                            <div class="col-12 mt-2" id="listaActividades<%= modulos.get(m).getId()%>">

                                <button data-toggle="modal" data-target="#actividad<%= actividades.get(a).getId()%>" type="button" style="font-size: 1em; cursor: pointer; color:white; 
                                        border:none; border-radius: 20px; background-color: #00B2A5; width: 100%; height: 100px;">
                                    <p style="font-weight: bold" id="tarjeta<%=actividades.get(a).getId()%>"><%= actividades.get(a).getTitulo()%></p>
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="actividad<%= actividades.get(a).getId()%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document" style="background-color:gray">
                                        <div class="modal-content" style="background-color: #EBEEF0; border: 0;">
                                            <div class="modal-header">
                                                <h4><%= modulos.get(m).getNombre()%></h4>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div><hr>
                                            <div class="modal-body">

                                                <%for (int users = 0; users < usuarios.size(); users++) {%>

                                                <%
                                                    String[] iniciales = usuarios.get(users).getNombre().split(" ");
                                                %>
                                                <span title="<%= usuarios.get(users).getNombre()%>"
                                                      style="height: 30px;
                                                      cursor: pointer;
                                                      width: 30px;
                                                      display: table-cell;
                                                      text-align: center;
                                                      font-size:15px;
                                                      vertical-align: middle;
                                                      border-radius: 50%;
                                                      background: #3973AC;
                                                      color: #FFFFFF;"><%= iniciales[0].charAt(0) + "" + iniciales[1].charAt(0)%>
                                                </span>     
                                                <%}%><hr>
                                                <input type="text" name="tituloActividad<%= actividades.get(a).getId()%>" 
                                                       onchange="actualizarTituloActividad('tituloActividad<%= actividades.get(a).getId()%>', '<%= actividades.get(a).getId()%>', '<%= actividades.get(a).getDescripcion()%>', '<%= actividades.get(a).getVencimiento()%>', '<%= actividades.get(a).getEstado()%>')"
                                                       id="tituloActividad<%= actividades.get(a).getId()%>" class="form-control" 
                                                       style="background-color:#EBEEF0; border: none; font-size: 1.2em" value="<%= actividades.get(a).getTitulo()%>">
                                                <br>
                                                Descripcion:<br>
                                                <div class="form-group">
                                                    <textarea name="descripcion<%= actividades.get(a).getId()%>" 
                                                              onchange="actualizarDescripcion('descripcion<%= actividades.get(a).getId()%>', '<%= actividades.get(a).getId()%>', '<%= actividades.get(a).getTitulo()%>', '<%= actividades.get(a).getVencimiento()%>', '<%= actividades.get(a).getEstado()%>')"
                                                              id="descripcion<%= actividades.get(a).getId()%>" class="form-control" 
                                                              style="background-color:#EBEEF0; border: none;"><%= actividades.get(a).getDescripcion()%>
                                                    </textarea>
                                                    <label>Del modulo</label>
                                                    
                                                    <select id="moduloseleccionado<%= modulos.get(m).getId() %>">
                                                        
                                                        <% for (int mm = 0; mm < modulos.size(); mm++) {%>
                                                        <option value="<%= modulos.get(mm).getId() %>">
                                                            <%= modulos.get(mm).getNombre() %>
                                                        </option>     
                                                        <%}%>  
                                                        
                                                    </select>
                                                    
                                                        <button type="submit" class="btn btn-light" onclick="moverActividad('<%= actividades.get(a).getId() %>','<%= actividades.get(a).getTitulo() %>','<%= actividades.get(a).getDescripcion() %>','<%= actividades.get(a).getVencimiento() %>','<%= actividades.get(a).getEstado() %>', '<%= modulos.get(m).getId() %>')">Mover</button>
                                                </div><br>
                                                <img src="../img/eliminar.png" title="Eliminar Actividad" style="cursor:pointer" data-dismiss="modal"
                                                     height="20px" onclick="eliminarActividad(<%= actividades.get(a).getId()%>,<%= modulos.get(m).getId()%>)">

                                                <div class="form-group">
                                                    <label>Anadir comentario</label>
                                                    <textarea class="form-control" style="border: none" id="comentario<%= actividades.get(a).getId()%>"
                                                              placeholder="Escriba un comentario..."></textarea> <br>
                                                    <button class="btn btn-light" onclick="comentar(<%=actividades.get(a).getId()%>)">Comentar</button>
                                                </div>


                                                <div class="container-fluid" id="coments">   



                                                    <%
                                                    try {
                                                        ComentarioWS.ComentarioWS_Service service = new ComentarioWS.ComentarioWS_Service();
                                                        ComentarioWS.ComentarioWS port = service.getComentarioWSPort();
                                                         // TODO initialize WS operation arguments here
                                                        int idActividad = actividades.get(a).getId();
                                                        // TODO process result here
                                                        comentarios = port.obtenerComentariosDeActividad(idActividad);
                      
                                                    } catch (Exception ex) {
                                                        // TODO handle custom exceptions here
                                                    }
                                                    %>


                                                    <% if (comentarios.size() == 0) {%>
                                                    <div class="row">  
                                                        <div class="col">
                                                            <img src="../img/outline_view_day_black_18dp.png">
                                                            <span class="ml-2 font-weight-bold">No hay actividad</span>
                                                        </div>
                                                    </div>                                                        
                                                    <%} else {%>
                                                    <div class="row">  
                                                        <div class="col">
                                                            <img src="../img/outline_view_day_black_18dp.png">
                                                            <span class="ml-2 font-weight-bold">Actividad</span>
                                                        </div>
                                                    </div>
                                                    <%}%>


                                                    <% for (int c = comentarios.size()-1; c >= 0; c--) {%>


                                                        <%
                                                            Usuario usuario = new Usuario();
                                                            UsuarioWS.UsuarioWS_Service service = new UsuarioWS.UsuarioWS_Service();
                                                            UsuarioWS.UsuarioWS port = service.getUsuarioWSPort();
                                                             // TODO initialize WS operation arguments here
                                                            int usuarioComentario = comentarios.get(c).getIdUsuario();
                                                            // TODO process result here
                                                            usuario = port.seleccionarUsuario(usuarioComentario);
  
                                                        %>
 
                                                    
                                                    <div id="comentarios<%= actividades.get(a).getId()%>">
                                                        <div class="row mt-4">

                                                            <div class="col-1.5">
                                                                <span title="<%= usuarios.get(comentarios.get(c).getIdUsuario()).getNombre()%>"
                                                                      style="height: 30px;
                                                                      cursor: pointer;
                                                                      width: 30px;
                                                                      display: table-cell;
                                                                      text-align: center;
                                                                      font-size:15px;
                                                                      vertical-align: middle;
                                                                      border-radius: 50%;
                                                                      background: #3973AC;
                                                                      color: #FFFFFF;"><%= usuario.getNombre().split(" ")[0].charAt(0) + ""
                                                                          + usuario.getNombre().split(" ")[1].charAt(0)%>
                                                                </span>
                                                            </div> 

                                                            <div class="col">

                                                                <span><%= usuario.getNombre()%></span>
                                                                <span><small style="color:gray"><%= comentarios.get(c).getFecha()%></small></span><br>
                                                                <span><%= comentarios.get(c).getDescripcion()%></span>
                                                            </div>
                                                        </div><hr></div>

                                                    <%}%>


                                                </div>


                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>

                            <%}%>





                            <div class="col-12 mt-2">
                                <button data-toggle="modal" data-target="#agregarActividad<%= modulos.get(m).getId()%>" type="button" style="font-size: 1em; cursor: pointer; 
                                        border:none; border-radius: 20px; background-color: #D9DFE1; width: 100%; height: 100px;">
                                    <p style="font-weight: bold; ">Agregar Actividad</p>
                                </button>

                                <!-- Modal -->
                                <div class="modal fade" id="agregarActividad<%= modulos.get(m).getId()%>" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel">Crear actividad en <%= modulos.get(m).getNombre()%></h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>

                                            <div class="modal-body">

                                                <div class="form-group">
                                                    <label for="titulocrearactividad<%= modulos.get(m).getId()%>">Titulo de la actividad</label>
                                                    <input type="text" id="titulocrearactividad<%= modulos.get(m).getId()%>" 
                                                           name="titulocrearactividad" class="form-control" required>
                                                </div>
                                                <div class="form-group">
                                                    <label for="descripcioncrearactividad<%= modulos.get(m).getId()%>">Descripcion de la actividad</label>
                                                    <input type="text" id="descripcioncrearactividad<%= modulos.get(m).getId()%>" 
                                                           name="descripcioncrearactividad" class="form-control" required>
                                                </div>
                                                <div class="form-group">
                                                    <label for="vencimientocrearactividad<%= modulos.get(m).getId()%>">Vencimiento</label>
                                                    <input type="date" id="vencimientocrearactividad<%= modulos.get(m).getId()%>" 
                                                           name="vencimientocrearactividad" class="form-control" required>
                                                </div>
                                                <div class="form-group">
                                                    <button type="submit" class="btn btn-primary" 
                                                            class="form-control" onclick="crearActividad(<%= modulos.get(m).getId()%>)" 
                                                            data-dismiss="modal">Crear Actividad</button>
                                                </div>
                                            </div>

                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
                <%}%>




            </div>                     
        </div>

    </body>
</html>
