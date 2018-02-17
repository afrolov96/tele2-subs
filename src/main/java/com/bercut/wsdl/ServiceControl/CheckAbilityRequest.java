
package com.bercut.wsdl.ServiceControl;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriber" type="{http://www.bercut.com/schema/ServiceControl}Subscriber"/>
 *         &lt;element name="serv_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "subscriber",
    "servId"
})
@XmlRootElement(name = "checkAbilityRequest", namespace = "http://www.bercut.com/schema/ServiceControl")
public class CheckAbilityRequest {

    @XmlElement(namespace = "http://www.bercut.com/schema/ServiceControl", required = true)
    protected Subscriber subscriber;
    @XmlElement(name = "serv_id", namespace = "http://www.bercut.com/schema/ServiceControl", required = true)
    protected BigInteger servId;

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link Subscriber }
     *     
     */
    public Subscriber getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscriber }
     *     
     */
    public void setSubscriber(Subscriber value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the servId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServId() {
        return servId;
    }

    /**
     * Sets the value of the servId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServId(BigInteger value) {
        this.servId = value;
    }

}
