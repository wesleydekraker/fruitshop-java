
package nl.hu.generated_sources;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IFruitShopService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IFruitShopService {


    /**
     * 
     * @return
     *     returns nl.hu.generated_sources.ArrayOfProductType
     */
    @WebMethod(operationName = "GetAvailableProducts", action = "http://tempuri.org/IFruitShopService/GetAvailableProducts")
    @WebResult(name = "GetAvailableProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetAvailableProducts", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetAvailableProducts")
    @ResponseWrapper(localName = "GetAvailableProductsResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetAvailableProductsResponse")
    public ArrayOfProductType getAvailableProducts();

    /**
     * 
     * @param loginDetails
     * @return
     *     returns nl.hu.generated_sources.Message
     */
    @WebMethod(operationName = "RegisterCustomer", action = "http://tempuri.org/IFruitShopService/RegisterCustomer")
    @WebResult(name = "RegisterCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegisterCustomer", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.RegisterCustomer")
    @ResponseWrapper(localName = "RegisterCustomerResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.RegisterCustomerResponse")
    public Message registerCustomer(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails);

    /**
     * 
     * @param loginDetails
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "LoginCustomer", action = "http://tempuri.org/IFruitShopService/LoginCustomer")
    @WebResult(name = "LoginCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LoginCustomer", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.LoginCustomer")
    @ResponseWrapper(localName = "LoginCustomerResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.LoginCustomerResponse")
    public Boolean loginCustomer(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails);

    /**
     * 
     * @param loginDetails
     * @param productDetails
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod(operationName = "AddProduct", action = "http://tempuri.org/IFruitShopService/AddProduct")
    @WebResult(name = "AddProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddProduct", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.AddProduct")
    @ResponseWrapper(localName = "AddProductResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.AddProductResponse")
    public Integer addProduct(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails,
        @WebParam(name = "productDetails", targetNamespace = "http://tempuri.org/")
        ProductDetails productDetails);

    /**
     * 
     * @param productId
     * @param loginDetails
     * @return
     *     returns nl.hu.generated_sources.Message
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IFruitShopService/BuyProduct")
    @WebResult(name = "BuyProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.BuyProductResponse")
    public Message buyProduct(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails,
        @WebParam(name = "productId", targetNamespace = "http://tempuri.org/")
        Integer productId);

    /**
     * 
     * @param loginDetails
     * @return
     *     returns nl.hu.generated_sources.ArrayOfOwnedProductType
     */
    @WebMethod(operationName = "GetBoughtProducts", action = "http://tempuri.org/IFruitShopService/GetBoughtProducts")
    @WebResult(name = "GetBoughtProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBoughtProducts", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetBoughtProducts")
    @ResponseWrapper(localName = "GetBoughtProductsResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetBoughtProductsResponse")
    public ArrayOfOwnedProductType getBoughtProducts(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails);

    /**
     * 
     * @param loginDetails
     * @return
     *     returns java.lang.Double
     */
    @WebMethod(operationName = "GetBalance", action = "http://tempuri.org/IFruitShopService/GetBalance")
    @WebResult(name = "GetBalanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBalance", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetBalance")
    @ResponseWrapper(localName = "GetBalanceResponse", targetNamespace = "http://tempuri.org/", className = "nl.hu.generated_sources.GetBalanceResponse")
    public Double getBalance(
        @WebParam(name = "loginDetails", targetNamespace = "http://tempuri.org/")
        LoginDetails loginDetails);

}
