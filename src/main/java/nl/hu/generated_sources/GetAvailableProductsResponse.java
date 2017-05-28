
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
 *         &lt;element name="GetAvailableProductsResult" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}ArrayOfProductType" minOccurs="0"/>
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
    "getAvailableProductsResult"
})
@XmlRootElement(name = "GetAvailableProductsResponse")
public class GetAvailableProductsResponse {

    @XmlElementRef(name = "GetAvailableProductsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProductType> getAvailableProductsResult;

    /**
     * Gets the value of the getAvailableProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProductType> getGetAvailableProductsResult() {
        return getAvailableProductsResult;
    }

    /**
     * Sets the value of the getAvailableProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}
     *     
     */
    public void setGetAvailableProductsResult(JAXBElement<ArrayOfProductType> value) {
        this.getAvailableProductsResult = value;
    }

}
