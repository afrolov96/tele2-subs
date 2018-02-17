
package com.bercut.wsdl.ServiceControl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceControlPortType", targetNamespace = "http://www.bercut.com/wsdl/ServiceControl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceControlPortType {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.bercut.wsdl.ServiceControl.ServiceResponse
     * @throws SystemFault_Exception
     * @throws CheckAbilityFault
     * @throws Fault_Exception
     */
    @WebMethod
    @WebResult(name = "serviceResponse", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
    public ServiceResponse checkAbility(
        @WebParam(name = "checkAbilityRequest", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
        CheckAbilityRequest parameters)
        throws CheckAbilityFault, Fault_Exception, SystemFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.bercut.wsdl.ServiceControl.ServiceResponse
     * @throws SystemFault_Exception
     * @throws ChangeServiceFault
     * @throws Fault_Exception
     */
    @WebMethod
    @WebResult(name = "serviceResponse", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
    public ServiceResponse changeService(
        @WebParam(name = "changeServiceRequest", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
        ChangeServiceRequest parameters)
        throws ChangeServiceFault, Fault_Exception, SystemFault_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns com.bercut.wsdl.ServiceControl.ServiceResponse
     * @throws CheckActiveFault
     * @throws SystemFault_Exception
     * @throws Fault_Exception
     */
    @WebMethod
    @WebResult(name = "serviceResponse", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
    public ServiceResponse checkActive(
        @WebParam(name = "checkActiveRequest", targetNamespace = "http://www.bercut.com/schema/ServiceControl", partName = "parameters")
        CheckActiveRequest parameters)
        throws CheckActiveFault, Fault_Exception, SystemFault_Exception
    ;

}