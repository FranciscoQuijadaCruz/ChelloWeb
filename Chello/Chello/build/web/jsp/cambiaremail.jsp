<%@page import="UsuarioWS.Usuario"%>
<%

    HttpSession sesion = request.getSession();
    
    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("../login.jsp");
    }
    
    int idUsuario = Integer.parseInt(sesion.getAttribute("usuario").toString());
    Usuario u = new Usuario();
    
    UsuarioWS.UsuarioWS_Service service = new UsuarioWS.UsuarioWS_Service();
    UsuarioWS.UsuarioWS port = service.getUsuarioWSPort();

    // TODO process result here
    u = port.seleccionarUsuario(idUsuario);

    
    UsuarioWS.UsuarioWS_Service service2 = new UsuarioWS.UsuarioWS_Service();
    UsuarioWS.UsuarioWS port2 = service2.getUsuarioWSPort();
    // TODO initialize WS operation arguments here

    java.lang.String nombre = u.getNombre();
    java.lang.String email = request.getParameter("email");
    java.lang.String contrasena = u.getContrasena();
    // TODO process result here
    boolean result2 = port2.editarUsuario(idUsuario, nombre, email, contrasena);

%>
