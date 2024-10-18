package com.pado.quickbookbridge.configurations;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.transport.http.ClientHttpRequestMessageSender;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;


@Configuration
@EnableWs
public class WebServiceConfigurations  {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean<>(servlet, "/QBWebService/*");
    }

    @Bean
    public SimpleWsdl11Definition quickbooks() {
        return new SimpleWsdl11Definition(new ClassPathResource("quickbooks.wsdl"));
    }

    @Bean
    public ClientInterceptor[] interceptors() {
        return new ClientInterceptor[] { new ClientInterceptor() {
            @Override
            public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
                System.out.println(messageContext.getRequest().toString());
                return false;
            }

            @Override
            public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
                return false;
            }

            @Override
            public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
                return false;
            }

            @Override
            public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

            }
        } };
    }

    @Bean
    public ClientHttpRequestMessageSender clientHttpRequestMessageSender(RestTemplateBuilder builder) {
        return new ClientHttpRequestMessageSender();
    }



}
