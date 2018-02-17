
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="msisdn" type="{http://www.bercut.com/schema/commonBP}MSISDN"/>
 *         &lt;element name="subs" type="{http://www.bercut.com/schema/ServiceControl}subs"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", namespace = "http://www.bercut.com/schema/ServiceControl", propOrder = {
    "msisdn",
    "subs"
})
public class Subscriber {

    protected String msisdn;
    protected Subs subs;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * Sets the value of the msisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsisdn(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the subs property.
     * 
     * @return
     *     possible object is
     *     {@link Subs }
     *     
     */
    public Subs getSubs() {
        return subs;
    }

    /**
     * Sets the value of the subs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subs }
     *     
     */
    public void setSubs(Subs value) {
        this.subs = value;
    }

}
