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
        <link href="../css/style.css" rel="stylesheet" type="text/css"/>
        <script src="../js/sweetalert2.all.min.js" type="text/javascript"></script>
    </head>
    <body style="background-color: #F0F0F0" id="pizarra">


        <nav class="navbar navbar-dark contenedor_nav" id="navbarid" style="background-color: #3973ac; color: white; ">

            <a class="navbar-brand" href="index.jsp">
                <img src="../img/trello-logo-blue.png" alt="" style="width: 110px;height: 30px;"/>
            </a>

            

            <div class="dropdown" >
                <a  class="dropdown-item salir" href="">Cerrar sesión</a>
                
            </div>
            <style>
                .dropdown-menu a{
                    font-size: 15px; color: #758280; margin-right: 50%;
                }
            </style>
        </nav>
        
        
        <div class="container mt-3 margin_total">
            <div class="row" >
                <div style="width: 100px;"class="col-sm contenedor_aside" >
                    <h5 class="text-left">
                        <img src="../img/outline_view_day_black_18dp.png" alt=""/>
                       
                        <a class="dropdown-item salir"  href="">Home <span class="sr-only">(current)</span></a>
                        <a class="dropdown-item salir" href="../profile">Perfil</a>
                        <a class="dropdown-item salir" href="#">Configuración</a>
                        <a class="dropdown-item salir" href="#">Ayuda</a>
                        
                </div>
                <div class="mt-2 col-sm-9 ">
                    <h5 style="color:#777C7D; font-weight: bold; margin-top: 10px; font-size: 25px; margin-left: 2px;" id="tableroTitulo"><%=t.getTitulo()%></h5>
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
                                                       
                    <div class="row mt-3" style="position: relative;">
                <%for (int m = modulos.size() - 1; m >= 0; m--) {%>
                <div class="col-xs-12 col-md-6 col-lg-3 mt-3" style="">
                    <button  type="button" style="font-size: 1em; cursor: pointer; color:white; 
                             border:none; border-radius: 8px; background-color: #3973AC; width: 100%; height: 85px;
                     box-shadow: 5px 5px #CFCFCF;">
                        <p style="font-weight: 600; margin-top: 12px; font-size: 20px;"><%= modulos.get(m).getNombre()%></p>
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
                                        border:none; border-radius: 8px; background-color: #00B2A5; width: 100%; height: 80px; 
                     box-shadow: 5px 5px #CFCFCF;">
                                    <p style="font-weight: 600; margin-top: 12px; font-size: 17px;" id="tarjeta<%=actividades.get(a).getId()%>"><%= actividades.get(a).getTitulo()%></p>
                                </button>

                                

                            </div>

                            <%}%>





                            <div class="col-12 mt-2">
                                <button data-toggle="modal" data-target="#agregarActividad<%= modulos.get(m).getId()%>" type="button" style="font-size: 1em; cursor: pointer; 
                                        border:none; border-radius: 8px; background-color: #D4D9DB; width: 100%; height: 70px; 
                     box-shadow: 5px 5px #CFCFCF;">
                                    <p style="font-weight: 600; margin-top: 12px; color:#777C7D; ">Agregar Actividad</p>
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
            </div>

                                
        </div>

    </body>
</html>
