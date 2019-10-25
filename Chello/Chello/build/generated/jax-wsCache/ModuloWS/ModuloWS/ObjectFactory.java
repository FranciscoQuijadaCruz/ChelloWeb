
package ModuloWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ModuloWS package. 
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

    private final static QName _AgregarModulo_QNAME = new QName("http://webservices/", "AgregarModulo");
    private final static QName _AgregarModuloResponse_QNAME = new QName("http://webservices/", "AgregarModuloResponse");
    private final static QName _EditarModulo_QNAME = new QName("http://webservices/", "EditarModulo");
    private final static QName _EditarModuloResponse_QNAME = new QName("http://webservices/", "EditarModuloResponse");
    private final static QName _EliminarModulo_QNAME = new QName("http://webservices/", "EliminarModulo");
    private final static QName _EliminarModuloResponse_QNAME = new QName("http://webservices/", "EliminarModuloResponse");
    private final static QName _EliminarModuloVirtual_QNAME = new QName("http://webservices/", "EliminarModuloVirtual");
    private final static QName _EliminarModuloVirtualResponse_QNAME = new QName("http://webservices/", "EliminarModuloVirtualResponse");
    private final static QName _ObtenerModulosDeTablero_QNAME = new QName("http://webservices/", "ObtenerModulosDeTablero");
    private final static QName _ObtenerModulosDeTableroResponse_QNAME = new QName("http://webservices/", "ObtenerModulosDeTableroResponse");
    private final static QName _SeleccionarModulo_QNAME = new QName("http://webservices/", "SeleccionarModulo");
    private final static QName _SeleccionarModuloResponse_QNAME = new QName("http://webservices/", "SeleccionarModuloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ModuloWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarModulo }
     * 
     */
    public AgregarModulo createAgregarModulo() {
        return new AgregarModulo();
    }

    /**
     * Create an instance of {@link AgregarModuloResponse }
     * 
     */
    public AgregarModuloResponse createAgregarModuloResponse() {
        return new AgregarModuloResponse();
    }

    /**
     * Create an instance of {@link EditarModulo }
     * 
     */
    public EditarModulo createEditarModulo() {
        return new EditarModulo();
    }

    /**
     * Create an instance of {@link EditarModuloResponse }
     * 
     */
    public EditarModuloResponse createEditarModuloResponse() {
        return new EditarModuloResponse();
    }

    /**
     * Create an instance of {@link EliminarModulo }
     * 
     */
    public EliminarModulo createEliminarModulo() {
        return new EliminarModulo();
    }

    /**
     * Create an instance of {@link EliminarModuloResponse }
     * 
     */
    public EliminarModuloResponse createEliminarModuloResponse() {
        return new EliminarModuloResponse();
    }

    /**
     * Create an instance of {@link EliminarModuloVirtual }
     * 
     */
    public EliminarModuloVirtual createEliminarModuloVirtual() {
        return new EliminarModuloVirtual();
    }

    /**
     * Create an instance of {@link EliminarModuloVirtualResponse }
     * 
     */
    public EliminarModuloVirtualResponse createEliminarModuloVirtualResponse() {
        return new EliminarModuloVirtualResponse();
    }

    /**
     * Create an instance of {@link ObtenerModulosDeTablero }
     * 
     */
    public ObtenerModulosDeTablero createObtenerModulosDeTablero() {
        return new ObtenerModulosDeTablero();
    }

    /**
     * Create an instance of {@link ObtenerModulosDeTableroResponse }
     * 
     */
    public ObtenerModulosDeTableroResponse createObtenerModulosDeTableroResponse() {
        return new ObtenerModulosDeTableroResponse();
    }

    /**
     * Create an instance of {@link SeleccionarModulo }
     * 
     */
    public SeleccionarModulo createSeleccionarModulo() {
        return new SeleccionarModulo();
    }

    /**
     * Create an instance of {@link SeleccionarModuloResponse }
     * 
     */
    public SeleccionarModuloResponse createSeleccionarModuloResponse() {
        return new SeleccionarModuloResponse();
    }

    /**
     * Create an instance of {@link Modulo }
     * 
     */
    public Modulo createModulo() {
        return new Modulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarModulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarModulo")
    public JAXBElement<AgregarModulo> createAgregarModulo(AgregarModulo value) {
        return new JAXBElement<AgregarModulo>(_AgregarModulo_QNAME, AgregarModulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarModuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarModuloResponse")
    public JAXBElement<AgregarModuloResponse> createAgregarModuloResponse(AgregarModuloResponse value) {
        return new JAXBElement<AgregarModuloResponse>(_AgregarModuloResponse_QNAME, AgregarModuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarModulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarModulo")
    public JAXBElement<EditarModulo> createEditarModulo(EditarModulo value) {
        return new JAXBElement<EditarModulo>(_EditarModulo_QNAME, EditarModulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarModuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarModuloResponse")
    public JAXBElement<EditarModuloResponse> createEditarModuloResponse(EditarModuloResponse value) {
        return new JAXBElement<EditarModuloResponse>(_EditarModuloResponse_QNAME, EditarModuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModulo")
    public JAXBElement<EliminarModulo> createEliminarModulo(EliminarModulo value) {
        return new JAXBElement<EliminarModulo>(_EliminarModulo_QNAME, EliminarModulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModuloResponse")
    public JAXBElement<EliminarModuloResponse> createEliminarModuloResponse(EliminarModuloResponse value) {
        return new JAXBElement<EliminarModuloResponse>(_EliminarModuloResponse_QNAME, EliminarModuloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModuloVirtual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModuloVirtual")
    public JAXBElement<EliminarModuloVirtual> createEliminarModuloVirtual(EliminarModuloVirtual value) {
        return new JAXBElement<EliminarModuloVirtual>(_EliminarModuloVirtual_QNAME, EliminarModuloVirtual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarModuloVirtualResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarModuloVirtualResponse")
    public JAXBElement<EliminarModuloVirtualResponse> createEliminarModuloVirtualResponse(EliminarModuloVirtualResponse value) {
        return new JAXBElement<EliminarModuloVirtualResponse>(_EliminarModuloVirtualResponse_QNAME, EliminarModuloVirtualResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModulosDeTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModulosDeTablero")
    public JAXBElement<ObtenerModulosDeTablero> createObtenerModulosDeTablero(ObtenerModulosDeTablero value) {
        return new JAXBElement<ObtenerModulosDeTablero>(_ObtenerModulosDeTablero_QNAME, ObtenerModulosDeTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerModulosDeTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "ObtenerModulosDeTableroResponse")
    public JAXBElement<ObtenerModulosDeTableroResponse> createObtenerModulosDeTableroResponse(ObtenerModulosDeTableroResponse value) {
        return new JAXBElement<ObtenerModulosDeTableroResponse>(_ObtenerModulosDeTableroResponse_QNAME, ObtenerModulosDeTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarModulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarModulo")
    public JAXBElement<SeleccionarModulo> createSeleccionarModulo(SeleccionarModulo value) {
        return new JAXBElement<SeleccionarModulo>(_SeleccionarModulo_QNAME, SeleccionarModulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarModuloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarModuloResponse")
    public JAXBElement<SeleccionarModuloResponse> createSeleccionarModuloResponse(SeleccionarModuloResponse value) {
        return new JAXBElement<SeleccionarModuloResponse>(_SeleccionarModuloResponse_QNAME, SeleccionarModuloResponse.class, null, value);
    }

}
