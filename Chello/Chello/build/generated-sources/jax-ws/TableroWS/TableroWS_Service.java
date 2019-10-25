
package TableroWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TableroWS", targetNamespace = "http://webservices/", wsdlLocation = "http://jorgenorza.ga:8080/ProyectoFinalWS/TableroWS?wsdl")
public class TableroWS_Service
    extends Service
{

    private final static URL TABLEROWS_WSDL_LOCATION;
    private final static WebServiceException TABLEROWS_EXCEPTION;
    private final static QName TABLEROWS_QNAME = new QName("http://webservices/", "TableroWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://jorgenorza.ga:8080/ProyectoFinalWS/TableroWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TABLEROWS_WSDL_LOCATION = url;
        TABLEROWS_EXCEPTION = e;
    }

    public TableroWS_Service() {
        super(__getWsdlLocation(), TABLEROWS_QNAME);
    }

    public TableroWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TABLEROWS_QNAME, features);
    }

    public TableroWS_Service(URL wsdlLocation) {
        super(wsdlLocation, TABLEROWS_QNAME);
    }

    public TableroWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TABLEROWS_QNAME, features);
    }

    public TableroWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TableroWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TableroWS
     */
    @WebEndpoint(name = "TableroWSPort")
    public TableroWS getTableroWSPort() {
        return super.getPort(new QName("http://webservices/", "TableroWSPort"), TableroWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TableroWS
     */
    @WebEndpoint(name = "TableroWSPort")
    public TableroWS getTableroWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices/", "TableroWSPort"), TableroWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TABLEROWS_EXCEPTION!= null) {
            throw TABLEROWS_EXCEPTION;
        }
        return TABLEROWS_WSDL_LOCATION;
    }

}