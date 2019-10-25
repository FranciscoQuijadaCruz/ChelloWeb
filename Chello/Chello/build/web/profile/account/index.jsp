<%@page import="UsuarioWS.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    HttpSession sesion = request.getSession();
    Usuario u = new Usuario();
    
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

%>
<html>
    <head>
        <title>Chello-Profile</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" 
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
              rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <script>
            function modificarNombre() {

                var nombre = $("#name").val();

                $.ajax({

                    type: "GET",
                    dataType: "json",
                    url: "../../jsp/cambiarnombre.jsp" +"?name="+nombre,
                    
                    success: function () {
                        $("#nombre-p").html(nombre);
                    },
                    error: function () {
                        $("#nombre-p").html(nombre);
                }

            });
        }
        </script>
        
        <script>
            function modificarCorreo() {

                var correo = $("#email").val();

                $.ajax({

                    type: "GET",
                    dataType: "json",
                    url: "../../jsp/cambiaremail.jsp" +"?email="+correo,
                    
                    success: function () {
                        $("#correo-p").html(correo);
 
                    },
                    error: function (err) {
                        $("#correo-p").html(correo);
                        console.log(err);
                }

            });
        }
        </script>
        
        <script>
            function modificarContrasena(){
                var contrasenaIntroducida = $("#password").val();
                var contrasenaIntroducida2 = $("#password2").val();
                
                var contrasenaActual = "<%= u.getContrasena()%>";
                
                if(contrasenaIntroducida===contrasenaActual){
                    $.ajax({

                    type: "GET",
                    dataType: "json",
                    url: "../../jsp/cambiarcontra.jsp" +"?password="+contrasenaIntroducida2,
                    
                    success: function () {
                        location.href ="?pc=yes";
                    },
                    error: function () {
                        $("#pc").html("<div class='col-8' style='float: none;margin: 0 auto;'><div class='alert alert-success' role='alert'>Los cambios han sido guardados correctamente</div></div>");
                }

            });
                }else{
                    $("#mensaje-c").html("<small style='color:red;'>La contrasena no coincide</small>");
                }
            }
        </script>
    </head>
    
    <body style="background-color: #fcfcfc;">
        
        <nav class="navbar navbar-dark" style="background-color: #3973ac; color: white; padding-top: 20px;">

            <a class="navbar-brand" href="../../boards">
                <img src="../../img/baseline_home_black_18dp.png" alt=""/>
            </a>

            <a class="navbar-brand mask flex-center rgba-blue-light" href="../../boards">
                <img src="../../img/trello-logo-blue.png" alt="" style="width: 110px;height: 30px;"/>
            </a>

            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <img src="../../img/outline_account_box_white_18dp.png" alt=""/>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="../../boards">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="">Perfil</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Configuración</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Ayuda</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../../SSalir">Cerrar sesión</a>
                    </li>
                </ul>
            </div>
        </nav>
        
        <div class="container" style="padding-top: 30px">
            
            <div class="row" id="pc">
                
            </div>
            
            <div class="row">

                <div class="col-7" style="float: none;margin: 0 auto;">
                    <div classa="container">
                        <div class="row">
                            <center>
                            <div>
                                <h3 id="nombre-p" style="color: #17394d;font-family: Helvetica 
                                    Neue,Arial,Helvetica,sans-serif;line-height: 20px;
                                    font-weight: 400; width: 700px; margin-top: 10%"  ><%= u.getNombre()%></h3>
                                    <p id="correo-p" style="color:gray"><%= u.getEmail()%></p>
                            </div>
                            </center>
                        </div>
                    </div>
                </div>

            </div>
        </div>


        <nav style="position: absolute;left: 50%;transform: translatex(-50%);"class="navbar navbar-expand-lg navbar-light bg-light">

            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="navbar-brand" href="">Configuración</a>
                    </li>
                </ul>
            </div>
        </nav>

        <img src="../../img/outline_account_box_white_18dp.png" alt=""/>

        <div class="container " style="color: #17394d;font-family: Helvetica Neue,Arial,Helvetica,sans-serif; padding-top: 50px">
            <div class="row">
                <div class="col-8" style="float: none;margin: 0 auto;">
                    <p class="font-weight-bold">Detalles de la cuenta</p><hr>

                    <u>
                        <!-- Button trigger modal -->
                        <p style="cursor:pointer;" data-toggle="modal" data-target="#exampleModalLong">Cambiar Nombre</p>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Cambiar Nombre</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                            <div class="form-group">
                                                <label for="name">Nombre Completo</label>
                                                <input type="text"  class="form-control" name="name" id="name" value="<% out.print(u.getNombre()); %>">
                                                <small style="color:gray">Se utilizarán sus iniciales en lugar de su avatar
                                                    si no ha establecido uno. Los nombres de usuario
                                                    necesitan un mínimo de tres caracteres, solamente
                                                    se admiten caracteres alfanuméricos.
                                                </small>
                                            </div>
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-primary" onclick="modificarNombre()" data-dismiss="modal">Guardar Cambios</button>
                                            </div>  
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </u>

                    <u>
                        <!-- Button trigger modal -->
                        <p style="cursor:pointer;" data-toggle="modal" data-target="#exampleModalLong2">Cambiar Contrasena</p>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModalLong2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Cambiar Contrasena</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                            <div class="form-group">
                                                <label for="password">Contrasena Actual</label>
                                                <input type="password" class="form-control" name="password" 
                                                id="password">
                                                <div id="mensaje-c"></div>
                                            </div>
                                            <div class="form-group">
                                                <label for="password2">Nueva Contrasena</label>
                                                <input type="password" class="form-control" name="password2" 
                                                id="password2">
                                            </div>
                                            
                                    </div>
                                    
                                    <div class="modal-footer">
                                        <button type="submit" class="btn btn-primary" onclick="modificarContrasena()" 
                                        data-dismiss="modal">Guardar Cambios</button>
                                    <button type="button" class="btn btn-secondary">Cancelar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </u>
                    
                    
                    <u>
                        <!-- Button trigger modal -->
                        <p style="cursor:pointer;" data-toggle="modal" data-target="#exampleModalLong3">Cambiar Correo</p>

                        <!-- Modal -->
                        <div class="modal fade" id="exampleModalLong3" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLongTitle">Cambiar Nombre</h5>
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                    </div>
                                    <div class="modal-body">
                                            <div class="form-group">
                                                <label for="email">Correo Electronico</label>
                                                <input type="email" class="form-control" name="email" 
                                                id="email" value="<% out.print(u.getEmail()); %>">
                                            </div>
                                            <div class="form-group">
                                                <button type="submit" class="btn btn-primary" onclick="modificarCorreo()" data-dismiss="modal">Guardar Cambios</button>
                                            </div>  
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </u>
                </div>
            </div> 
        </div>

        <footer>


        </footer>
    </body>
</html>