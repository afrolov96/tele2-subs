
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice element, which identify subscriber
 * 
 * <p>Java class for UserIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}msisdn"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}imsi"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}userId"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}__unknown__"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}invoiceUserId" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIds", propOrder = {
    "msisdn",
    "imsi",
    "userId",
    "unknown",
    "invoiceUserId"
})
public class UserIds {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String msisdn;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String imsi;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected Long userId;
    @XmlElement(name = "__unknown__", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected Object unknown;
    protected InvoiceUserId invoiceUserId;

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
     * Gets the value of the imsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsi() {
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
    public void setImsi(String value) {
        this.imsi = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the unknown property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnknown() {
        return unknown;
    }

    /**
     * Sets the value of the unknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnknown(Object value) {
        this.unknown = value;
    }

    /**
     * Gets the value of the invoiceUserId property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceUserId }
     *     
     */
    public InvoiceUserId getInvoiceUserId() {
        return invoiceUserId;
    }

    /**
     * Sets the value of the invoiceUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceUserId }
     *     
     */
    public void setInvoiceUserId(InvoiceUserId value) {
        this.invoiceUserId = value;
    }

}
