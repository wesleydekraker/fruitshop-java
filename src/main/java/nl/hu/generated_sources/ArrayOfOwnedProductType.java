
package nl.hu.generated_sources;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOwnedProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOwnedProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OwnedProductType" type="{http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary}OwnedProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOwnedProductType", namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", propOrder = {
    "ownedProductType"
})
public class ArrayOfOwnedProductType {

    @XmlElement(name = "OwnedProductType", nillable = true)
    protected List<OwnedProductType> ownedProductType;

    /**
     * Gets the value of the ownedProductType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownedProductType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnedProductType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnedProductType }
     * 
     * 
     */
    public List<OwnedProductType> getOwnedProductType() {
        if (ownedProductType == null) {
            ownedProductType = new ArrayList<OwnedProductType>();
        }
        return this.ownedProductType;
    }

}
