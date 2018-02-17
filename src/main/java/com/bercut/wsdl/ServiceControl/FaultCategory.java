
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="fatal"/>
 *     &lt;enumeration value="error"/>
 *     &lt;enumeration value="notice"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultCategory", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum FaultCategory {


    /**
     * Event, after which it is impossible to continue to work correctly
     * 
     */
    @XmlEnumValue("fatal")
    FATAL("fatal"),

    /**
     * An error has occurred, after which possible continue of work
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * There was an event to which you should pay attention
     * 
     */
    @XmlEnumValue("notice")
    NOTICE("notice"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    FaultCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultCategory fromValue(String v) {
        for (FaultCategory c: FaultCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
