
package com.bercut.wsdl.ServiceControl;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.bercut.com/schema/commonBP}relust"/>
 *         &lt;element name="lang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mod" type="{http://www.bercut.com/schema/commonBP}modification" minOccurs="0"/>
 *         &lt;element name="bpSpecificParams" type="{http://www.bercut.com/schema/commonBP}outParams" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="options" type="{http://www.bercut.com/schema/commonBP}arrayList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", namespace = "http://www.bercut.com/schema/commonBP", propOrder = {
    "result",
    "lang",
    "mod",
    "bpSpecificParams",
    "options"
})
public class Response {

    @XmlElement(required = true)
    protected Relust result;
    protected String lang;
    protected Modification mod;
    protected List<OutParams> bpSpecificParams;
    protected List<com.bercut.wsdl.ServiceControl.ArrayList> options;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Relust }
     *     
     */
    public Relust getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Relust }
     *     
     */
    public void setResult(Relust value) {
        this.result = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link Modification }
     *     
     */
    public Modification getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification }
     *     
     */
    public void setMod(Modification value) {
        this.mod = value;
    }

    /**
     * Gets the value of the bpSpecificParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bpSpecificParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBpSpecificParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutParams }
     * 
     * 
     */
    public List<OutParams> getBpSpecificParams() {
        if (bpSpecificParams == null) {
            bpSpecificParams = new java.util.ArrayList<OutParams>();
        }
        return this.bpSpecificParams;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.bercut.wsdl.ServiceControl.ArrayList }
     * 
     * 
     */
    public List<com.bercut.wsdl.ServiceControl.ArrayList> getOptions() {
        if (options == null) {
            options = new java.util.ArrayList<com.bercut.wsdl.ServiceControl.ArrayList>();
        }
        return this.options;
    }

}
