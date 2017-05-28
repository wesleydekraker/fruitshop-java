
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
 *         &lt;element name="GetBoughtProductsResult" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}ArrayOfOwnedProductType" minOccurs="0"/>
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
    "getBoughtProductsResult"
})
@XmlRootElement(name = "GetBoughtProductsResponse")
public class GetBoughtProductsResponse {

    @XmlElementRef(name = "GetBoughtProductsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOwnedProductType> getBoughtProductsResult;

    /**
     * Gets the value of the getBoughtProductsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOwnedProductType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOwnedProductType> getGetBoughtProductsResult() {
        return getBoughtProductsResult;
    }

    /**
     * Sets the value of the getBoughtProductsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOwnedProductType }{@code >}
     *     
     */
    public void setGetBoughtProductsResult(JAXBElement<ArrayOfOwnedProductType> value) {
        this.getBoughtProductsResult = value;
    }

}
