
package nl.hu.generated_sources;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.hu.generated_sources package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Message_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "Message");
    private final static QName _ArrayOfOwnedProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "ArrayOfOwnedProductType");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _ProductDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "ProductDetails");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _LoginDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "LoginDetails");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "ArrayOfProductType");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "ProductType");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _OwnedProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "OwnedProductType");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ProductDetailsName_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "Name");
    private final static QName _BuyProductLoginDetails_QNAME = new QName("http://tempuri.org/", "loginDetails");
    private final static QName _MessageContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "Content");
    private final static QName _GetAvailableProductsResponseGetAvailableProductsResult_QNAME = new QName("http://tempuri.org/", "GetAvailableProductsResult");
    private final static QName _BuyProductResponseBuyProductResult_QNAME = new QName("http://tempuri.org/", "BuyProductResult");
    private final static QName _LoginDetailsPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "Password");
    private final static QName _LoginDetailsUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", "Username");
    private final static QName _GetBoughtProductsResponseGetBoughtProductsResult_QNAME = new QName("http://tempuri.org/", "GetBoughtProductsResult");
    private final static QName _RegisterCustomerResponseRegisterCustomerResult_QNAME = new QName("http://tempuri.org/", "RegisterCustomerResult");
    private final static QName _AddProductProductDetails_QNAME = new QName("http://tempuri.org/", "productDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hu.generated_sources
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterCustomer }
     * 
     */
    public RegisterCustomer createRegisterCustomer() {
        return new RegisterCustomer();
    }

    /**
     * Create an instance of {@link LoginDetails }
     * 
     */
    public LoginDetails createLoginDetails() {
        return new LoginDetails();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link GetBoughtProducts }
     * 
     */
    public GetBoughtProducts createGetBoughtProducts() {
        return new GetBoughtProducts();
    }

    /**
     * Create an instance of {@link GetBoughtProductsResponse }
     * 
     */
    public GetBoughtProductsResponse createGetBoughtProductsResponse() {
        return new GetBoughtProductsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOwnedProductType }
     * 
     */
    public ArrayOfOwnedProductType createArrayOfOwnedProductType() {
        return new ArrayOfOwnedProductType();
    }

    /**
     * Create an instance of {@link GetAvailableProducts }
     * 
     */
    public GetAvailableProducts createGetAvailableProducts() {
        return new GetAvailableProducts();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link ProductDetails }
     * 
     */
    public ProductDetails createProductDetails() {
        return new ProductDetails();
    }

    /**
     * Create an instance of {@link LoginCustomer }
     * 
     */
    public LoginCustomer createLoginCustomer() {
        return new LoginCustomer();
    }

    /**
     * Create an instance of {@link GetAvailableProductsResponse }
     * 
     */
    public GetAvailableProductsResponse createGetAvailableProductsResponse() {
        return new GetAvailableProductsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProductType }
     * 
     */
    public ArrayOfProductType createArrayOfProductType() {
        return new ArrayOfProductType();
    }

    /**
     * Create an instance of {@link RegisterCustomerResponse }
     * 
     */
    public RegisterCustomerResponse createRegisterCustomerResponse() {
        return new RegisterCustomerResponse();
    }

    /**
     * Create an instance of {@link LoginCustomerResponse }
     * 
     */
    public LoginCustomerResponse createLoginCustomerResponse() {
        return new LoginCustomerResponse();
    }

    /**
     * Create an instance of {@link OwnedProductType }
     * 
     */
    public OwnedProductType createOwnedProductType() {
        return new OwnedProductType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnedProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ArrayOfOwnedProductType")
    public JAXBElement<ArrayOfOwnedProductType> createArrayOfOwnedProductType(ArrayOfOwnedProductType value) {
        return new JAXBElement<ArrayOfOwnedProductType>(_ArrayOfOwnedProductType_QNAME, ArrayOfOwnedProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ProductDetails")
    public JAXBElement<ProductDetails> createProductDetails(ProductDetails value) {
        return new JAXBElement<ProductDetails>(_ProductDetails_QNAME, ProductDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "LoginDetails")
    public JAXBElement<LoginDetails> createLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_LoginDetails_QNAME, LoginDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ArrayOfProductType")
    public JAXBElement<ArrayOfProductType> createArrayOfProductType(ArrayOfProductType value) {
        return new JAXBElement<ArrayOfProductType>(_ArrayOfProductType_QNAME, ArrayOfProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ProductType")
    public JAXBElement<ProductType> createProductType(ProductType value) {
        return new JAXBElement<ProductType>(_ProductType_QNAME, ProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnedProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "OwnedProductType")
    public JAXBElement<OwnedProductType> createOwnedProductType(OwnedProductType value) {
        return new JAXBElement<OwnedProductType>(_OwnedProductType_QNAME, OwnedProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "Name", scope = ProductDetails.class)
    public JAXBElement<String> createProductDetailsName(String value) {
        return new JAXBElement<String>(_ProductDetailsName_QNAME, String.class, ProductDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = BuyProduct.class)
    public JAXBElement<LoginDetails> createBuyProductLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "Content", scope = Message.class)
    public JAXBElement<String> createMessageContent(String value) {
        return new JAXBElement<String>(_MessageContent_QNAME, String.class, Message.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = RegisterCustomer.class)
    public JAXBElement<LoginDetails> createRegisterCustomerLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, RegisterCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ProductDetails", scope = ProductType.class)
    public JAXBElement<ProductDetails> createProductTypeProductDetails(ProductDetails value) {
        return new JAXBElement<ProductDetails>(_ProductDetails_QNAME, ProductDetails.class, ProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = GetBoughtProducts.class)
    public JAXBElement<LoginDetails> createGetBoughtProductsLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, GetBoughtProducts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAvailableProductsResult", scope = GetAvailableProductsResponse.class)
    public JAXBElement<ArrayOfProductType> createGetAvailableProductsResponseGetAvailableProductsResult(ArrayOfProductType value) {
        return new JAXBElement<ArrayOfProductType>(_GetAvailableProductsResponseGetAvailableProductsResult_QNAME, ArrayOfProductType.class, GetAvailableProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BuyProductResult", scope = BuyProductResponse.class)
    public JAXBElement<Message> createBuyProductResponseBuyProductResult(Message value) {
        return new JAXBElement<Message>(_BuyProductResponseBuyProductResult_QNAME, Message.class, BuyProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "ProductDetails", scope = OwnedProductType.class)
    public JAXBElement<ProductDetails> createOwnedProductTypeProductDetails(ProductDetails value) {
        return new JAXBElement<ProductDetails>(_ProductDetails_QNAME, ProductDetails.class, OwnedProductType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "Password", scope = LoginDetails.class)
    public JAXBElement<String> createLoginDetailsPassword(String value) {
        return new JAXBElement<String>(_LoginDetailsPassword_QNAME, String.class, LoginDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/FruitShopServiceLibrary", name = "Username", scope = LoginDetails.class)
    public JAXBElement<String> createLoginDetailsUsername(String value) {
        return new JAXBElement<String>(_LoginDetailsUsername_QNAME, String.class, LoginDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnedProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetBoughtProductsResult", scope = GetBoughtProductsResponse.class)
    public JAXBElement<ArrayOfOwnedProductType> createGetBoughtProductsResponseGetBoughtProductsResult(ArrayOfOwnedProductType value) {
        return new JAXBElement<ArrayOfOwnedProductType>(_GetBoughtProductsResponseGetBoughtProductsResult_QNAME, ArrayOfOwnedProductType.class, GetBoughtProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCustomerResult", scope = RegisterCustomerResponse.class)
    public JAXBElement<Message> createRegisterCustomerResponseRegisterCustomerResult(Message value) {
        return new JAXBElement<Message>(_RegisterCustomerResponseRegisterCustomerResult_QNAME, Message.class, RegisterCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = GetBalance.class)
    public JAXBElement<LoginDetails> createGetBalanceLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, GetBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = LoginCustomer.class)
    public JAXBElement<LoginDetails> createLoginCustomerLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, LoginCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginDetails", scope = AddProduct.class)
    public JAXBElement<LoginDetails> createAddProductLoginDetails(LoginDetails value) {
        return new JAXBElement<LoginDetails>(_BuyProductLoginDetails_QNAME, LoginDetails.class, AddProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productDetails", scope = AddProduct.class)
    public JAXBElement<ProductDetails> createAddProductProductDetails(ProductDetails value) {
        return new JAXBElement<ProductDetails>(_AddProductProductDetails_QNAME, ProductDetails.class, AddProduct.class, value);
    }

}
