
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberChargingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriberChargingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="prepaid"/>
 *     &lt;enumeration value="postpaid"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriberChargingType", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum SubscriberChargingType {


    /**
     * online charging for subscriber
     * 
     */
    @XmlEnumValue("prepaid")
    PREPAID("prepaid"),

    /**
     * offline charging for subscriber
     * 
     */
    @XmlEnumValue("postpaid")
    POSTPAID("postpaid"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    SubscriberChargingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriberChargingType fromValue(String v) {
        for (SubscriberChargingType c: SubscriberChargingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
