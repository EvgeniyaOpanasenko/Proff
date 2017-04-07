
package ua.com.soap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regionName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regionName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KIEV"/>
 *     &lt;enumeration value="KHARKOV"/>
 *     &lt;enumeration value="LVOV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regionName")
@XmlEnum
public enum RegionName {

    KIEV,
    KHARKOV,
    LVOV;

    public String value() {
        return name();
    }

    public static RegionName fromValue(String v) {
        return valueOf(v);
    }

}
