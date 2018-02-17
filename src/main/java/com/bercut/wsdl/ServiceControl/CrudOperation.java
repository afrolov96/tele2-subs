
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrudOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrudOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create"/>
 *     &lt;enumeration value="Read"/>
 *     &lt;enumeration value="Update"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="__unknown__"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrudOperation", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum CrudOperation {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Read")
    READ("Read"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("__unknown__")
    UNKNOWN("__unknown__");
    private final String value;

    CrudOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CrudOperation fromValue(String v) {
        for (CrudOperation c: CrudOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
