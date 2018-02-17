
package com.bercut.wsdl.ServiceControl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Choice element, which identify subscriber service
 * 
 * <p>Java class for SubscriberServiceIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberServiceIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}subscriberServiceId"/>
 *         &lt;element name="subscriberServiceIdentificators">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}userIds"/>
 *                   &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}serviceName"/>
 *                   &lt;element name="extension" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "SubscriberServiceIds", propOrder = {
    "subscriberServiceId",
    "subscriberServiceIdentificators",
    "unknown"
})
public class SubscriberServiceIds {

    @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    @XmlSchemaType(name = "unsignedInt")
    protected Long subscriberServiceId;
    protected SubscriberServiceIds.SubscriberServiceIdentificators subscriberServiceIdentificators;
    @XmlElement(name = "__unknown__", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
    protected Object unknown;

    /**
     * Gets the value of the subscriberServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriberServiceId() {
        return subscriberServiceId;
    }

    /**
     * Sets the value of the subscriberServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriberServiceId(Long value) {
        this.subscriberServiceId = value;
    }

    /**
     * Gets the value of the subscriberServiceIdentificators property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberServiceIds.SubscriberServiceIdentificators }
     *     
     */
    public SubscriberServiceIds.SubscriberServiceIdentificators getSubscriberServiceIdentificators() {
        return subscriberServiceIdentificators;
    }

    /**
     * Sets the value of the subscriberServiceIdentificators property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberServiceIds.SubscriberServiceIdentificators }
     *     
     */
    public void setSubscriberServiceIdentificators(SubscriberServiceIds.SubscriberServiceIdentificators value) {
        this.subscriberServiceIdentificators = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.bercut.com/spec/schema/ComplexDefinition}userIds"/>
     *         &lt;element ref="{http://www.bercut.com/spec/schema/SimpleDefinition}serviceName"/>
     *         &lt;element name="extension" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "userIds",
        "serviceName",
        "extension"
    })
    public static class SubscriberServiceIdentificators {

        @XmlElement(required = true)
        protected UserIds userIds;
        @XmlElement(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", required = true)
        protected String serviceName;
        protected SubscriberServiceIds.SubscriberServiceIdentificators.Extension extension;

        /**
         * Gets the value of the userIds property.
         * 
         * @return
         *     possible object is
         *     {@link UserIds }
         *     
         */
        public UserIds getUserIds() {
            return userIds;
        }

        /**
         * Sets the value of the userIds property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIds }
         *     
         */
        public void setUserIds(UserIds value) {
            this.userIds = value;
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
         * Gets the value of the extension property.
         * 
         * @return
         *     possible object is
         *     {@link SubscriberServiceIds.SubscriberServiceIdentificators.Extension }
         *     
         */
        public SubscriberServiceIds.SubscriberServiceIdentificators.Extension getExtension() {
            return extension;
        }

        /**
         * Sets the value of the extension property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriberServiceIds.SubscriberServiceIdentificators.Extension }
         *     
         */
        public void setExtension(SubscriberServiceIds.SubscriberServiceIdentificators.Extension value) {
            this.extension = value;
        }


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
         *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
            "any"
        })
        public static class Extension {

            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * {@link Element }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

        }

    }

}
