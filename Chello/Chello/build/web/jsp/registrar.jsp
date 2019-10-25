<%
    HttpSession sesion = request.getSession();
    try {
	UsuarioWS.UsuarioWS_Service service = new UsuarioWS.UsuarioWS_Service();
	UsuarioWS.UsuarioWS port = service.getUsuarioWSPort();

	// TODO process result here
	int idUsuario = port.agregarUsuario(request.getParameter("name"),request.getParameter("email"),
        request.getParameter("password"));
        
        if(idUsuario!=0){
            sesion.setAttribute("usuario", idUsuario);
            response.sendRedirect("../boards");
        }else{
            response.sendRedirect("../signup.jsp");
        }

    } catch (Exception ex) {
	out.print(ex);
    }
%>
 