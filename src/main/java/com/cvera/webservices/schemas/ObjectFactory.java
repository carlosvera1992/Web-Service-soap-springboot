//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.01.13 a las 11:25:36 PM COT 
//


package com.cvera.webservices.schemas;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cvera.webservices.schemas package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cvera.webservices.schemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarUserResponse }
     * 
     */
    public ConsultarUserResponse createConsultarUserResponse() {
        return new ConsultarUserResponse();
    }

    /**
     * Create an instance of {@link RegistrarUserResponse }
     * 
     */
    public RegistrarUserResponse createRegistrarUserResponse() {
        return new RegistrarUserResponse();
    }

    /**
     * Create an instance of {@link RegistrarUserRequest }
     * 
     */
    public RegistrarUserRequest createRegistrarUserRequest() {
        return new RegistrarUserRequest();
    }

    /**
     * Create an instance of {@link ConsultarUserRequest }
     * 
     */
    public ConsultarUserRequest createConsultarUserRequest() {
        return new ConsultarUserRequest();
    }

}
