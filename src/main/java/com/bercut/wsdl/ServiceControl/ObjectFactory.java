
package com.bercut.wsdl.ServiceControl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.bercut.wsdl.ServiceControl package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Mnc_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "mnc");
    private final static QName _Pagination_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "pagination");
    private final static QName _GeoCode_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "geoCode");
    private final static QName _Minute_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "minute");
    private final static QName _UserName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "userName");
    private final static QName _ServiceName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "serviceName");
    private final static QName _SubscriberCategory_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "subscriberCategory");
    private final static QName _UserIds_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "userIds");
    private final static QName _PstnNumber_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "pstnNumber");
    private final static QName _DateTimeStamp_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "dateTimeStamp");
    private final static QName _Namespace_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "namespace");
    private final static QName _ResourceTypeName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "resourceTypeName");
    private final static QName _UserAccessOperation_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "userAccessOperation");
    private final static QName _Code_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "code");
    private final static QName _RegionName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "regionName");
    private final static QName _SubscriberServiceId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "subscriberServiceId");
    private final static QName _Description_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "description");
    private final static QName _PrincipalContext_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "principalContext");
    private final static QName _ServiceIds_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "serviceIds");
    private final static QName _Duration_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "duration");
    private final static QName _YesNo_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "yesNo");
    private final static QName _ServiceStatus_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "serviceStatus");
    private final static QName _Dcs_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "dcs");
    private final static QName _Hour_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "hour");
    private final static QName _Mask_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "mask");
    private final static QName _ObjectId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "objectId");
    private final static QName _OperatorOwnerId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "operatorOwnerId");
    private final static QName _ServiceId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "serviceId");
    private final static QName _AnonymousAccessOperation_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "anonymousAccessOperation");
    private final static QName _Unknown_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "__unknown__");
    private final static QName _FaultCategory_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "faultCategory");
    private final static QName _SubscriberType_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "subscriberType");
    private final static QName _DefOwnerId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "defOwnerId");
    private final static QName _SubscriberChargingType_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "subscriberChargingType");
    private final static QName _RoutingNumberParts_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "routingNumberParts");
    private final static QName _EndDateTime_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "endDateTime");
    private final static QName _UniqueName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "uniqueName");
    private final static QName _JobId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "jobId");
    private final static QName _Month_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "month");
    private final static QName _CountryName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "countryName");
    private final static QName _Guid_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "guid");
    private final static QName _Name_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "name");
    private final static QName _ServiceTypeName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "serviceTypeName");
    private final static QName _SystemException_QNAME = new QName("http://www.bercut.com/schema/ServiceControl", "SystemException");
    private final static QName _UnstructuredPhoneNumber_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "unstructuredPhoneNumber");
    private final static QName _PageNumber_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "pageNumber");
    private final static QName _SubscriberServiceIds_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "subscriberServiceIds");
    private final static QName _DigitsId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "digitsId");
    private final static QName _TypeConsumption_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "typeConsumption");
    private final static QName _Operator_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "operator");
    private final static QName _Mcc_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "mcc");
    private final static QName _Percentage_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "percentage");
    private final static QName _TariffId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "tariffId");
    private final static QName _Tag_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "tag");
    private final static QName _ProductTypeName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "productTypeName");
    private final static QName _DayNumber_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "dayNumber");
    private final static QName _CredentialsElements_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "credentialsElements");
    private final static QName _ClientId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "clientId");
    private final static QName _ResourceComplexType_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "resourceComplexType");
    private final static QName _SubscriberFaultCategory_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "subscriberFaultCategory");
    private final static QName _RecordPerPage_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "recordPerPage");
    private final static QName _SessionId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "sessionId");
    private final static QName _Url_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "url");
    private final static QName _UserId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "userId");
    private final static QName _StartDateTime_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "startDateTime");
    private final static QName _TimeStamp_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "timeStamp");
    private final static QName _EndTime_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "endTime");
    private final static QName _BusinessException_QNAME = new QName("http://www.bercut.com/schema/ServiceControl", "BusinessException");
    private final static QName _Vlr_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "vlr");
    private final static QName _CurrencyCode_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "currencyCode");
    private final static QName _RubMoneyAmount_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "rubMoneyAmount");
    private final static QName _Regexp_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "regexp");
    private final static QName _SystemFault_QNAME = new QName("http://www.bercut.com/spec/schema/ServiceDefinition", "systemFault");
    private final static QName _MsisdnMask_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "msisdnMask");
    private final static QName _Imsi_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "imsi");
    private final static QName _Availability_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "availability");
    private final static QName _TypeName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "typeName");
    private final static QName _TwoDigitCode_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "twoDigitCode");
    private final static QName _OperatorName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "operatorName");
    private final static QName _Login_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "login");
    private final static QName _DayOfWeek_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "dayOfWeek");
    private final static QName _Xpath_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "xpath");
    private final static QName _CorrelationId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "correlationId");
    private final static QName _StartTime_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "startTime");
    private final static QName _ObjectNotFoundFault_QNAME = new QName("http://www.bercut.com/spec/schema/ServiceDefinition", "objectNotFoundFault");
    private final static QName _ThreeDigitCode_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "threeDigitCode");
    private final static QName _MoneyAmount_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "moneyAmount");
    private final static QName _ApplicationName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "applicationName");
    private final static QName _Email_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "email");
    private final static QName _VlrMask_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "vlrMask");
    private final static QName _RusRoutingNumberParts_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "rusRoutingNumberParts");
    private final static QName _ServiceIdentificators_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "serviceIdentificators");
    private final static QName _Msisdn_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "msisdn");
    private final static QName _RusRoutingNumber_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "rusRoutingNumber");
    private final static QName _Period_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "period");
    private final static QName _BranchId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "branchId");
    private final static QName _UserIdentificators_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "userIdentificators");
    private final static QName _ProductId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "productId");
    private final static QName _TimeZone_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "timeZone");
    private final static QName _ContractIds_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "contractIds");
    private final static QName _CommissionPercentage_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "commissionPercentage");
    private final static QName _Delay_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "delay");
    private final static QName _GroupName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "groupName");
    private final static QName _ResourceStatus_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "resourceStatus");
    private final static QName _SmsTextUnboundedSegments_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "smsTextUnboundedSegments");
    private final static QName _DayOfMonth_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "dayOfMonth");
    private final static QName _SettlementName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "settlementName");
    private final static QName _SwitchOnOff_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "switchOnOff");
    private final static QName _RoleName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "roleName");
    private final static QName _BillingId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "billingId");
    private final static QName _ResourceId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "resourceId");
    private final static QName _Fault_QNAME = new QName("http://www.bercut.com/schema/ServiceControl", "fault");
    private final static QName _JurTypeClient_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "jurTypeClient");
    private final static QName _BusinessFault_QNAME = new QName("http://www.bercut.com/spec/schema/ServiceDefinition", "businessFault");
    private final static QName _IncorrectFormatFault_QNAME = new QName("http://www.bercut.com/spec/schema/ServiceDefinition", "incorrectFormatFault");
    private final static QName _ProductName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "productName");
    private final static QName _AbstractParameter_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "abstractParameter");
    private final static QName _Password_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "password");
    private final static QName _InvoiceUserId_QNAME = new QName("http://www.bercut.com/spec/schema/ComplexDefinition", "invoiceUserId");
    private final static QName _Number_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "number");
    private final static QName _SystemName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "systemName");
    private final static QName _Text_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "text");
    private final static QName _TypeClientId_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "typeClientId");
    private final static QName _SchedulerName_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "schedulerName");
    private final static QName _FraudSuspicion_QNAME = new QName("http://www.bercut.com/spec/schema/SimpleDefinition", "fraudSuspicion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bercut.wsdl.ServiceControl
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceIdentificators }
     */
    public ServiceIdentificators createServiceIdentificators() {
        return new ServiceIdentificators();
    }

    /**
     * Create an instance of {@link CredentialsElements }
     */
    public CredentialsElements createCredentialsElements() {
        return new CredentialsElements();
    }

    /**
     * Create an instance of {@link RusRoutingNumberParts }
     */
    public RusRoutingNumberParts createRusRoutingNumberParts() {
        return new RusRoutingNumberParts();
    }

    /**
     * Create an instance of {@link InvoiceUserId }
     */
    public InvoiceUserId createInvoiceUserId() {
        return new InvoiceUserId();
    }

    /**
     * Create an instance of {@link AbstractParameter }
     */
    public AbstractParameter createAbstractParameter() {
        return new AbstractParameter();
    }

    /**
     * Create an instance of {@link RoutingNumberParts }
     */
    public RoutingNumberParts createRoutingNumberParts() {
        return new RoutingNumberParts();
    }

    /**
     * Create an instance of {@link PrincipalContext }
     */
    public PrincipalContext createPrincipalContext() {
        return new PrincipalContext();
    }

    /**
     * Create an instance of {@link SubscriberServiceIds }
     */
    public SubscriberServiceIds createSubscriberServiceIds() {
        return new SubscriberServiceIds();
    }

    /**
     * Create an instance of {@link SubscriberServiceIds.SubscriberServiceIdentificators }
     */
    public SubscriberServiceIds.SubscriberServiceIdentificators createSubscriberServiceIdsSubscriberServiceIdentificators() {
        return new SubscriberServiceIds.SubscriberServiceIdentificators();
    }

    /**
     * Create an instance of {@link SystemFault }
     */
    public SystemFault createSystemFault() {
        return new SystemFault();
    }

    /**
     * Create an instance of {@link SystemFault.StackTrace }
     */
    public SystemFault.StackTrace createSystemFaultStackTrace() {
        return new SystemFault.StackTrace();
    }

    /**
     * Create an instance of {@link SystemFault.StackTrace.Frame }
     */
    public SystemFault.StackTrace.Frame createSystemFaultStackTraceFrame() {
        return new SystemFault.StackTrace.Frame();
    }

    /**
     * Create an instance of {@link BusinessFault }
     */
    public BusinessFault createBusinessFault() {
        return new BusinessFault();
    }

    /**
     * Create an instance of {@link CheckActiveRequest }
     */
    public CheckActiveRequest createCheckActiveRequest() {
        return new CheckActiveRequest();
    }

    /**
     * Create an instance of {@link Subscriber }
     */
    public Subscriber createSubscriber() {
        return new Subscriber();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link Fault }
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link ChangeServiceRequest }
     */
    public ChangeServiceRequest createChangeServiceRequest() {
        return new ChangeServiceRequest();
    }

    /**
     * Create an instance of {@link CheckAbilityRequest }
     */
    public CheckAbilityRequest createCheckAbilityRequest() {
        return new CheckAbilityRequest();
    }

    /**
     * Create an instance of {@link Subs }
     */
    public Subs createSubs() {
        return new Subs();
    }

    /**
     * Create an instance of {@link Response }
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link InParams }
     */
    public InParams createInParams() {
        return new InParams();
    }

    /**
     * Create an instance of {@link Subscriber2 }
     */
    public Subscriber2 createSubscriber2() {
        return new Subscriber2();
    }

    /**
     * Create an instance of {@link Relust }
     */
    public Relust createRelust() {
        return new Relust();
    }

    /**
     * Create an instance of {@link Request }
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link ArrayList }
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link OutParams }
     */
    public OutParams createOutParams() {
        return new OutParams();
    }

    /**
     * Create an instance of {@link Modification }
     */
    public Modification createModification() {
        return new Modification();
    }

    /**
     * Create an instance of {@link Void }
     */
    public Void createVoid() {
        return new Void();
    }

    /**
     * Create an instance of {@link Pagination }
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link ResourceComplexType }
     */
    public ResourceComplexType createResourceComplexType() {
        return new ResourceComplexType();
    }

    /**
     * Create an instance of {@link ServiceIds }
     */
    public ServiceIds createServiceIds() {
        return new ServiceIds();
    }

    /**
     * Create an instance of {@link UserIds }
     */
    public UserIds createUserIds() {
        return new UserIds();
    }

    /**
     * Create an instance of {@link ServiceIdentificators.Extension }
     */
    public ServiceIdentificators.Extension createServiceIdentificatorsExtension() {
        return new ServiceIdentificators.Extension();
    }

    /**
     * Create an instance of {@link CredentialsElements.Extension }
     */
    public CredentialsElements.Extension createCredentialsElementsExtension() {
        return new CredentialsElements.Extension();
    }

    /**
     * Create an instance of {@link RusRoutingNumberParts.Extension }
     */
    public RusRoutingNumberParts.Extension createRusRoutingNumberPartsExtension() {
        return new RusRoutingNumberParts.Extension();
    }

    /**
     * Create an instance of {@link InvoiceUserId.Extension }
     */
    public InvoiceUserId.Extension createInvoiceUserIdExtension() {
        return new InvoiceUserId.Extension();
    }

    /**
     * Create an instance of {@link AbstractParameter.Extension }
     */
    public AbstractParameter.Extension createAbstractParameterExtension() {
        return new AbstractParameter.Extension();
    }

    /**
     * Create an instance of {@link RoutingNumberParts.Extension }
     */
    public RoutingNumberParts.Extension createRoutingNumberPartsExtension() {
        return new RoutingNumberParts.Extension();
    }

    /**
     * Create an instance of {@link PrincipalContext.Extension }
     */
    public PrincipalContext.Extension createPrincipalContextExtension() {
        return new PrincipalContext.Extension();
    }

    /**
     * Create an instance of {@link SubscriberServiceIds.SubscriberServiceIdentificators.Extension }
     */
    public SubscriberServiceIds.SubscriberServiceIdentificators.Extension createSubscriberServiceIdsSubscriberServiceIdentificatorsExtension() {
        return new SubscriberServiceIds.SubscriberServiceIdentificators.Extension();
    }

    /**
     * Create an instance of {@link SystemFault.Extension }
     */
    public SystemFault.Extension createSystemFaultExtension() {
        return new SystemFault.Extension();
    }

    /**
     * Create an instance of {@link SystemFault.StackTrace.Extension }
     */
    public SystemFault.StackTrace.Extension createSystemFaultStackTraceExtension() {
        return new SystemFault.StackTrace.Extension();
    }

    /**
     * Create an instance of {@link SystemFault.StackTrace.Frame.Extension }
     */
    public SystemFault.StackTrace.Frame.Extension createSystemFaultStackTraceFrameExtension() {
        return new SystemFault.StackTrace.Frame.Extension();
    }

    /**
     * Create an instance of {@link BusinessFault.Extension }
     */
    public BusinessFault.Extension createBusinessFaultExtension() {
        return new BusinessFault.Extension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "mnc")
    public JAXBElement<String> createMnc(String value) {
        return new JAXBElement<String>(_Mnc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "pagination")
    public JAXBElement<Pagination> createPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "geoCode")
    public JAXBElement<String> createGeoCode(String value) {
        return new JAXBElement<String>(_GeoCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "minute")
    public JAXBElement<Short> createMinute(Short value) {
        return new JAXBElement<Short>(_Minute_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "serviceName")
    public JAXBElement<String> createServiceName(String value) {
        return new JAXBElement<String>(_ServiceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "subscriberCategory")
    public JAXBElement<Long> createSubscriberCategory(Long value) {
        return new JAXBElement<Long>(_SubscriberCategory_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserIds }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "userIds")
    public JAXBElement<UserIds> createUserIds(UserIds value) {
        return new JAXBElement<UserIds>(_UserIds_QNAME, UserIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "pstnNumber")
    public JAXBElement<String> createPstnNumber(String value) {
        return new JAXBElement<String>(_PstnNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "dateTimeStamp")
    public JAXBElement<XMLGregorianCalendar> createDateTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "namespace")
    public JAXBElement<String> createNamespace(String value) {
        return new JAXBElement<String>(_Namespace_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "resourceTypeName")
    public JAXBElement<String> createResourceTypeName(String value) {
        return new JAXBElement<String>(_ResourceTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrudOperation }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "userAccessOperation")
    public JAXBElement<CrudOperation> createUserAccessOperation(CrudOperation value) {
        return new JAXBElement<CrudOperation>(_UserAccessOperation_QNAME, CrudOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "regionName")
    public JAXBElement<String> createRegionName(String value) {
        return new JAXBElement<String>(_RegionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "subscriberServiceId")
    public JAXBElement<Long> createSubscriberServiceId(Long value) {
        return new JAXBElement<Long>(_SubscriberServiceId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalContext }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "principalContext")
    public JAXBElement<PrincipalContext> createPrincipalContext(PrincipalContext value) {
        return new JAXBElement<PrincipalContext>(_PrincipalContext_QNAME, PrincipalContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIds }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "serviceIds")
    public JAXBElement<ServiceIds> createServiceIds(ServiceIds value) {
        return new JAXBElement<ServiceIds>(_ServiceIds_QNAME, ServiceIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "yesNo")
    public JAXBElement<Boolean> createYesNo(Boolean value) {
        return new JAXBElement<Boolean>(_YesNo_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "serviceStatus", defaultValue = "unactive")
    public JAXBElement<ServiceStatus> createServiceStatus(ServiceStatus value) {
        return new JAXBElement<ServiceStatus>(_ServiceStatus_QNAME, ServiceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "dcs")
    public JAXBElement<Byte> createDcs(Byte value) {
        return new JAXBElement<Byte>(_Dcs_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "hour")
    public JAXBElement<Short> createHour(Short value) {
        return new JAXBElement<Short>(_Hour_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "mask")
    public JAXBElement<String> createMask(String value) {
        return new JAXBElement<String>(_Mask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "objectId")
    public JAXBElement<Long> createObjectId(Long value) {
        return new JAXBElement<Long>(_ObjectId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "operatorOwnerId")
    public JAXBElement<String> createOperatorOwnerId(String value) {
        return new JAXBElement<String>(_OperatorOwnerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "serviceId")
    public JAXBElement<Long> createServiceId(Long value) {
        return new JAXBElement<Long>(_ServiceId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrudOperation }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "anonymousAccessOperation")
    public JAXBElement<CrudOperation> createAnonymousAccessOperation(CrudOperation value) {
        return new JAXBElement<CrudOperation>(_AnonymousAccessOperation_QNAME, CrudOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "__unknown__")
    public JAXBElement<Object> createUnknown(Object value) {
        return new JAXBElement<Object>(_Unknown_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultCategory }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "faultCategory", defaultValue = "error")
    public JAXBElement<FaultCategory> createFaultCategory(FaultCategory value) {
        return new JAXBElement<FaultCategory>(_FaultCategory_QNAME, FaultCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "subscriberType")
    public JAXBElement<Long> createSubscriberType(Long value) {
        return new JAXBElement<Long>(_SubscriberType_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "defOwnerId")
    public JAXBElement<String> createDefOwnerId(String value) {
        return new JAXBElement<String>(_DefOwnerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberChargingType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "subscriberChargingType", defaultValue = "prepaid")
    public JAXBElement<SubscriberChargingType> createSubscriberChargingType(SubscriberChargingType value) {
        return new JAXBElement<SubscriberChargingType>(_SubscriberChargingType_QNAME, SubscriberChargingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingNumberParts }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "routingNumberParts")
    public JAXBElement<RoutingNumberParts> createRoutingNumberParts(RoutingNumberParts value) {
        return new JAXBElement<RoutingNumberParts>(_RoutingNumberParts_QNAME, RoutingNumberParts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "endDateTime")
    public JAXBElement<XMLGregorianCalendar> createEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "uniqueName")
    public JAXBElement<String> createUniqueName(String value) {
        return new JAXBElement<String>(_UniqueName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "jobId")
    public JAXBElement<Long> createJobId(Long value) {
        return new JAXBElement<Long>(_JobId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Month }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "month")
    public JAXBElement<Month> createMonth(Month value) {
        return new JAXBElement<Month>(_Month_QNAME, Month.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "countryName")
    public JAXBElement<String> createCountryName(String value) {
        return new JAXBElement<String>(_CountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "serviceTypeName")
    public JAXBElement<String> createServiceTypeName(String value) {
        return new JAXBElement<String>(_ServiceTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/schema/ServiceControl", name = "SystemException")
    public JAXBElement<SystemFault> createSystemException(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemException_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "unstructuredPhoneNumber")
    public JAXBElement<String> createUnstructuredPhoneNumber(String value) {
        return new JAXBElement<String>(_UnstructuredPhoneNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "pageNumber")
    public JAXBElement<Long> createPageNumber(Long value) {
        return new JAXBElement<Long>(_PageNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscriberServiceIds }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "subscriberServiceIds")
    public JAXBElement<SubscriberServiceIds> createSubscriberServiceIds(SubscriberServiceIds value) {
        return new JAXBElement<SubscriberServiceIds>(_SubscriberServiceIds_QNAME, SubscriberServiceIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "digitsId")
    public JAXBElement<Long> createDigitsId(Long value) {
        return new JAXBElement<Long>(_DigitsId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "typeConsumption")
    public JAXBElement<Long> createTypeConsumption(Long value) {
        return new JAXBElement<Long>(_TypeConsumption_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operator }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "operator")
    public JAXBElement<Operator> createOperator(Operator value) {
        return new JAXBElement<Operator>(_Operator_QNAME, Operator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "mcc")
    public JAXBElement<String> createMcc(String value) {
        return new JAXBElement<String>(_Mcc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "percentage")
    public JAXBElement<Long> createPercentage(Long value) {
        return new JAXBElement<Long>(_Percentage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "tariffId")
    public JAXBElement<Long> createTariffId(Long value) {
        return new JAXBElement<Long>(_TariffId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "tag", defaultValue = "create")
    public JAXBElement<String> createTag(String value) {
        return new JAXBElement<String>(_Tag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "productTypeName")
    public JAXBElement<String> createProductTypeName(String value) {
        return new JAXBElement<String>(_ProductTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "dayNumber")
    public JAXBElement<Long> createDayNumber(Long value) {
        return new JAXBElement<Long>(_DayNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CredentialsElements }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "credentialsElements")
    public JAXBElement<CredentialsElements> createCredentialsElements(CredentialsElements value) {
        return new JAXBElement<CredentialsElements>(_CredentialsElements_QNAME, CredentialsElements.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "clientId")
    public JAXBElement<Long> createClientId(Long value) {
        return new JAXBElement<Long>(_ClientId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceComplexType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "resourceComplexType")
    public JAXBElement<ResourceComplexType> createResourceComplexType(ResourceComplexType value) {
        return new JAXBElement<ResourceComplexType>(_ResourceComplexType_QNAME, ResourceComplexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "subscriberFaultCategory")
    public JAXBElement<Long> createSubscriberFaultCategory(Long value) {
        return new JAXBElement<Long>(_SubscriberFaultCategory_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "recordPerPage")
    public JAXBElement<Long> createRecordPerPage(Long value) {
        return new JAXBElement<Long>(_RecordPerPage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "userId")
    public JAXBElement<Long> createUserId(Long value) {
        return new JAXBElement<Long>(_UserId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "startDateTime")
    public JAXBElement<XMLGregorianCalendar> createStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "timeStamp")
    public JAXBElement<XMLGregorianCalendar> createTimeStamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TimeStamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "endTime")
    public JAXBElement<XMLGregorianCalendar> createEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/schema/ServiceControl", name = "BusinessException")
    public JAXBElement<BusinessFault> createBusinessException(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_BusinessException_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "vlr")
    public JAXBElement<String> createVlr(String value) {
        return new JAXBElement<String>(_Vlr_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCode }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "currencyCode")
    public JAXBElement<CurrencyCode> createCurrencyCode(CurrencyCode value) {
        return new JAXBElement<CurrencyCode>(_CurrencyCode_QNAME, CurrencyCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "rubMoneyAmount")
    public JAXBElement<BigDecimal> createRubMoneyAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubMoneyAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "regexp")
    public JAXBElement<String> createRegexp(String value) {
        return new JAXBElement<String>(_Regexp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ServiceDefinition", name = "systemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "msisdnMask")
    public JAXBElement<String> createMsisdnMask(String value) {
        return new JAXBElement<String>(_MsisdnMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "imsi")
    public JAXBElement<String> createImsi(String value) {
        return new JAXBElement<String>(_Imsi_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "availability")
    public JAXBElement<Boolean> createAvailability(Boolean value) {
        return new JAXBElement<Boolean>(_Availability_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "typeName")
    public JAXBElement<String> createTypeName(String value) {
        return new JAXBElement<String>(_TypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "twoDigitCode")
    public JAXBElement<String> createTwoDigitCode(String value) {
        return new JAXBElement<String>(_TwoDigitCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "operatorName")
    public JAXBElement<String> createOperatorName(String value) {
        return new JAXBElement<String>(_OperatorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "login")
    public JAXBElement<String> createLogin(String value) {
        return new JAXBElement<String>(_Login_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayOfWeek }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "dayOfWeek")
    public JAXBElement<DayOfWeek> createDayOfWeek(DayOfWeek value) {
        return new JAXBElement<DayOfWeek>(_DayOfWeek_QNAME, DayOfWeek.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "xpath", defaultValue = "/")
    public JAXBElement<String> createXpath(String value) {
        return new JAXBElement<String>(_Xpath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "correlationId")
    public JAXBElement<String> createCorrelationId(String value) {
        return new JAXBElement<String>(_CorrelationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "startTime")
    public JAXBElement<XMLGregorianCalendar> createStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ServiceDefinition", name = "objectNotFoundFault")
    public JAXBElement<BusinessFault> createObjectNotFoundFault(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_ObjectNotFoundFault_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "threeDigitCode")
    public JAXBElement<String> createThreeDigitCode(String value) {
        return new JAXBElement<String>(_ThreeDigitCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "moneyAmount")
    public JAXBElement<BigDecimal> createMoneyAmount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MoneyAmount_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "applicationName")
    public JAXBElement<String> createApplicationName(String value) {
        return new JAXBElement<String>(_ApplicationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "email")
    public JAXBElement<String> createEmail(String value) {
        return new JAXBElement<String>(_Email_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "vlrMask")
    public JAXBElement<String> createVlrMask(String value) {
        return new JAXBElement<String>(_VlrMask_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RusRoutingNumberParts }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "rusRoutingNumberParts")
    public JAXBElement<RusRoutingNumberParts> createRusRoutingNumberParts(RusRoutingNumberParts value) {
        return new JAXBElement<RusRoutingNumberParts>(_RusRoutingNumberParts_QNAME, RusRoutingNumberParts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIdentificators }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "serviceIdentificators")
    public JAXBElement<ServiceIdentificators> createServiceIdentificators(ServiceIdentificators value) {
        return new JAXBElement<ServiceIdentificators>(_ServiceIdentificators_QNAME, ServiceIdentificators.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "msisdn")
    public JAXBElement<String> createMsisdn(String value) {
        return new JAXBElement<String>(_Msisdn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "rusRoutingNumber")
    public JAXBElement<String> createRusRoutingNumber(String value) {
        return new JAXBElement<String>(_RusRoutingNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "period")
    public JAXBElement<Duration> createPeriod(Duration value) {
        return new JAXBElement<Duration>(_Period_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "branchId")
    public JAXBElement<Long> createBranchId(Long value) {
        return new JAXBElement<Long>(_BranchId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "productId")
    public JAXBElement<Long> createProductId(Long value) {
        return new JAXBElement<Long>(_ProductId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "timeZone")
    public JAXBElement<Duration> createTimeZone(Duration value) {
        return new JAXBElement<Duration>(_TimeZone_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractIds }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "contractIds")
    public JAXBElement<ContractIds> createContractIds(ContractIds value) {
        return new JAXBElement<ContractIds>(_ContractIds_QNAME, ContractIds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "commissionPercentage")
    public JAXBElement<Long> createCommissionPercentage(Long value) {
        return new JAXBElement<Long>(_CommissionPercentage_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "delay")
    public JAXBElement<Duration> createDelay(Duration value) {
        return new JAXBElement<Duration>(_Delay_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "groupName")
    public JAXBElement<String> createGroupName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "resourceStatus", defaultValue = "active")
    public JAXBElement<ResourceStatus> createResourceStatus(ResourceStatus value) {
        return new JAXBElement<ResourceStatus>(_ResourceStatus_QNAME, ResourceStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "smsTextUnboundedSegments")
    public JAXBElement<String> createSmsTextUnboundedSegments(String value) {
        return new JAXBElement<String>(_SmsTextUnboundedSegments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "dayOfMonth")
    public JAXBElement<Short> createDayOfMonth(Short value) {
        return new JAXBElement<Short>(_DayOfMonth_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "settlementName")
    public JAXBElement<String> createSettlementName(String value) {
        return new JAXBElement<String>(_SettlementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "switchOnOff")
    public JAXBElement<Boolean> createSwitchOnOff(Boolean value) {
        return new JAXBElement<Boolean>(_SwitchOnOff_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "roleName")
    public JAXBElement<String> createRoleName(String value) {
        return new JAXBElement<String>(_RoleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "billingId")
    public JAXBElement<Long> createBillingId(Long value) {
        return new JAXBElement<Long>(_BillingId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "resourceId")
    public JAXBElement<String> createResourceId(String value) {
        return new JAXBElement<String>(_ResourceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/schema/ServiceControl", name = "fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "jurTypeClient")
    public JAXBElement<Long> createJurTypeClient(Long value) {
        return new JAXBElement<Long>(_JurTypeClient_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ServiceDefinition", name = "businessFault")
    public JAXBElement<BusinessFault> createBusinessFault(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_BusinessFault_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessFault }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ServiceDefinition", name = "incorrectFormatFault")
    public JAXBElement<BusinessFault> createIncorrectFormatFault(BusinessFault value) {
        return new JAXBElement<BusinessFault>(_IncorrectFormatFault_QNAME, BusinessFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "productName")
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractParameter }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "abstractParameter")
    public JAXBElement<AbstractParameter> createAbstractParameter(AbstractParameter value) {
        return new JAXBElement<AbstractParameter>(_AbstractParameter_QNAME, AbstractParameter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceUserId }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/ComplexDefinition", name = "invoiceUserId")
    public JAXBElement<InvoiceUserId> createInvoiceUserId(InvoiceUserId value) {
        return new JAXBElement<InvoiceUserId>(_InvoiceUserId_QNAME, InvoiceUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "number")
    public JAXBElement<Long> createNumber(Long value) {
        return new JAXBElement<Long>(_Number_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "systemName")
    public JAXBElement<String> createSystemName(String value) {
        return new JAXBElement<String>(_SystemName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "typeClientId")
    public JAXBElement<Long> createTypeClientId(Long value) {
        return new JAXBElement<Long>(_TypeClientId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "schedulerName")
    public JAXBElement<String> createSchedulerName(String value) {
        return new JAXBElement<String>(_SchedulerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bercut.com/spec/schema/SimpleDefinition", name = "fraudSuspicion")
    public JAXBElement<Boolean> createFraudSuspicion(Boolean value) {
        return new JAXBElement<Boolean>(_FraudSuspicion_QNAME, Boolean.class, null, value);
    }

}
