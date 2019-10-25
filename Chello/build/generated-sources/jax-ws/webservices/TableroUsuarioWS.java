
package webservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "tableroUsuarioWS", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TableroUsuarioWS {


    /**
     * 
     * @param idTablero
     * @param idUsuario
     * @param rol
     * @return
     *     returns int
     */
    @WebMethod(operationName = "CrearTableroUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CrearTableroUsuario", targetNamespace = "http://webservices/", className = "webservices.CrearTableroUsuario")
    @ResponseWrapper(localName = "CrearTableroUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.CrearTableroUsuarioResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/CrearTableroUsuarioRequest", output = "http://webservices/tableroUsuarioWS/CrearTableroUsuarioResponse")
    public int crearTableroUsuario(
        @WebParam(name = "idTablero", targetNamespace = "")
        int idTablero,
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario,
        @WebParam(name = "rol", targetNamespace = "")
        String rol);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EliminarTableroUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarTableroUsuario", targetNamespace = "http://webservices/", className = "webservices.EliminarTableroUsuario")
    @ResponseWrapper(localName = "EliminarTableroUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.EliminarTableroUsuarioResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/EliminarTableroUsuarioRequest", output = "http://webservices/tableroUsuarioWS/EliminarTableroUsuarioResponse")
    public boolean eliminarTableroUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param idTablero
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EliminarTableroUsuarios")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EliminarTableroUsuarios", targetNamespace = "http://webservices/", className = "webservices.EliminarTableroUsuarios")
    @ResponseWrapper(localName = "EliminarTableroUsuariosResponse", targetNamespace = "http://webservices/", className = "webservices.EliminarTableroUsuariosResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/EliminarTableroUsuariosRequest", output = "http://webservices/tableroUsuarioWS/EliminarTableroUsuariosResponse")
    public boolean eliminarTableroUsuarios(
        @WebParam(name = "idTablero", targetNamespace = "")
        int idTablero);

    /**
     * 
     * @param id
     * @return
     *     returns webservices.TableroUsuario
     */
    @WebMethod(operationName = "SeleccionarTableroUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SeleccionarTableroUsuario", targetNamespace = "http://webservices/", className = "webservices.SeleccionarTableroUsuario")
    @ResponseWrapper(localName = "SeleccionarTableroUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.SeleccionarTableroUsuarioResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/SeleccionarTableroUsuarioRequest", output = "http://webservices/tableroUsuarioWS/SeleccionarTableroUsuarioResponse")
    public TableroUsuario seleccionarTableroUsuario(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param idUsuario
     * @return
     *     returns java.util.List<webservices.Tablero>
     */
    @WebMethod(operationName = "ObtenerTablerosDeUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ObtenerTablerosDeUsuario", targetNamespace = "http://webservices/", className = "webservices.ObtenerTablerosDeUsuario")
    @ResponseWrapper(localName = "ObtenerTablerosDeUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.ObtenerTablerosDeUsuarioResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/ObtenerTablerosDeUsuarioRequest", output = "http://webservices/tableroUsuarioWS/ObtenerTablerosDeUsuarioResponse")
    public List<Tablero> obtenerTablerosDeUsuario(
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario);

    /**
     * 
     * @param idTablero
     * @return
     *     returns java.util.List<webservices.Usuario>
     */
    @WebMethod(operationName = "ObtenerUsuariosDeTablero")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ObtenerUsuariosDeTablero", targetNamespace = "http://webservices/", className = "webservices.ObtenerUsuariosDeTablero")
    @ResponseWrapper(localName = "ObtenerUsuariosDeTableroResponse", targetNamespace = "http://webservices/", className = "webservices.ObtenerUsuariosDeTableroResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/ObtenerUsuariosDeTableroRequest", output = "http://webservices/tableroUsuarioWS/ObtenerUsuariosDeTableroResponse")
    public List<Usuario> obtenerUsuariosDeTablero(
        @WebParam(name = "idTablero", targetNamespace = "")
        int idTablero);

    /**
     * 
     * @param idTablero
     * @param idUsuario
     * @return
     *     returns int
     */
    @WebMethod(operationName = "SeleccionarIdPorTableroYUsuario")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SeleccionarIdPorTableroYUsuario", targetNamespace = "http://webservices/", className = "webservices.SeleccionarIdPorTableroYUsuario")
    @ResponseWrapper(localName = "SeleccionarIdPorTableroYUsuarioResponse", targetNamespace = "http://webservices/", className = "webservices.SeleccionarIdPorTableroYUsuarioResponse")
    @Action(input = "http://webservices/tableroUsuarioWS/SeleccionarIdPorTableroYUsuarioRequest", output = "http://webservices/tableroUsuarioWS/SeleccionarIdPorTableroYUsuarioResponse")
    public int seleccionarIdPorTableroYUsuario(
        @WebParam(name = "idTablero", targetNamespace = "")
        int idTablero,
        @WebParam(name = "idUsuario", targetNamespace = "")
        int idUsuario);

}
