
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="deleted"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceStatus", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum ResourceStatus {


    /**
     * Àctive resource
     * 
     */
    @XmlEnumValue("active")
    ACTIVE("active"),

    /**
     * Resource deleted
     * 
     */
    @XmlEnumValue("deleted")
    DELETED("deleted"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    ResourceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceStatus fromValue(String v) {
        for (ResourceStatus c: ResourceStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
