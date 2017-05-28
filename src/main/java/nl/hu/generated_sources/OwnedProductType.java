
package nl.hu.generated_sources;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnedProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OwnedProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductDetails" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}ProductDetails" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnedProductType", namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", propOrder = {
    "productDetails",
    "quantity"
})
public class OwnedProductType {

    @XmlElementRef(name = "ProductDetails", namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", type = JAXBElement.class, required = false)
    protected JAXBElement<ProductDetails> productDetails;
    @XmlElement(name = "Quantity")
    protected Integer quantity;

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

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

}
