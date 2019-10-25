
package ModificacionWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ModificacionWS package. 
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

    private final static QName _CrearModificacion_QNAME = new QName("http://webservices/", "CrearModificacion");
    private final static QName _CrearModificacionResponse_QNAME = new QName("http://webservices/", "CrearModificacionResponse");
    private final static QName _EliminarModificacion_QNAME = new QName("http://webservices/", "EliminarModificacion");
    private final static QName _EliminarModificacionResponse_QNAME = new QName("http://webservices/", "EliminarModificacionResponse");
    private final static QName _ObtenerModificacionesDeTablero_QNAME = new QName("http://webservices/", "ObtenerModificacionesDeTablero");
    private final static QName _ObtenerModificacionesDeTableroResponse_QNAME = new QName("http://webservices/", "ObtenerModificacionesDeTableroResponse");
    private final static QName _ObtenerModificacionesDeUsuario_QNAME = new QName("http://webservices/", "ObtenerModificacionesDeUsuario");
    private final static QName _ObtenerModificacionesDeUsuarioResponse_QNAME = new QName("http://webservices/", "ObtenerModificacionesDeUsuarioResponse");
    private final static QName _SeleccionarModificacion_QNAME = new QName("http://webservices/", "SeleccionarModificacion");
    private final static QName _SeleccionarModificacionResponse_QNAME = new QName("http://webservices/", "SeleccionarModificacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ModificacionWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearModificacion }
     * 
     */
    public CrearModificacion createCrearModificacion() {
        return new CrearModificacion();
    }

    /**
     * Create an instance of {@link CrearModificacionResponse }
     * 
     */
    public CrearModificacionResponse createCrearModificacionResponse() {
        return new CrearModificacionResponse();
    }

    /**
     * Create an instance of {@link EliminarModificacion }
     * 
     */
    public EliminarModificacion createEliminarModificacion() {
        return new EliminarModificacion();
    }

    /**
     * Create an instance of {@link EliminarModificacionResponse }
     * 
     */
    public EliminarModificacionResponse createEliminarModificacionResponse() {
        return new EliminarModificacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerModificacionesDeTablero }
     * 
     */
    public ObtenerModificacionesDeTablero createObtenerModificacionesDeTablero() {
        return new ObtenerModificacionesDeTablero();
    }

    /**
     * Create an instance of {@link ObtenerModificacionesDeTableroResponse }
     * 
     */
    public ObtenerModificacionesDeTableroResponse createObtenerModificacionesDeTableroResponse() {
        return new ObtenerModificacionesDeTableroResponse();
    }

    /**
     * Create an instance of {@link ObtenerModificacionesDeUsuario }
     * 
     */
    public ObtenerModificacionesDeUsuario createObtenerModificacionesDeUsuario() {
        return new ObtenerModificacionesDeUsuario();
    }

    /**
     * Create an instance of {@link ObtenerModificacionesDeUsuarioResponse }
     * 
     */
    public ObtenerModificacionesDeUsuarioResponse createObtenerModificacionesDeUsuarioResponse() {
        return new ObtenerModificacionesDeUsuarioResponse();
    }

    /**
     * Create an instance of {@link SeleccionarModificacion }
     * 
     */
    public SeleccionarModificacion createSeleccionarModificacion() {
        return new SeleccionarModificacion();
    }

    /**
     * Create an instance of {@link SeleccionarModificacionResponse }
     * 
     */
    public SeleccionarModificacionResponse createSeleccionarModificacionResponse() {
        return new SeleccionarModificacionResponse();
    }

    /**
     * Create an instance of {@link Modificacion }
     * 
     */
    public Modificacion createModificacion() {
        return new Modificacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearModificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearModificacion")
    public JAXBElement<CrearModificacion> createCrearModificacion(CrearModificacion value) {
        return new JAXBElement<CrearModificacion>(_CrearModificacion_QNAME, CrearModificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearModificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearModificacionResponse")
    public JAXBElement<CrearModificacionResponse> createCrearModificacionResponse(CrearModificacionResponse value) {
        return new JAXBElement<CrearModificacionResponse>(_CrearModificacionResponse_QNAME, CrearModificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModificacion")
    public JAXBElement<EliminarModificacion> createEliminarModificacion(EliminarModificacion value) {
        return new JAXBElement<EliminarModificacion>(_EliminarModificacion_QNAME, EliminarModificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModificacionResponse")
    public JAXBElement<EliminarModificacionResponse> createEliminarModificacionResponse(EliminarModificacionResponse value) {
        return new JAXBElement<EliminarModificacionResponse>(_EliminarModificacionResponse_QNAME, EliminarModificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModificacionesDeTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModificacionesDeTablero")
    public JAXBElement<ObtenerModificacionesDeTablero> createObtenerModificacionesDeTablero(ObtenerModificacionesDeTablero value) {
        return new JAXBElement<ObtenerModificacionesDeTablero>(_ObtenerModificacionesDeTablero_QNAME, ObtenerModificacionesDeTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModificacionesDeTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModificacionesDeTableroResponse")
    public JAXBElement<ObtenerModificacionesDeTableroResponse> createObtenerModificacionesDeTableroResponse(ObtenerModificacionesDeTableroResponse value) {
        return new JAXBElement<ObtenerModificacionesDeTableroResponse>(_ObtenerModificacionesDeTableroResponse_QNAME, ObtenerModificacionesDeTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModificacionesDeUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModificacionesDeUsuario")
    public JAXBElement<ObtenerModificacionesDeUsuario> createObtenerModificacionesDeUsuario(ObtenerModificacionesDeUsuario value) {
        return new JAXBElement<ObtenerModificacionesDeUsuario>(_ObtenerModificacionesDeUsuario_QNAME, ObtenerModificacionesDeUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModificacionesDeUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModificacionesDeUsuarioResponse")
    public JAXBElement<ObtenerModificacionesDeUsuarioResponse> createObtenerModificacionesDeUsuarioResponse(ObtenerModificacionesDeUsuarioResponse value) {
        return new JAXBElement<ObtenerModificacionesDeUsuarioResponse>(_ObtenerModificacionesDeUsuarioResponse_QNAME, ObtenerModificacionesDeUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarModificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarModificacion")
    public JAXBElement<SeleccionarModificacion> createSeleccionarModificacion(SeleccionarModificacion value) {
        return new JAXBElement<SeleccionarModificacion>(_SeleccionarModificacion_QNAME, SeleccionarModificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarModificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarModificacionResponse")
    public JAXBElement<SeleccionarModificacionResponse> createSeleccionarModificacionResponse(SeleccionarModificacionResponse value) {
        return new JAXBElement<SeleccionarModificacionResponse>(_SeleccionarModificacionResponse_QNAME, SeleccionarModificacionResponse.class, null, value);
    }

}
