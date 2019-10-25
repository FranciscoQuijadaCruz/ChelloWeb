
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EliminarTableroUsuarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EliminarTableroUsuarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTablero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarTableroUsuarios", propOrder = {
    "idTablero"
})
public class EliminarTableroUsuarios {

    protected int idTablero;

    /**
     * Obtiene el valor de la propiedad idTablero.
     * 
     */
    public int getIdTablero() {
        return idTablero;
    }

    /**
     * Define el valor de la propiedad idTablero.
     * 
     */
    public void setIdTablero(int value) {
        this.idTablero = value;
    }

}
