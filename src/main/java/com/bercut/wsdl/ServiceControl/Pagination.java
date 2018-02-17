
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Structure for paging, which page number and number of records per page
 * 
 * <p>Java class for Pagination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}pageNumber"/>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}recordPerPage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination", propOrder = {
    "pageNumber",
    "recordPerPage"
})
public class Pagination {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected long pageNumber;
    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected long recordPerPage;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public long getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(long value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the recordPerPage property.
     * 
     */
    public long getRecordPerPage() {
        return recordPerPage;
    }

    /**
     * Sets the value of the recordPerPage property.
     * 
     */
    public void setRecordPerPage(long value) {
        this.recordPerPage = value;
    }

}
