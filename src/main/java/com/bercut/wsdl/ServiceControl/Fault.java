
package com.bercut.wsdl.ServiceControl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ошибка
 * 
 * <p>Java class for fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="vendorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fault", namespace = "http://www.bercut.com/schema/commonBP", propOrder = {
    "vendorCode",
    "vendorMessage"
})
public class Fault {

    @XmlElement(required = true)
    protected BigDecimal vendorCode;
    protected String vendorMessage;

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVendorCode(BigDecimal value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorMessage() {
        return vendorMessage;
    }

    /**
     * Sets the value of the vendorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorMessage(String value) {
        this.vendorMessage = value;
    }

}
