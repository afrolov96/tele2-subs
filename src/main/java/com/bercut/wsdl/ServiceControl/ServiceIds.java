
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice element, which identify service
 * 
 * <p>Java class for ServiceIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}serviceId"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}serviceName"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}__unknown__"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIds", propOrder = {
    "serviceId",
    "serviceName",
    "unknown"
})
public class ServiceIds {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected Long serviceId;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected String serviceName;
    @XmlElement(name = "__unknown__", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected Object unknown;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceId(Long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
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

}
