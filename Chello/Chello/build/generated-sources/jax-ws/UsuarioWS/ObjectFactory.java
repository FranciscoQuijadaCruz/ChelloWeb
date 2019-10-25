
package UsuarioWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the UsuarioWS package. 
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

    private final static QName _AgregarUsuario_QNAME = new QName("http://webservices/", "AgregarUsuario");
    private final static QName _AgregarUsuarioResponse_QNAME = new QName("http://webservices/", "AgregarUsuarioResponse");
    private final static QName _EditarUsuario_QNAME = new QName("http://webservices/", "EditarUsuario");
    private final static QName _EditarUsuarioResponse_QNAME = new QName("http://webservices/", "EditarUsuarioResponse");
    private final static QName _Login_QNAME = new QName("http://webservices/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://webservices/", "LoginResponse");
    private final static QName _SeleccionUsuarioPorEmail_QNAME = new QName("http://webservices/", "SeleccionUsuarioPorEmail");
    private final static QName _SeleccionUsuarioPorEmailCoincidencia_QNAME = new QName("http://webservices/", "SeleccionUsuarioPorEmailCoincidencia");
    private final static QName _SeleccionUsuarioPorEmailCoincidenciaResponse_QNAME = new QName("http://webservices/", "SeleccionUsuarioPorEmailCoincidenciaResponse");
    private final static QName _SeleccionUsuarioPorEmailResponse_QNAME = new QName("http://webservices/", "SeleccionUsuarioPorEmailResponse");
    private final static QName _SeleccionarUsuario_QNAME = new QName("http://webservices/", "SeleccionarUsuario");
    private final static QName _SeleccionarUsuarioResponse_QNAME = new QName("http://webservices/", "SeleccionarUsuarioResponse");
    private final static QName _ComprobarExistenciaEmail_QNAME = new QName("http://webservices/", "comprobarExistenciaEmail");
    private final static QName _ComprobarExistenciaEmailResponse_QNAME = new QName("http://webservices/", "comprobarExistenciaEmailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: UsuarioWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarUsuario }
     * 
     */
    public AgregarUsuario createAgregarUsuario() {
        return new AgregarUsuario();
    }

    /**
     * Create an instance of {@link AgregarUsuarioResponse }
     * 
     */
    public AgregarUsuarioResponse createAgregarUsuarioResponse() {
        return new AgregarUsuarioResponse();
    }

    /**
     * Create an instance of {@link EditarUsuario }
     * 
     */
    public EditarUsuario createEditarUsuario() {
        return new EditarUsuario();
    }

    /**
     * Create an instance of {@link EditarUsuarioResponse }
     * 
     */
    public EditarUsuarioResponse createEditarUsuarioResponse() {
        return new EditarUsuarioResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link SeleccionUsuarioPorEmail }
     * 
     */
    public SeleccionUsuarioPorEmail createSeleccionUsuarioPorEmail() {
        return new SeleccionUsuarioPorEmail();
    }

    /**
     * Create an instance of {@link SeleccionUsuarioPorEmailCoincidencia }
     * 
     */
    public SeleccionUsuarioPorEmailCoincidencia createSeleccionUsuarioPorEmailCoincidencia() {
        return new SeleccionUsuarioPorEmailCoincidencia();
    }

    /**
     * Create an instance of {@link SeleccionUsuarioPorEmailCoincidenciaResponse }
     * 
     */
    public SeleccionUsuarioPorEmailCoincidenciaResponse createSeleccionUsuarioPorEmailCoincidenciaResponse() {
        return new SeleccionUsuarioPorEmailCoincidenciaResponse();
    }

    /**
     * Create an instance of {@link SeleccionUsuarioPorEmailResponse }
     * 
     */
    public SeleccionUsuarioPorEmailResponse createSeleccionUsuarioPorEmailResponse() {
        return new SeleccionUsuarioPorEmailResponse();
    }

    /**
     * Create an instance of {@link SeleccionarUsuario }
     * 
     */
    public SeleccionarUsuario createSeleccionarUsuario() {
        return new SeleccionarUsuario();
    }

    /**
     * Create an instance of {@link SeleccionarUsuarioResponse }
     * 
     */
    public SeleccionarUsuarioResponse createSeleccionarUsuarioResponse() {
        return new SeleccionarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ComprobarExistenciaEmail }
     * 
     */
    public ComprobarExistenciaEmail createComprobarExistenciaEmail() {
        return new ComprobarExistenciaEmail();
    }

    /**
     * Create an instance of {@link ComprobarExistenciaEmailResponse }
     * 
     */
    public ComprobarExistenciaEmailResponse createComprobarExistenciaEmailResponse() {
        return new ComprobarExistenciaEmailResponse();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarUsuario")
    public JAXBElement<AgregarUsuario> createAgregarUsuario(AgregarUsuario value) {
        return new JAXBElement<AgregarUsuario>(_AgregarUsuario_QNAME, AgregarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarUsuarioResponse")
    public JAXBElement<AgregarUsuarioResponse> createAgregarUsuarioResponse(AgregarUsuarioResponse value) {
        return new JAXBElement<AgregarUsuarioResponse>(_AgregarUsuarioResponse_QNAME, AgregarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarUsuario")
    public JAXBElement<EditarUsuario> createEditarUsuario(EditarUsuario value) {
        return new JAXBElement<EditarUsuario>(_EditarUsuario_QNAME, EditarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarUsuarioResponse")
    public JAXBElement<EditarUsuarioResponse> createEditarUsuarioResponse(EditarUsuarioResponse value) {
        return new JAXBElement<EditarUsuarioResponse>(_EditarUsuarioResponse_QNAME, EditarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionUsuarioPorEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionUsuarioPorEmail")
    public JAXBElement<SeleccionUsuarioPorEmail> createSeleccionUsuarioPorEmail(SeleccionUsuarioPorEmail value) {
        return new JAXBElement<SeleccionUsuarioPorEmail>(_SeleccionUsuarioPorEmail_QNAME, SeleccionUsuarioPorEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionUsuarioPorEmailCoincidencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionUsuarioPorEmailCoincidencia")
    public JAXBElement<SeleccionUsuarioPorEmailCoincidencia> createSeleccionUsuarioPorEmailCoincidencia(SeleccionUsuarioPorEmailCoincidencia value) {
        return new JAXBElement<SeleccionUsuarioPorEmailCoincidencia>(_SeleccionUsuarioPorEmailCoincidencia_QNAME, SeleccionUsuarioPorEmailCoincidencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionUsuarioPorEmailCoincidenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionUsuarioPorEmailCoincidenciaResponse")
    public JAXBElement<SeleccionUsuarioPorEmailCoincidenciaResponse> createSeleccionUsuarioPorEmailCoincidenciaResponse(SeleccionUsuarioPorEmailCoincidenciaResponse value) {
        return new JAXBElement<SeleccionUsuarioPorEmailCoincidenciaResponse>(_SeleccionUsuarioPorEmailCoincidenciaResponse_QNAME, SeleccionUsuarioPorEmailCoincidenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionUsuarioPorEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionUsuarioPorEmailResponse")
    public JAXBElement<SeleccionUsuarioPorEmailResponse> createSeleccionUsuarioPorEmailResponse(SeleccionUsuarioPorEmailResponse value) {
        return new JAXBElement<SeleccionUsuarioPorEmailResponse>(_SeleccionUsuarioPorEmailResponse_QNAME, SeleccionUsuarioPorEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarUsuario")
    public JAXBElement<SeleccionarUsuario> createSeleccionarUsuario(SeleccionarUsuario value) {
        return new JAXBElement<SeleccionarUsuario>(_SeleccionarUsuario_QNAME, SeleccionarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarUsuarioResponse")
    public JAXBElement<SeleccionarUsuarioResponse> createSeleccionarUsuarioResponse(SeleccionarUsuarioResponse value) {
        return new JAXBElement<SeleccionarUsuarioResponse>(_SeleccionarUsuarioResponse_QNAME, SeleccionarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarExistenciaEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "comprobarExistenciaEmail")
    public JAXBElement<ComprobarExistenciaEmail> createComprobarExistenciaEmail(ComprobarExistenciaEmail value) {
        return new JAXBElement<ComprobarExistenciaEmail>(_ComprobarExistenciaEmail_QNAME, ComprobarExistenciaEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComprobarExistenciaEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "comprobarExistenciaEmailResponse")
    public JAXBElement<ComprobarExistenciaEmailResponse> createComprobarExistenciaEmailResponse(ComprobarExistenciaEmailResponse value) {
        return new JAXBElement<ComprobarExistenciaEmailResponse>(_ComprobarExistenciaEmailResponse_QNAME, ComprobarExistenciaEmailResponse.class, null, value);
    }

}
