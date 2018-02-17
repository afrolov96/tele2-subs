
package com.bercut.wsdl.ServiceControl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Идентификатор абонента
 * 
 * <p>Java class for Subscriber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subscriber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MSISDN" type="{http://www.bercut.com/schema/commonBP}MSISDN"/>
 *         &lt;element name="Subs" type="{http://www.bercut.com/schema/commonBP}SubsId"/>
 *         &lt;element name="IMSI" type="{http://www.bercut.com/schema/commonBP}IMSI"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", namespace = "http://www.bercut.com/schema/commonBP", propOrder = {
    "msisdn",
    "subs",
    "imsi"
})
public class Subscriber2 {

    @XmlElement(name = "MSISDN")
    protected String msisdn;
    @XmlElement(name = "Subs")
    protected BigDecimal subs;
    @XmlElement(name = "IMSI")
    protected String imsi;

    /**
     * Gets the value of the msisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
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
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Gets the value of the subs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubs() {
        return subs;
    }

    /**
     * Sets the value of the subs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubs(BigDecimal value) {
        this.subs = value;
    }

    /**
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMSI() {
        return imsi;
    }

    /**
     * Sets the value of the imsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMSI(String value) {
        this.imsi = value;
    }

}
