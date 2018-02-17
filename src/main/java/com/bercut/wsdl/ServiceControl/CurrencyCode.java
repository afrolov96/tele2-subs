
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TMT"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="JPY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyCode", namespace = "http://www.bercut.com/spec/schema/SimpleDefinition")
@XmlEnum
public enum CurrencyCode {


    /**
     * Russian ruble
     * 
     */
    RUB,

    /**
     * Australian Dollar
     * 
     */
    AUD,

    /**
     * Azerbaijan Manat
     * 
     */
    AZN,

    /**
     * British Pound Sterling
     * 
     */
    GBP,

    /**
     * Armenia Dram
     * 
     */
    AMD,

    /**
     * Belarussian Ruble
     * 
     */
    BYR,

    /**
     * Bulgarian lev
     * 
     */
    BGN,

    /**
     * Brazil Real
     * 
     */
    BRL,

    /**
     * Hungarian Forint
     * 
     */
    HUF,

    /**
     * Danish Krone
     * 
     */
    DKK,

    /**
     * US Dollar
     * 
     */
    USD,

    /**
     * Euro
     * 
     */
    EUR,

    /**
     * Indian Rupee
     * 
     */
    INR,

    /**
     * Kazakh Tenge
     * 
     */
    KZT,

    /**
     * Canadian Dollar
     * 
     */
    CAD,

    /**
     * Kyrgyzstan Som
     * 
     */
    KGS,

    /**
     * China Yuan
     * 
     */
    CNY,

    /**
     * Lithuanian Lita
     * 
     */
    LTL,

    /**
     * Moldova Lei
     * 
     */
    MDL,

    /**
     * Norwegian Krone
     * 
     */
    NOK,

    /**
     * Polish Zloty
     * 
     */
    PLN,

    /**
     * Romanian Leu
     * 
     */
    RON,

    /**
     * SDR
     * 
     */
    XDR,

    /**
     * Singapore Dollar
     * 
     */
    SGD,

    /**
     * Tajikistan Ruble
     * 
     */
    TJS,

    /**
     * Turkish Lira
     * 
     */
    TRY,

    /**
     * New Turkmenistan Manat
     * 
     */
    TMT,

    /**
     * Uzbekistan Sum
     * 
     */
    UZS,

    /**
     * Ukrainian Hryvnia
     * 
     */
    UAH,

    /**
     * Czech Koruna
     * 
     */
    CZK,

    /**
     * Swedish Krona
     * 
     */
    SEK,

    /**
     * Swiss Franc
     * 
     */
    CHF,

    /**
     * S.African Rand
     * 
     */
    ZAR,

    /**
     * South Korean Won
     * 
     */
    KRW,

    /**
     * Japanese Yen
     * 
     */
    JPY;

    public String value() {
        return name();
    }

    public static CurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
