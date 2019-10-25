
package webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservices package. 
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

    private final static QName _CrearTableroUsuario_QNAME = new QName("http://webservices/", "CrearTableroUsuario");
    private final static QName _CrearTableroUsuarioResponse_QNAME = new QName("http://webservices/", "CrearTableroUsuarioResponse");
    private final static QName _EliminarTableroUsuario_QNAME = new QName("http://webservices/", "EliminarTableroUsuario");
    private final static QName _EliminarTableroUsuarioResponse_QNAME = new QName("http://webservices/", "EliminarTableroUsuarioResponse");
    private final static QName _EliminarTableroUsuarios_QNAME = new QName("http://webservices/", "EliminarTableroUsuarios");
    private final static QName _EliminarTableroUsuariosResponse_QNAME = new QName("http://webservices/", "EliminarTableroUsuariosResponse");
    private final static QName _ObtenerTablerosDeUsuario_QNAME = new QName("http://webservices/", "ObtenerTablerosDeUsuario");
    private final static QName _ObtenerTablerosDeUsuarioResponse_QNAME = new QName("http://webservices/", "ObtenerTablerosDeUsuarioResponse");
    private final static QName _ObtenerUsuariosDeTablero_QNAME = new QName("http://webservices/", "ObtenerUsuariosDeTablero");
    private final static QName _ObtenerUsuariosDeTableroResponse_QNAME = new QName("http://webservices/", "ObtenerUsuariosDeTableroResponse");
    private final static QName _SeleccionarIdPorTableroYUsuario_QNAME = new QName("http://webservices/", "SeleccionarIdPorTableroYUsuario");
    private final static QName _SeleccionarIdPorTableroYUsuarioResponse_QNAME = new QName("http://webservices/", "SeleccionarIdPorTableroYUsuarioResponse");
    private final static QName _SeleccionarTableroUsuario_QNAME = new QName("http://webservices/", "SeleccionarTableroUsuario");
    private final static QName _SeleccionarTableroUsuarioResponse_QNAME = new QName("http://webservices/", "SeleccionarTableroUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearTableroUsuario }
     * 
     */
    public CrearTableroUsuario createCrearTableroUsuario() {
        return new CrearTableroUsuario();
    }

    /**
     * Create an instance of {@link CrearTableroUsuarioResponse }
     * 
     */
    public CrearTableroUsuarioResponse createCrearTableroUsuarioResponse() {
        return new CrearTableroUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarTableroUsuario }
     * 
     */
    public EliminarTableroUsuario createEliminarTableroUsuario() {
        return new EliminarTableroUsuario();
    }

    /**
     * Create an instance of {@link EliminarTableroUsuarioResponse }
     * 
     */
    public EliminarTableroUsuarioResponse createEliminarTableroUsuarioResponse() {
        return new EliminarTableroUsuarioResponse();
    }

    /**
     * Create an instance of {@link EliminarTableroUsuarios }
     * 
     */
    public EliminarTableroUsuarios createEliminarTableroUsuarios() {
        return new EliminarTableroUsuarios();
    }

    /**
     * Create an instance of {@link EliminarTableroUsuariosResponse }
     * 
     */
    public EliminarTableroUsuariosResponse createEliminarTableroUsuariosResponse() {
        return new EliminarTableroUsuariosResponse();
    }

    /**
     * Create an instance of {@link ObtenerTablerosDeUsuario }
     * 
     */
    public ObtenerTablerosDeUsuario createObtenerTablerosDeUsuario() {
        return new ObtenerTablerosDeUsuario();
    }

    /**
     * Create an instance of {@link ObtenerTablerosDeUsuarioResponse }
     * 
     */
    public ObtenerTablerosDeUsuarioResponse createObtenerTablerosDeUsuarioResponse() {
        return new ObtenerTablerosDeUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuariosDeTablero }
     * 
     */
    public ObtenerUsuariosDeTablero createObtenerUsuariosDeTablero() {
        return new ObtenerUsuariosDeTablero();
    }

    /**
     * Create an instance of {@link ObtenerUsuariosDeTableroResponse }
     * 
     */
    public ObtenerUsuariosDeTableroResponse createObtenerUsuariosDeTableroResponse() {
        return new ObtenerUsuariosDeTableroResponse();
    }

    /**
     * Create an instance of {@link SeleccionarIdPorTableroYUsuario }
     * 
     */
    public SeleccionarIdPorTableroYUsuario createSeleccionarIdPorTableroYUsuario() {
        return new SeleccionarIdPorTableroYUsuario();
    }

    /**
     * Create an instance of {@link SeleccionarIdPorTableroYUsuarioResponse }
     * 
     */
    public SeleccionarIdPorTableroYUsuarioResponse createSeleccionarIdPorTableroYUsuarioResponse() {
        return new SeleccionarIdPorTableroYUsuarioResponse();
    }

    /**
     * Create an instance of {@link SeleccionarTableroUsuario }
     * 
     */
    public SeleccionarTableroUsuario createSeleccionarTableroUsuario() {
        return new SeleccionarTableroUsuario();
    }

    /**
     * Create an instance of {@link SeleccionarTableroUsuarioResponse }
     * 
     */
    public SeleccionarTableroUsuarioResponse createSeleccionarTableroUsuarioResponse() {
        return new SeleccionarTableroUsuarioResponse();
    }

    /**
     * Create an instance of {@link TableroUsuario }
     * 
     */
    public TableroUsuario createTableroUsuario() {
        return new TableroUsuario();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Tablero }
     * 
     */
    public Tablero createTablero() {
        return new Tablero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTableroUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearTableroUsuario")
    public JAXBElement<CrearTableroUsuario> createCrearTableroUsuario(CrearTableroUsuario value) {
        return new JAXBElement<CrearTableroUsuario>(_CrearTableroUsuario_QNAME, CrearTableroUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTableroUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "CrearTableroUsuarioResponse")
    public JAXBElement<CrearTableroUsuarioResponse> createCrearTableroUsuarioResponse(CrearTableroUsuarioResponse value) {
        return new JAXBElement<CrearTableroUsuarioResponse>(_CrearTableroUsuarioResponse_QNAME, CrearTableroUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTableroUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTableroUsuario")
    public JAXBElement<EliminarTableroUsuario> createEliminarTableroUsuario(EliminarTableroUsuario value) {
        return new JAXBElement<EliminarTableroUsuario>(_EliminarTableroUsuario_QNAME, EliminarTableroUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTableroUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTableroUsuarioResponse")
    public JAXBElement<EliminarTableroUsuarioResponse> createEliminarTableroUsuarioResponse(EliminarTableroUsuarioResponse value) {
        return new JAXBElement<EliminarTableroUsuarioResponse>(_EliminarTableroUsuarioResponse_QNAME, EliminarTableroUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTableroUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTableroUsuarios")
    public JAXBElement<EliminarTableroUsuarios> createEliminarTableroUsuarios(EliminarTableroUsuarios value) {
        return new JAXBElement<EliminarTableroUsuarios>(_EliminarTableroUsuarios_QNAME, EliminarTableroUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTableroUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTableroUsuariosResponse")
    public JAXBElement<EliminarTableroUsuariosResponse> createEliminarTableroUsuariosResponse(EliminarTableroUsuariosResponse value) {
        return new JAXBElement<EliminarTableroUsuariosResponse>(_EliminarTableroUsuariosResponse_QNAME, EliminarTableroUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTablerosDeUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerTablerosDeUsuario")
    public JAXBElement<ObtenerTablerosDeUsuario> createObtenerTablerosDeUsuario(ObtenerTablerosDeUsuario value) {
        return new JAXBElement<ObtenerTablerosDeUsuario>(_ObtenerTablerosDeUsuario_QNAME, ObtenerTablerosDeUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTablerosDeUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerTablerosDeUsuarioResponse")
    public JAXBElement<ObtenerTablerosDeUsuarioResponse> createObtenerTablerosDeUsuarioResponse(ObtenerTablerosDeUsuarioResponse value) {
        return new JAXBElement<ObtenerTablerosDeUsuarioResponse>(_ObtenerTablerosDeUsuarioResponse_QNAME, ObtenerTablerosDeUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuariosDeTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerUsuariosDeTablero")
    public JAXBElement<ObtenerUsuariosDeTablero> createObtenerUsuariosDeTablero(ObtenerUsuariosDeTablero value) {
        return new JAXBElement<ObtenerUsuariosDeTablero>(_ObtenerUsuariosDeTablero_QNAME, ObtenerUsuariosDeTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuariosDeTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerUsuariosDeTableroResponse")
    public JAXBElement<ObtenerUsuariosDeTableroResponse> createObtenerUsuariosDeTableroResponse(ObtenerUsuariosDeTableroResponse value) {
        return new JAXBElement<ObtenerUsuariosDeTableroResponse>(_ObtenerUsuariosDeTableroResponse_QNAME, ObtenerUsuariosDeTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarIdPorTableroYUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarIdPorTableroYUsuario")
    public JAXBElement<SeleccionarIdPorTableroYUsuario> createSeleccionarIdPorTableroYUsuario(SeleccionarIdPorTableroYUsuario value) {
        return new JAXBElement<SeleccionarIdPorTableroYUsuario>(_SeleccionarIdPorTableroYUsuario_QNAME, SeleccionarIdPorTableroYUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarIdPorTableroYUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarIdPorTableroYUsuarioResponse")
    public JAXBElement<SeleccionarIdPorTableroYUsuarioResponse> createSeleccionarIdPorTableroYUsuarioResponse(SeleccionarIdPorTableroYUsuarioResponse value) {
        return new JAXBElement<SeleccionarIdPorTableroYUsuarioResponse>(_SeleccionarIdPorTableroYUsuarioResponse_QNAME, SeleccionarIdPorTableroYUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTableroUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarTableroUsuario")
    public JAXBElement<SeleccionarTableroUsuario> createSeleccionarTableroUsuario(SeleccionarTableroUsuario value) {
        return new JAXBElement<SeleccionarTableroUsuario>(_SeleccionarTableroUsuario_QNAME, SeleccionarTableroUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTableroUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarTableroUsuarioResponse")
    public JAXBElement<SeleccionarTableroUsuarioResponse> createSeleccionarTableroUsuarioResponse(SeleccionarTableroUsuarioResponse value) {
        return new JAXBElement<SeleccionarTableroUsuarioResponse>(_SeleccionarTableroUsuarioResponse_QNAME, SeleccionarTableroUsuarioResponse.class, null, value);
    }

}
