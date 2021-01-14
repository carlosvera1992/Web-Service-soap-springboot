//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.01.13 a las 11:25:36 PM COT 
//


package com.cvera.webservices.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoResponse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombreUser",
    "codigoResponse"
})
@XmlRootElement(name = "consultarUserResponse")
public class ConsultarUserResponse {

    @XmlElement(required = true)
    protected String nombreUser;
    protected int codigoResponse;

    /**
     * Obtiene el valor de la propiedad nombreUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreUser() {
        return nombreUser;
    }

    /**
     * Define el valor de la propiedad nombreUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreUser(String value) {
        this.nombreUser = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoResponse.
     * 
     */
    public int getCodigoResponse() {
        return codigoResponse;
    }

    /**
     * Define el valor de la propiedad codigoResponse.
     * 
     */
    public void setCodigoResponse(int value) {
        this.codigoResponse = value;
    }

}
