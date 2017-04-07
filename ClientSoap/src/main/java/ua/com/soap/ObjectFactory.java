
package ua.com.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.com.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NoEntityFoundException_QNAME = new QName("http://soap.com.ua/", "NoEntityFoundException");
    private final static QName _RegisterException_QNAME = new QName("http://soap.com.ua/", "RegisterException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.com.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoEntityFoundException }
     * 
     */
    public NoEntityFoundException createNoEntityFoundException() {
        return new NoEntityFoundException();
    }

    /**
     * Create an instance of {@link RegisterException }
     * 
     */
    public RegisterException createRegisterException() {
        return new RegisterException();
    }

    /**
     * Create an instance of {@link Candidate }
     * 
     */
    public Candidate createCandidate() {
        return new Candidate();
    }

    /**
     * Create an instance of {@link Clan }
     * 
     */
    public Clan createClan() {
        return new Clan();
    }

    /**
     * Create an instance of {@link Region }
     * 
     */
    public Region createRegion() {
        return new Region();
    }

    /**
     * Create an instance of {@link Hobby }
     * 
     */
    public Hobby createHobby() {
        return new Hobby();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoEntityFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.com.ua/", name = "NoEntityFoundException")
    public JAXBElement<NoEntityFoundException> createNoEntityFoundException(NoEntityFoundException value) {
        return new JAXBElement<NoEntityFoundException>(_NoEntityFoundException_QNAME, NoEntityFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.com.ua/", name = "RegisterException")
    public JAXBElement<RegisterException> createRegisterException(RegisterException value) {
        return new JAXBElement<RegisterException>(_RegisterException_QNAME, RegisterException.class, null, value);
    }

}
