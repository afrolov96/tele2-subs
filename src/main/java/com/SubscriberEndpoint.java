package com;

import com.bercut.specs.aoi.tele2.subscribercontrolbpel.GetSubsInfoMSISDNRequest;
import com.bercut.specs.aoi.tele2.subscribercontrolbpel.SubscriberControlResponse;
import com.bercut.wsdl.ServiceControl.ChangeServiceRequest;
import com.bercut.wsdl.ServiceControl.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.math.BigInteger;

@Endpoint
public class SubscriberEndpoint {
    private static final String SUBSCRIBERS_NAMESPACE_URI = "http://www.bercut.com/specs/aoi/tele2/SubscriberControlBpel";
    private static final String SERVICES_NAMESPACE_URI = "http://www.bercut.com/schema/ServiceControl";
    private SubscribersRepository subscribersRepository;
    private SubscribersRepository servicesRepository;

    @Autowired
    public SubscriberEndpoint(SubscribersRepository subscribersRepository) {
        this.subscribersRepository = subscribersRepository;
    }

    @PayloadRoot(namespace = SUBSCRIBERS_NAMESPACE_URI, localPart = "GetSubsInfoMSISDNRequest")
    @ResponsePayload
    public SubscriberControlResponse getSubsInfoMSISDN(@RequestPayload GetSubsInfoMSISDNRequest request) {
        SubscriberControlResponse response = new SubscriberControlResponse();
        response.getParam().add(subscribersRepository.findSubscriber(request.getMsisdn()));
        System.out.println(">>>> GetSubsInfoMSISDNRequest");
        return response;
    }

    @PayloadRoot(namespace = SERVICES_NAMESPACE_URI, localPart = "changeServiceRequest")
    @ResponsePayload
    public ServiceResponse changeService(@RequestPayload ChangeServiceRequest request) {
        ServiceResponse response = new ServiceResponse();
        response.setCode(BigInteger.valueOf(0));
        response.setDescription("Test_Description");
        System.out.println(">>>> changeService");
        return response;
    }
}
