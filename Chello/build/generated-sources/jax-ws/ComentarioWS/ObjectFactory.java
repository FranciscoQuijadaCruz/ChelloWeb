
package ComentarioWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ComentarioWS package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearComentario_QNAME = new QName("http://webservices/", "CrearComentario");
    private final static QName _CrearComentarioResponse_QNAME = new QName("http://webservices/", "CrearComentarioResponse");
    private final static QName _EliminarComentario_QNAME = new QName("http://webservices/", "EliminarComentario");
    private final static QName _EliminarComentarioResponse_QNAME = new QName("http://webservices/", "EliminarComentarioResponse");
    private final static QName _ObtenerComentariosDeActividad_QNAME = new QName("http://webservices/", "ObtenerComentariosDeActividad");
    private final static QName _ObtenerComentariosDeActividadResponse_QNAME = new QName("http://webservices/", "ObtenerComentariosDeActividadResponse");
    private final static QName _ObtenerComentariosDeUsuario_QNAME = new QName("http://webservices/", "ObtenerComentariosDeUsuario");
    private final static QName _ObtenerComentariosDeUsuarioResponse_QNAME = new QName("http://webservices/", "ObtenerComentariosDeUsuarioResponse");
    private final static QName _SeleccionarComentario_QNAME = new QName("http://webservices/", "SeleccionarComentario");
    private final static QName _SeleccionarComentarioResponse_QNAME = new QName("http://webservices/", "SeleccionarComentarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ComentarioWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearComentario }
     * 
     */
    public CrearComentario createCrearComentario() {
        return new CrearComentario();
    }

    /**
     * Create an instance of {@link CrearComentarioResponse }
     * 
     */
    public CrearComentarioResponse createCrearComentarioResponse() {
        return new CrearComentarioResponse();
    }

    /**
     * Create an instance of {@link EliminarComentario }
     * 
     */
    public EliminarComentario createEliminarComentario() {
        return new EliminarComentario();
    }

    /**
     * Create an instance of {@link EliminarComentarioResponse }
     * 
     */
    public EliminarComentarioResponse createEliminarComentarioResponse() {
        return new EliminarComentarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerComentariosDeActividad }
     * 
     */
    public ObtenerComentariosDeActividad createObtenerComentariosDeActividad() {
        return new ObtenerComentariosDeActividad();
    }

    /**
     * Create an instance of {@link ObtenerComentariosDeActividadResponse }
     * 
     */
    public ObtenerComentariosDeActividadResponse createObtenerComentariosDeActividadResponse() {
        return new ObtenerComentariosDeActividadResponse();
    }

    /**
     * Create an instance of {@link ObtenerComentariosDeUsuario }
     * 
     */
    public ObtenerComentariosDeUsuario createObtenerComentariosDeUsuario() {
        return new ObtenerComentariosDeUsuario();
    }

    /**
     * Create an instance of {@link ObtenerComentariosDeUsuarioResponse }
     * 
     */
    public ObtenerComentariosDeUsuarioResponse createObtenerComentariosDeUsuarioResponse() {
        return new ObtenerComentariosDeUsuarioResponse();
    }

    /**
     * Create an instance of {@link SeleccionarComentario }
     * 
     */
    public SeleccionarComentario createSeleccionarComentario() {
        return new SeleccionarComentario();
    }

    /**
     * Create an instance of {@link SeleccionarComentarioResponse }
     * 
     */
    public SeleccionarComentarioResponse createSeleccionarComentarioResponse() {
        return new SeleccionarComentarioResponse();
    }

    /**
     * Create an instance of {@link Comentario }
     * 
     */
    public Comentario createComentario() {
        return new Comentario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearComentario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearComentario")
    public JAXBElement<CrearComentario> createCrearComentario(CrearComentario value) {
        return new JAXBElement<CrearComentario>(_CrearComentario_QNAME, CrearComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearComentarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearComentarioResponse")
    public JAXBElement<CrearComentarioResponse> createCrearComentarioResponse(CrearComentarioResponse value) {
        return new JAXBElement<CrearComentarioResponse>(_CrearComentarioResponse_QNAME, CrearComentarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarComentario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarComentario")
    public JAXBElement<EliminarComentario> createEliminarComentario(EliminarComentario value) {
        return new JAXBElement<EliminarComentario>(_EliminarComentario_QNAME, EliminarComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarComentarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarComentarioResponse")
    public JAXBElement<EliminarComentarioResponse> createEliminarComentarioResponse(EliminarComentarioResponse value) {
        return new JAXBElement<EliminarComentarioResponse>(_EliminarComentarioResponse_QNAME, EliminarComentarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerComentariosDeActividad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerComentariosDeActividad")
    public JAXBElement<ObtenerComentariosDeActividad> createObtenerComentariosDeActividad(ObtenerComentariosDeActividad value) {
        return new JAXBElement<ObtenerComentariosDeActividad>(_ObtenerComentariosDeActividad_QNAME, ObtenerComentariosDeActividad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerComentariosDeActividadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerComentariosDeActividadResponse")
    public JAXBElement<ObtenerComentariosDeActividadResponse> createObtenerComentariosDeActividadResponse(ObtenerComentariosDeActividadResponse value) {
        return new JAXBElement<ObtenerComentariosDeActividadResponse>(_ObtenerComentariosDeActividadResponse_QNAME, ObtenerComentariosDeActividadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerComentariosDeUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerComentariosDeUsuario")
    public JAXBElement<ObtenerComentariosDeUsuario> createObtenerComentariosDeUsuario(ObtenerComentariosDeUsuario value) {
        return new JAXBElement<ObtenerComentariosDeUsuario>(_ObtenerComentariosDeUsuario_QNAME, ObtenerComentariosDeUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerComentariosDeUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerComentariosDeUsuarioResponse")
    public JAXBElement<ObtenerComentariosDeUsuarioResponse> createObtenerComentariosDeUsuarioResponse(ObtenerComentariosDeUsuarioResponse value) {
        return new JAXBElement<ObtenerComentariosDeUsuarioResponse>(_ObtenerComentariosDeUsuarioResponse_QNAME, ObtenerComentariosDeUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarComentario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarComentario")
    public JAXBElement<SeleccionarComentario> createSeleccionarComentario(SeleccionarComentario value) {
        return new JAXBElement<SeleccionarComentario>(_SeleccionarComentario_QNAME, SeleccionarComentario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarComentarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarComentarioResponse")
    public JAXBElement<SeleccionarComentarioResponse> createSeleccionarComentarioResponse(SeleccionarComentarioResponse value) {
        return new JAXBElement<SeleccionarComentarioResponse>(_SeleccionarComentarioResponse_QNAME, SeleccionarComentarioResponse.class, null, value);
    }

}
