<%

    HttpSession sesion = request.getSession();

    try {
        UsuarioWS.UsuarioWS_Service service = new UsuarioWS.UsuarioWS_Service();
        UsuarioWS.UsuarioWS port = service.getUsuarioWSPort();
        // TODO initialize WS operation arguments here
        java.lang.String email = request.getParameter("email");
        java.lang.String contra = request.getParameter("password");
        // TODO process result here
        UsuarioWS.Usuario usuario = port.login(email, contra);

        if (usuario.getId() > 0) {

            sesion.setAttribute("usuario", usuario.getId());
            response.sendRedirect("../boards");
        } else {

            response.sendRedirect("../login.jsp");
        }

    } catch (Exception ex) {
        out.print(ex);
    }
%>
