
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="megafon"/>
 *     &lt;enumeration value="mts"/>
 *     &lt;enumeration value="beeline"/>
 *     &lt;enumeration value="tele2"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Operator", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum Operator {

    @XmlEnumValue("megafon")
    MEGAFON("megafon"),
    @XmlEnumValue("mts")
    MTS("mts"),
    @XmlEnumValue("beeline")
    BEELINE("beeline"),
    @XmlEnumValue("tele2")
    TELE_2("tele2"),

    /**
     * unknown value (for the possibility of extending the set without losing compatibility)
     * 
     */
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    Operator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operator fromValue(String v) {
        for (Operator c: Operator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
