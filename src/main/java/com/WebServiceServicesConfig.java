package com;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

@EnableWs
@Configuration
public class WebServiceServicesConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean dispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "services")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchemaCollection schemaCollection) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ServiceControlPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://www.bercut.com/wsdl/ServiceControl");
        //wsdl11Definition.setSchema(servicesSchema);
        wsdl11Definition.setSchemaCollection(schemaCollection);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchemaCollection schemaCollection() {
        Resource[] resources = {
                new ClassPathResource("xsd/ServiceControl.xsd"),
                new ClassPathResource("xsd/commonCareMDefinitions.xsd"),
                new ClassPathResource("xsd/SimpleDefinition.xsd"),
                new ClassPathResource("xsd/ServiceDefinition.xsd"),
                //new ClassPathResource("xsd/ComplexDefinition.xsd")
        };
        return new CommonsXsdSchemaCollection(resources);
    }
}
