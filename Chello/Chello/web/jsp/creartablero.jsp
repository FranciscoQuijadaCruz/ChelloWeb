<%@page import="java.util.Date"%>
<%
    
    HttpSession sesion = request.getSession();
    int idTablero=0;
    int idUsuario = Integer.parseInt(sesion.getAttribute("usuario").toString());

    if (sesion.getAttribute("usuario") == null) {
        response.sendRedirect("../login.jsp");
    }
    
    //Se crea el Tablero
    try {
        TableroWS.TableroWS_Service service = new TableroWS.TableroWS_Service();
        TableroWS.TableroWS port = service.getTableroWSPort();
        // TODO initialize WS operation arguments here
        java.lang.String titulo = request.getParameter("titulo");
        // TODO process result here
        idTablero = port.agregarTablero(titulo);

    } catch (Exception ex) {
        out.println(ex);
    }

    
    //Se le asigna el Tablero al Usuario
    try {
	webservices.TableroUsuarioWS_Service service = new webservices.TableroUsuarioWS_Service();
	webservices.TableroUsuarioWS port = service.getTableroUsuarioWSPort();

	// TODO process result here
	int tablerousuario = port.crearTableroUsuario(idTablero, idUsuario, "Administrador");

    } catch (Exception ex) {
	out.println(ex);
    }

    //Se crea la modificacion para el registro en el perfil del usuario
    try {
	ModificacionWS.ModificacionWS_Service service = new ModificacionWS.ModificacionWS_Service();
	ModificacionWS.ModificacionWS port = service.getModificacionWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String descripcion = "Ha creado el tablero";
	java.util.Date fecha2 = new Date();
	java.lang.String fecha = fecha2.toString();

	// TODO process result here
	int modificacion = port.crearModificacion(descripcion, fecha, idTablero, idUsuario);

    } catch (Exception ex) {
	out.println(ex);
    }

    //Se crea el modulo Hecho
    try {
	ModuloWS.ModuloWS_Service service = new ModuloWS.ModuloWS_Service();
	ModuloWS.ModuloWS port = service.getModuloWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = "Hecho";
	// TODO process result here
	int modulo = port.agregarModulo(nombre, idTablero);

    } catch (Exception ex) {
	out.print(ex);
    }
    
    //Se crea el modulo en Proceso
    try {
	ModuloWS.ModuloWS_Service service = new ModuloWS.ModuloWS_Service();
	ModuloWS.ModuloWS port = service.getModuloWSPort();
	 // TODO initialize WS operation arguments here
	java.lang.String nombre = "En Proceso";
	// TODO process result here
	int modulo = port.agregarModulo(nombre, idTablero);
        
        response.sendRedirect("../boards");
        
    } catch (Exception ex) {
	out.print(ex);
    }

%>

