
package com.bercut.wsdl.ServiceControl;

import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSISDN" type="{http://www.bercut.com/schema/commonBP}MSISDN"/>
 *         &lt;element name="ServId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UserInput" type="{http://www.bercut.com/schema/commonBP}arrayList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", namespace = "http://www.bercut.com/schema/commonBP", propOrder = {
    "msisdn",
    "servId",
    "userInput",
    "applicationType"
})
public class Request {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(name = "ServId")
    protected BigDecimal servId;
    @XmlElement(name = "UserInput")
    protected List<com.bercut.wsdl.ServiceControl.ArrayList> userInput;
    @XmlElement(name = "ApplicationType")
    protected String applicationType;

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
     * Gets the value of the servId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServId() {
        return servId;
    }

    /**
     * Sets the value of the servId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServId(BigDecimal value) {
        this.servId = value;
    }

    /**
     * Gets the value of the userInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.bercut.wsdl.ServiceControl.ArrayList }
     * 
     * 
     */
    public List<com.bercut.wsdl.ServiceControl.ArrayList> getUserInput() {
        if (userInput == null) {
            userInput = new java.util.ArrayList<com.bercut.wsdl.ServiceControl.ArrayList>();
        }
        return this.userInput;
    }

    /**
     * Gets the value of the applicationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationType() {
        return applicationType;
    }

    /**
     * Sets the value of the applicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationType(String value) {
        this.applicationType = value;
    }

}
