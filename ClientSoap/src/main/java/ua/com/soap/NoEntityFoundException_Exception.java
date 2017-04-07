
package ua.com.soap;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NoEntityFoundException", targetNamespace = "http://soap.com.ua/")
public class NoEntityFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NoEntityFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NoEntityFoundException_Exception(String message, NoEntityFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NoEntityFoundException_Exception(String message, NoEntityFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ua.com.soap.NoEntityFoundException
     */
    public NoEntityFoundException getFaultInfo() {
        return faultInfo;
    }

}
