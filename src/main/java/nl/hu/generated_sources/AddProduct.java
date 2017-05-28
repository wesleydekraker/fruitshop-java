
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
 *         &lt;element name="loginDetails" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}LoginDetails" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}ProductDetails" minOccurs="0"/>
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
    "loginDetails",
    "productDetails"
})
@XmlRootElement(name = "AddProduct")
public class AddProduct {

    @XmlElementRef(name = "loginDetails", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginDetails> loginDetails;
    @XmlElementRef(name = "productDetails", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductDetails> productDetails;

    /**
     * Gets the value of the loginDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}
     *     
     */
    public JAXBElement<LoginDetails> getLoginDetails() {
        return loginDetails;
    }

    /**
     * Sets the value of the loginDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}
     *     
     */
    public void setLoginDetails(JAXBElement<LoginDetails> value) {
        this.loginDetails = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}
     *     
     */
    public JAXBElement<ProductDetails> getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}
     *     
     */
    public void setProductDetails(JAXBElement<ProductDetails> value) {
        this.productDetails = value;
    }

}
