//
//package com.pado.quickbookbridge.pojos;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import javax.xml.namespace.QName;
//import jakarta.xml.ws.Service;
//import jakarta.xml.ws.WebEndpoint;
//import jakarta.xml.ws.WebServiceClient;
//import jakarta.xml.ws.WebServiceException;
//import jakarta.xml.ws.WebServiceFeature;
//
//
///**
// * WebService for QBFS created using ASP.NET to troubleshoot QuickBooks WebConnector
// *
// * This class was generated by the JAX-WS RI.
// * JAX-WS RI 3.0.0
// * Generated source version: 3.0
// *
// */
//@WebServiceClient(name = "TroubleshootWebServiceFS", targetNamespace = "http://developer.intuit.com/", wsdlLocation = "file:/C:/Users/pado1/IdeaProjects/quickbookbridge/src/main/resources/quickbooks.wsdl")
//public class TroubleshootWebServiceFS
//    extends Service
//{
//
//    private final static URL TROUBLESHOOTWEBSERVICEFS_WSDL_LOCATION;
//    private final static WebServiceException TROUBLESHOOTWEBSERVICEFS_EXCEPTION;
//    private final static QName TROUBLESHOOTWEBSERVICEFS_QNAME = new QName("http://localhost:8083/QBWebService", "TroubleshootWebServiceFS");
//
//    static {
//        URL url = null;
//        WebServiceException e = null;
//        try {
//            url = new URL("file:/C:/Users/pado1/IdeaProjects/quickbookbridge/src/main/resources/quickbooks.wsdl");
//        } catch (MalformedURLException ex) {
//            e = new WebServiceException(ex);
//        }
//        TROUBLESHOOTWEBSERVICEFS_WSDL_LOCATION = url;
//        TROUBLESHOOTWEBSERVICEFS_EXCEPTION = e;
//    }
//
//    public TroubleshootWebServiceFS() {
//        super(__getWsdlLocation(), TROUBLESHOOTWEBSERVICEFS_QNAME);
//    }
//
//    public TroubleshootWebServiceFS(WebServiceFeature... features) {
//        super(__getWsdlLocation(), TROUBLESHOOTWEBSERVICEFS_QNAME, features);
//    }
//
//    public TroubleshootWebServiceFS(URL wsdlLocation) {
//        super(wsdlLocation, TROUBLESHOOTWEBSERVICEFS_QNAME);
//    }
//
//    public TroubleshootWebServiceFS(URL wsdlLocation, WebServiceFeature... features) {
//        super(wsdlLocation, TROUBLESHOOTWEBSERVICEFS_QNAME, features);
//    }
//
//    public TroubleshootWebServiceFS(URL wsdlLocation, QName serviceName) {
//        super(wsdlLocation, serviceName);
//    }
//
//    public TroubleshootWebServiceFS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
//        super(wsdlLocation, serviceName, features);
//    }
//
//    /**
//     *
//     * @return
//     *     returns TroubleshootWebServiceFSSoap
//     */
//    @WebEndpoint(name = "TroubleshootWebServiceFSSoap")
//    public TroubleshootWebServiceFSSoap getTroubleshootWebServiceFSSoap() {
//        return super.getPort(new QName("http://localhost:8083/QBWebService", "TroubleshootWebServiceFSSoap"), TroubleshootWebServiceFSSoap.class);
//    }
//
//    /**
//     *
//     * @param features
//     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
//     * @return
//     *     returns TroubleshootWebServiceFSSoap
//     */
//    @WebEndpoint(name = "TroubleshootWebServiceFSSoap")
//    public TroubleshootWebServiceFSSoap getTroubleshootWebServiceFSSoap(WebServiceFeature... features) {
//        return super.getPort(new QName("http://localhost:8083/QBWebService", "TroubleshootWebServiceFSSoap"), TroubleshootWebServiceFSSoap.class, features);
//    }
//
//    private static URL __getWsdlLocation() {
//        if (TROUBLESHOOTWEBSERVICEFS_EXCEPTION!= null) {
//            throw TROUBLESHOOTWEBSERVICEFS_EXCEPTION;
//        }
//        return TROUBLESHOOTWEBSERVICEFS_WSDL_LOCATION;
//    }
//
//}