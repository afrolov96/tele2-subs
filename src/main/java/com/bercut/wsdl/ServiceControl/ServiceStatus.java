
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="unactive"/>
 *     &lt;enumeration value="blocked"/>
 *     &lt;enumeration value="unblocked"/>
 *     &lt;enumeration value="testing"/>
 *     &lt;enumeration value="archived"/>
 *     &lt;enumeration value="canceled"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatus", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum ServiceStatus {


    /**
     * Àctive service
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Non active service
     * 
     */
    @XmlEnumValue("unactive")
    UNACTIVE("unactive"),

    /**
     * Service blocked
     * 
     */
    @XmlEnumValue("blocked")
    BLOCKED("blocked"),

    /**
     * Service unblocked
     * 
     */
    @XmlEnumValue("unblocked")
    UNBLOCKED("unblocked"),

    /**
     * Service testing
     * 
     */
    @XmlEnumValue("testing")
    TESTING("testing"),

    /**
     * Service archived
     * 
     */
    @XmlEnumValue("archived")
    ARCHIVED("archived"),

    /**
     * Service canceled
     * 
     */
    @XmlEnumValue("canceled")
    CANCELED("canceled"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    ServiceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatus fromValue(String v) {
        for (ServiceStatus c: ServiceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
