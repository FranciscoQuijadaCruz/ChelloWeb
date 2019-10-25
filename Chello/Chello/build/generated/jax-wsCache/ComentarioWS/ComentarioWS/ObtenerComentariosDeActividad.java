
package ComentarioWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObtenerComentariosDeActividad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObtenerComentariosDeActividad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idActividad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerComentariosDeActividad", propOrder = {
    "idActividad"
})
public class ObtenerComentariosDeActividad {

    protected int idActividad;

    /**
     * Obtiene el valor de la propiedad idActividad.
     * 
     */
    public int getIdActividad() {
        return idActividad;
    }

    /**
     * Define el valor de la propiedad idActividad.
     * 
     */
    public void setIdActividad(int value) {
        this.idActividad = value;
    }

}
