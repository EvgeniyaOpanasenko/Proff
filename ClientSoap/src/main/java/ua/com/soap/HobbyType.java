
package ua.com.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hobbyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hobbyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SPORT"/>
 *     &lt;enumeration value="FINANCE"/>
 *     &lt;enumeration value="THEATRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hobbyType")
@XmlEnum
public enum HobbyType {

    SPORT,
    FINANCE,
    THEATRE;

    public String value() {
        return name();
    }

    public static HobbyType fromValue(String v) {
        return valueOf(v);
    }

}
