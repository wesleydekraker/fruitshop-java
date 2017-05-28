
package nl.hu.generated_sources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterCustomerResult" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}Message" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registerCustomerResult"
})
@XmlRootElement(name = "RegisterCustomerResponse")
public class RegisterCustomerResponse {

    @XmlElementRef(name = "RegisterCustomerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Message> registerCustomerResult;

    /**
     * Gets the value of the registerCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Message }{@code >}
     *     
     */
    public JAXBElement<Message> getRegisterCustomerResult() {
        return registerCustomerResult;
    }

    /**
     * Sets the value of the registerCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Message }{@code >}
     *     
     */
    public void setRegisterCustomerResult(JAXBElement<Message> value) {
        this.registerCustomerResult = value;
    }

}
