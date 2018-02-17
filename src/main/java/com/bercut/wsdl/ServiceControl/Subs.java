
package com.bercut.wsdl.ServiceControl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subs_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="branch_id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subs", namespace = "http://www.bercut.com/schema/ServiceControl", propOrder = {
    "subsId",
    "branchId"
})
public class Subs {

    @XmlElement(name = "subs_id")
    protected int subsId;
    @XmlElement(name = "branch_id", required = true)
    protected BigDecimal branchId;

    /**
     * Gets the value of the subsId property.
     * 
     */
    public int getSubsId() {
        return subsId;
    }

    /**
     * Sets the value of the subsId property.
     * 
     */
    public void setSubsId(int value) {
        this.subsId = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBranchId(BigDecimal value) {
        this.branchId = value;
    }

}
