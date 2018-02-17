
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Composite type of resource
 * 
 * <p>Java class for ResourceComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}applicationName"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}resourceTypeName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceComplexType", propOrder = {
    "applicationName",
    "resourceTypeName"
})
public class ResourceComplexType {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", required = true)
    protected String applicationName;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", required = true)
    protected String resourceTypeName;

    /**
     * Gets the value of the applicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Sets the value of the applicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationName(String value) {
        this.applicationName = value;
    }

    /**
     * Gets the value of the resourceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    /**
     * Sets the value of the resourceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTypeName(String value) {
        this.resourceTypeName = value;
    }

}
