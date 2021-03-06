
package ua.com.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hobby complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hobby">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.com.ua/}idAutoGenerated">
 *       &lt;sequence>
 *         &lt;element name="candidates" type="{http://soap.com.ua/}candidate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://soap.com.ua/}hobbyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hobby", propOrder = {
    "candidates",
    "type"
})
public class Hobby
    extends IdAutoGenerated
{

    @XmlElement(nillable = true)
    protected List<Candidate> candidates;
    @XmlSchemaType(name = "string")
    protected HobbyType type;

    /**
     * Gets the value of the candidates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Candidate }
     * 
     * 
     */
    public List<Candidate> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<Candidate>();
        }
        return this.candidates;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link HobbyType }
     *     
     */
    public HobbyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link HobbyType }
     *     
     */
    public void setType(HobbyType value) {
        this.type = value;
    }

}
