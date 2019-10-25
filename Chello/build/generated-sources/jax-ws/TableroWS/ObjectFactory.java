
package TableroWS;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the TableroWS package. 
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

    private final static QName _AgregarTablero_QNAME = new QName("http://webservices/", "AgregarTablero");
    private final static QName _AgregarTableroResponse_QNAME = new QName("http://webservices/", "AgregarTableroResponse");
    private final static QName _EditarTablero_QNAME = new QName("http://webservices/", "EditarTablero");
    private final static QName _EditarTableroResponse_QNAME = new QName("http://webservices/", "EditarTableroResponse");
    private final static QName _EliminarTablero_QNAME = new QName("http://webservices/", "EliminarTablero");
    private final static QName _EliminarTableroResponse_QNAME = new QName("http://webservices/", "EliminarTableroResponse");
    private final static QName _SeleccionarTablero_QNAME = new QName("http://webservices/", "SeleccionarTablero");
    private final static QName _SeleccionarTableroResponse_QNAME = new QName("http://webservices/", "SeleccionarTableroResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: TableroWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarTablero }
     * 
     */
    public AgregarTablero createAgregarTablero() {
        return new AgregarTablero();
    }

    /**
     * Create an instance of {@link AgregarTableroResponse }
     * 
     */
    public AgregarTableroResponse createAgregarTableroResponse() {
        return new AgregarTableroResponse();
    }

    /**
     * Create an instance of {@link EditarTablero }
     * 
     */
    public EditarTablero createEditarTablero() {
        return new EditarTablero();
    }

    /**
     * Create an instance of {@link EditarTableroResponse }
     * 
     */
    public EditarTableroResponse createEditarTableroResponse() {
        return new EditarTableroResponse();
    }

    /**
     * Create an instance of {@link EliminarTablero }
     * 
     */
    public EliminarTablero createEliminarTablero() {
        return new EliminarTablero();
    }

    /**
     * Create an instance of {@link EliminarTableroResponse }
     * 
     */
    public EliminarTableroResponse createEliminarTableroResponse() {
        return new EliminarTableroResponse();
    }

    /**
     * Create an instance of {@link SeleccionarTablero }
     * 
     */
    public SeleccionarTablero createSeleccionarTablero() {
        return new SeleccionarTablero();
    }

    /**
     * Create an instance of {@link SeleccionarTableroResponse }
     * 
     */
    public SeleccionarTableroResponse createSeleccionarTableroResponse() {
        return new SeleccionarTableroResponse();
    }

    /**
     * Create an instance of {@link Tablero }
     * 
     */
    public Tablero createTablero() {
        return new Tablero();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarTablero")
    public JAXBElement<AgregarTablero> createAgregarTablero(AgregarTablero value) {
        return new JAXBElement<AgregarTablero>(_AgregarTablero_QNAME, AgregarTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "AgregarTableroResponse")
    public JAXBElement<AgregarTableroResponse> createAgregarTableroResponse(AgregarTableroResponse value) {
        return new JAXBElement<AgregarTableroResponse>(_AgregarTableroResponse_QNAME, AgregarTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarTablero")
    public JAXBElement<EditarTablero> createEditarTablero(EditarTablero value) {
        return new JAXBElement<EditarTablero>(_EditarTablero_QNAME, EditarTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditarTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EditarTableroResponse")
    public JAXBElement<EditarTableroResponse> createEditarTableroResponse(EditarTableroResponse value) {
        return new JAXBElement<EditarTableroResponse>(_EditarTableroResponse_QNAME, EditarTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTablero")
    public JAXBElement<EliminarTablero> createEliminarTablero(EliminarTablero value) {
        return new JAXBElement<EliminarTablero>(_EliminarTablero_QNAME, EliminarTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "EliminarTableroResponse")
    public JAXBElement<EliminarTableroResponse> createEliminarTableroResponse(EliminarTableroResponse value) {
        return new JAXBElement<EliminarTableroResponse>(_EliminarTableroResponse_QNAME, EliminarTableroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarTablero")
    public JAXBElement<SeleccionarTablero> createSeleccionarTablero(SeleccionarTablero value) {
        return new JAXBElement<SeleccionarTablero>(_SeleccionarTablero_QNAME, SeleccionarTablero.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeleccionarTableroResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "SeleccionarTableroResponse")
    public JAXBElement<SeleccionarTableroResponse> createSeleccionarTableroResponse(SeleccionarTableroResponse value) {
        return new JAXBElement<SeleccionarTableroResponse>(_SeleccionarTableroResponse_QNAME, SeleccionarTableroResponse.class, null, value);
    }

}
